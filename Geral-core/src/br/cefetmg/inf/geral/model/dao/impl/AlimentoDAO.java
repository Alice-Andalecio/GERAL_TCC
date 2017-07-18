package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IAlimentoDAO;
import br.cefetmg.inf.geral.model.domain.Alimento;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlimentoDAO implements IAlimentoDAO{

    @Override
    public Long inserir(Alimento alimento) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO alimento (des_alimento) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, alimento.getDes_Alimento());
            ResultSet rs = pstmt.executeQuery();

            Long cod_Alimento = null;
            if (rs.next()) {
                cod_Alimento = new Long(rs.getLong("cod_Alimento"));
                alimento.setCod_alimento(cod_Alimento);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return cod_Alimento;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(Alimento alimento) throws PersistenciaException {
         try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE alimento "
                    + " SET des_Alimento = ?, "
                    + " WHERE cod_Alimento = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, alimento.getDes_Alimento());
            pstmt.setLong(2, alimento.getCod_alimento());
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
    public boolean delete(Alimento alimento) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM animal WHERE cod_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, alimento.getCod_alimento());
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
    public ArrayList<Alimento> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM animal ORDER BY cod_Animal";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Alimento> listAll = null;
            IAlimentoDAO alimentoDAO = new AlimentoDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Alimento alimento = new Alimento();
                    alimento.setCod_alimento(rs.getLong("cod_Alimento"));
                    alimento.setDes_Alimento(rs.getString("Des_Alimento"));
                    listAll.add(alimento);
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
    public Alimento consultarPorCod(Long cod) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM animal WHERE cod_Alimento = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, cod);
            ResultSet rs = pstmt.executeQuery();

            Alimento alimento = null;
            IAlimentoDAO alimentoDAO = new AlimentoDAO();
            if (rs.next()) {
                alimento = new Alimento();
                alimento.setCod_alimento(rs.getLong("cod_Alimento"));
                alimento.setDes_Alimento(rs.getString("des_alimento"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return alimento;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    } 
}