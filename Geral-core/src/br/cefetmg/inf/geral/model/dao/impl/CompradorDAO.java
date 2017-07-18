package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.ICompradorDAO;
import br.cefetmg.inf.geral.model.domain.Comprador;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CompradorDAO implements ICompradorDAO {

    @Override
    public Long inserir(Comprador comprador) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO comprador (nom_comprador) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, comprador.getNom_Comprador());
            ResultSet rs = pstmt.executeQuery();

            Long cod_CNPJ = null;
            if (rs.next()) {
                cod_CNPJ = new Long(rs.getLong("cod_CNPJ"));
                comprador.setCod_CNPJ(cod_CNPJ);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return cod_CNPJ;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(Comprador comprador) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();
            String sql = "UPDATE comprador "
                    + " SET nom_Comprador = ?, "
                    + " WHERE cod_CNJP = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, comprador.getNom_Comprador());
            pstmt.setLong(2, comprador.getCod_CNPJ());
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
    public boolean delete(Comprador comprador) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM comprador WHERE cod_CNPJ = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, comprador.getNom_Comprador());
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
    public ArrayList<Comprador> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM comprador ORDER BY cod_CNPJ";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Comprador> listAll = null;
            ICompradorDAO compradorDAO = new CompradorDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Comprador comprador = new Comprador();
                    comprador.setCod_CNPJ(rs.getLong("cod_CNPJ"));
                    comprador.setNom_Comprador(rs.getString("nom_comprador"));

                    listAll.add(comprador);
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
    public Comprador consultarPorCod(Long cod) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM comprador WHERE cod_CNPJ = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, cod);
            ResultSet rs = pstmt.executeQuery();

            Comprador comprador = null;
            ICompradorDAO compradorDAO = new CompradorDAO();
            if (rs.next()) {
                comprador = new Comprador();
                comprador.setCod_CNPJ(rs.getLong("cod_CNPJ"));
                comprador.setNom_Comprador(rs.getString("nom_comprador"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return comprador;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}
