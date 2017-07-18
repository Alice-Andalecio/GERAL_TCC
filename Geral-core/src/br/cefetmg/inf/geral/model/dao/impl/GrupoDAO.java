package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IGrupoDAO;
import br.cefetmg.inf.geral.model.domain.Grupo;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GrupoDAO implements IGrupoDAO {

    @Override
    public Long inserir(Grupo grupo) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO grupo (nom_Grupo, qtd_Media_Producao) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, grupo.getQtd_Media_Producao());
            pstmt.setString(2, grupo.getNom_Grupo());
            ResultSet rs = pstmt.executeQuery();

            Long cod_Grupo = null;
            if (rs.next()) {
                cod_Grupo = new Long(rs.getLong("cod_Grupo"));
                grupo.setCod_Grupo(cod_Grupo);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return cod_Grupo;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(Grupo grupo) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();
            String sql = "UPDATE grupo"
                    + " SET  qtd_Media_Producao = ?, "
                    + " SET nom_Grupo = ?, "
                    + " WHERE cod_Grupo = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, grupo.getQtd_Media_Producao());
            pstmt.setString(2, grupo.getNom_Grupo());
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
    public boolean delete(Grupo grupo) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM grupo WHERE cod_Grupo = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, grupo.getQtd_Media_Producao());
            pstmt.setString(2, grupo.getNom_Grupo());
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
    public ArrayList<Grupo> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM grupo ORDER BY cod_Grupo";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Grupo> listAll = null;
            IGrupoDAO grupoDAO = new GrupoDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Grupo grupo = new Grupo();
                    grupo.setCod_Grupo(rs.getLong("cod_Grupo"));
                    grupo.setQtd_Media_Producao(rs.getDouble("qtd_Media_Producao"));

                    listAll.add(grupo);
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
    public Grupo consultarPorCod(Long cod) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM grupoAlimentoDieta WHERE cod_Grupo = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, cod);
            ResultSet rs = pstmt.executeQuery();

            Grupo grupo = null;
            IGrupoDAO grupoDAO = new GrupoDAO();
            if (rs.next()) {
                grupoDAO = new GrupoDAO();
                grupo.setCod_Grupo(rs.getLong("cod_Grupo"));
                grupo.setQtd_Media_Producao(rs.getDouble("qtd_Media_Producao"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return grupo;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}