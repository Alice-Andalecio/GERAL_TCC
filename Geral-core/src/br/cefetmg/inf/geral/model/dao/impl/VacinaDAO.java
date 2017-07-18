package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IVacinaDAO;
import br.cefetmg.inf.geral.model.domain.Vacina;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VacinaDAO implements IVacinaDAO {

    @Override
    public Long inserir(Vacina vacina) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO vacina (nom_Vacina) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, vacina.getNom_Vacina());
            ResultSet rs = pstmt.executeQuery();

            Long cod_Vacina = null;
            if (rs.next()) {
                cod_Vacina = new Long(rs.getLong("cod_Vacina"));
                vacina.setCod_Vacina(cod_Vacina);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return cod_Vacina;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(Vacina vacina) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();
            String sql = "UPDATE grupo"
                    + " SET  nom_Vacina = ?, "
                    + " WHERE cod_Vacina = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, vacina.getNom_Vacina());
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
    public boolean delete(Vacina vacina) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM vacina WHERE cod_Vacina = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, vacina.getNom_Vacina());
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
    public ArrayList<Vacina> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM vacina ORDER BY cod_Vacina";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Vacina> listAll = null;
            IVacinaDAO vacinaDAO = new VacinaDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Vacina vacina = new Vacina();
                    vacina.setCod_Vacina(rs.getLong("cod_Vacina"));
                    vacina.setNom_Vacina(rs.getString("nom_Vacina"));

                    listAll.add(vacina);
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
    public Vacina consultarPorCod(Long cod) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM vacina WHERE cod_Vacina = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, cod);
            ResultSet rs = pstmt.executeQuery();

            Vacina vacina = null;
            IVacinaDAO vacinaDAO = new VacinaDAO();
            if (rs.next()) {
                vacinaDAO = new VacinaDAO();
                vacina.setCod_Vacina(rs.getLong("cod_Vacina"));
                vacina.setNom_Vacina(rs.getString("nom_Vacina"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return vacina;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}
