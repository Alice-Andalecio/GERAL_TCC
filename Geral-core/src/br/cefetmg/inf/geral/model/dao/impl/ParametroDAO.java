package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IParametroDAO;
import br.cefetmg.inf.geral.model.domain.Parametro;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ParametroDAO implements IParametroDAO {

    @Override
    public String inserir(Parametro parametro) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO parametro (qtd_Dia_Secagem, qtd_Dia_Amamentacao) VALUES(?,?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, parametro.getQtd_Dia_Secagem());
            pstmt.setLong(2, parametro.getQtd_Dia_Amamentacao());

            ResultSet rs = pstmt.executeQuery();

            String cod = null;
            if (rs.next()) {
                cod = new String(rs.getString("cod_Parametro"));
                parametro.setCod_Parametro(cod);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return cod;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(Parametro parametro) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE parametro "
                    + " SET qtd_Dia_Secagem = ?"
                    + "     qtd_Dia_Amamentacao = ?"
                    + " WHERE cod_Parametro = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, parametro.getQtd_Dia_Secagem());
            pstmt.setLong(2, parametro.getQtd_Dia_Amamentacao());
            pstmt.setString(3, parametro.getCod_Parametro());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean delete(Parametro parametro) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM parametro WHERE cod_Parametro = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, parametro.getCod_Parametro());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public ArrayList<Parametro> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM parametro ORDER BY cod_Parametro";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Parametro> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Parametro parametro = new Parametro();
                    parametro.setCod_Parametro(rs.getString("cod_Parametro"));
                    parametro.setQtd_Dia_Secagem(rs.getLong("qtd_Dia_Secagem"));
                    parametro.setQtd_Dia_Amamentacao(rs.getLong("qtd_Dia_Amamentacao"));
                    listAll.add(parametro);
                } while (rs.next());
            }

            rs.close();
            pstmt.close();
            connection.close();

            return listAll;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public Parametro consultarPorCod(String cod) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM parametro WHERE cod_parametro = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cod);
            ResultSet rs = pstmt.executeQuery();

            Parametro parametro = null;
            if (rs.next()) {
                parametro = new Parametro();
                parametro.setCod_Parametro(rs.getString("cod_Parametro"));
                parametro.setQtd_Dia_Secagem(rs.getLong("qtd_Dia_Secagem"));
                parametro.setQtd_Dia_Amamentacao(rs.getLong("qtd_Dia_Amamentacao"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return parametro;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

}
