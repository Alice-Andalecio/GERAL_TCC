package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IGrupoAlimentoDietaDAO;
import br.cefetmg.inf.geral.model.domain.GrupoAlimentoDieta;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrupoAlimentoDietaDAO implements IGrupoAlimentoDietaDAO {

    public GrupoAlimentoDietaDAO() {
    }

    @Override
    public void inserir(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO grupo_alimento_dieta (cod_grupo, alimento, dat_dieta, qtd_manha_kg, qtd_tarde_kg, txt_obs) VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, grupoAlimentoDieta.getCod_Grupo());
            pstmt.setLong(2, grupoAlimentoDieta.getCod_Alimento());
            pstmt.setDate(3, grupoAlimentoDieta.getDat_dieta());
            pstmt.setDouble(4, grupoAlimentoDieta.getQtd_manha_kg());
            pstmt.setDouble(5, grupoAlimentoDieta.getQtd_tarde_kg());
            pstmt.setString(6, grupoAlimentoDieta.getTxt_obs());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();

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
                    + " SET qtd_manha_kg = ?, "
                    + " SET qtd_tarde_kg = ? "
                    + " SET txt_obs = ?"
                    + " WHERE dat_dieta = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, grupoAlimentoDieta.getQtd_manha_kg());
            pstmt.setDouble(2, grupoAlimentoDieta.getQtd_tarde_kg());
            pstmt.setDate(3, grupoAlimentoDieta.getDat_dieta());
            pstmt.setString(4, grupoAlimentoDieta.getTxt_obs());
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

            String sql = "DELETE FROM grupoAlimentoDieta WHERE dat_dieta = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, grupoAlimentoDieta.getQtd_manha_kg());
            pstmt.setDouble(2, grupoAlimentoDieta.getQtd_tarde_kg());
            pstmt.setString(3, grupoAlimentoDieta.getTxt_obs());
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

            String sql = "SELECT * FROM grupoAlimentoDieta ORDER BY dat_dieta";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<GrupoAlimentoDieta> listAll = null;
            IGrupoAlimentoDietaDAO grupoAlimentoDietaDAO = new GrupoAlimentoDietaDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    GrupoAlimentoDieta grupoAlimentoDieta = new GrupoAlimentoDieta();
                    grupoAlimentoDieta.setDat_dieta(rs.getDate("dat_dieta"));
                    grupoAlimentoDieta.setQtd_manha_kg(rs.getDouble("qtd_manha_kg"));
                    grupoAlimentoDieta.setQtd_tarde_kg(rs.getDouble("qtd_tarde_kg"));
                    grupoAlimentoDieta.setTxt_obs(rs.getString("txt_obs"));

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
    public GrupoAlimentoDieta consultarPorData(Date data) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM grupoAlimentoDieta WHERE dat_dieta = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, data);
            ResultSet rs = pstmt.executeQuery();

            GrupoAlimentoDieta grupoAlimentoDieta = null;
            if (rs.next()) {
                grupoAlimentoDieta.setDat_dieta(rs.getDate("dat_dieta"));
                grupoAlimentoDieta.setQtd_manha_kg(rs.getDouble("qtd_manha_kg"));
                grupoAlimentoDieta.setQtd_tarde_kg(rs.getDouble("qtd_tarde_kg"));
                grupoAlimentoDieta.setTxt_obs(rs.getString("txt_obs"));
            }
            return grupoAlimentoDieta;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GrupoAlimentoDietaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
