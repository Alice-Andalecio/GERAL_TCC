package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IGrupoAlimentoDietaDAO;
import br.cefetmg.inf.geral.model.domain.GrupoAlimentoDieta;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GrupoAlimentoDietaDAO implements IGrupoAlimentoDietaDAO {

    @Override
    public Long inserir(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO controleProducao (per_Composicao) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, grupoAlimentoDieta.getPer_Composicao());
            ResultSet rs = pstmt.executeQuery();

            Long cod_Grupo = null;
            if (rs.next()) {
                cod_Grupo = new Long(rs.getLong("cod_Grupo"));
                grupoAlimentoDieta.setCod_Grupo(cod_Grupo);
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
    public boolean atualizar(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();
            String sql = "UPDATE grupoAlimentoDieta "
                    + " SET per_Composicao = ?, "
                    + " WHERE cod_Grupo = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, grupoAlimentoDieta.getPer_Composicao());
            pstmt.setLong(2, grupoAlimentoDieta.getCod_Grupo());
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
    public boolean delete(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM grupoAlimentoDieta WHERE cod_Grupo = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, grupoAlimentoDieta.getPer_Composicao());
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
    public ArrayList<GrupoAlimentoDieta> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM comprador ORDER BY cod_CNPJ";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<GrupoAlimentoDieta> listAll = null;
            IGrupoAlimentoDietaDAO grupoAlimentoDietaDAO = new GrupoAlimentoDietaDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    GrupoAlimentoDieta grupoAlimentoDieta = new GrupoAlimentoDieta();
                    grupoAlimentoDieta.setCod_Grupo(rs.getLong("cod_Grupo"));
                    grupoAlimentoDieta.setPer_Composicao(rs.getDouble("per_Composicao"));

                    listAll.add(grupoAlimentoDieta);
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
    public GrupoAlimentoDieta consultarPorCod(Long cod) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM grupoAlimentoDieta WHERE cod_Grupo = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, cod);
            ResultSet rs = pstmt.executeQuery();

            GrupoAlimentoDieta grupoAlimentoDieta = null;
            IGrupoAlimentoDietaDAO grupoAlimentoDietaDAO = new GrupoAlimentoDietaDAO();
            if (rs.next()) {
                grupoAlimentoDietaDAO = new GrupoAlimentoDietaDAO();
                grupoAlimentoDieta.setCod_Grupo(rs.getLong("cod_Grupo"));
                grupoAlimentoDieta.setPer_Composicao(rs.getDouble("per_Composicao"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return grupoAlimentoDieta;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}
