package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.ISetorDAO;
import br.cefetmg.inf.geral.model.domain.Setor;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SetorDAO implements ISetorDAO {

    @Override
    public Long inserir(Setor setor) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO setor (nom_Setor) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, setor.getNom_setor());
            ResultSet rs = pstmt.executeQuery();

            Long cod_Setor = null;
            if (rs.next()) {
                cod_Setor = new Long(rs.getLong("cod_Setor"));
                setor.setCod_setor(cod_Setor);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return cod_Setor;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(Setor setor) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();
            String sql = "UPDATE setor"
                    + " SET  nom_Setor = ?, "
                    + " WHERE cod_Setor= ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, setor.getNom_setor());
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
    public boolean delete(Setor setor) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM setor WHERE cod_Setor = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, setor.getNom_setor());
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
    public ArrayList<Setor> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM setor ORDER BY cod_Setor";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Setor> listAll = null;
            ISetorDAO setorDAO = new SetorDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Setor setor = new Setor();
                    setor.setCod_setor(rs.getLong("cod_Setor"));
                    setor.setNom_setor(rs.getString("nom_Setor"));

                    listAll.add(setor);
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
    public Setor consultarPorCod(Long cod) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM vacina WHERE cod_Vacina = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, cod);
            ResultSet rs = pstmt.executeQuery();

            Setor setor = null;
            ISetorDAO setorDAO = new SetorDAO();
            if (rs.next()) {
                setorDAO = new SetorDAO();
                setor.setCod_setor(rs.getLong("cod_Setor"));
                setor.setNom_setor(rs.getString("nom_Setor"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return setor;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}
