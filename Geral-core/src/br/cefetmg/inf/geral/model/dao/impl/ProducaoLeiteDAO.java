package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IProducaoLeiteDAO;
import br.cefetmg.inf.geral.model.domain.ProducaoLeite;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class ProducaoLeiteDAO implements IProducaoLeiteDAO {

    @Override
    public Date inserir(ProducaoLeite producaoLeite) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO producao_leite (qtd_Leite_Manha, qtd_Leite_Tarde) VALUES(?,?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, producaoLeite.getQtd_Leite_Manha());
            pstmt.setDouble(2, producaoLeite.getQtd_Leite_Tarde());

            ResultSet rs = pstmt.executeQuery();

            Date dat = null;
            if (rs.next()) {
                dat = new Date(rs.getLong("dat_Producao"));
                producaoLeite.setDat_Producao(dat);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return dat;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(ProducaoLeite producaoLeite) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE producao_leite"
                    + " SET qtd_Leite_Manha = ?"
                    + "     qtd_Leite_Tarde = ?"
                    + " WHERE dat_Producao = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDouble(1, producaoLeite.getQtd_Leite_Manha());
            pstmt.setDouble(2, producaoLeite.getQtd_Leite_Tarde());
            pstmt.setDate(3, (java.sql.Date) producaoLeite.getDat_Producao());
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
    public boolean delete(ProducaoLeite producaoLeite) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM producao_leite WHERE dat_Producao = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (java.sql.Date) producaoLeite.getDat_Producao());
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
    public ArrayList<ProducaoLeite> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM producao_leite ORDER BY dat_Producao";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<ProducaoLeite> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    ProducaoLeite producaoLeite = new ProducaoLeite();
                    producaoLeite.setDat_Producao(rs.getDate("dat_Producao"));
                    producaoLeite.setQtd_Leite_Manha(rs.getDouble("qtd_Leite_Manha"));
                    producaoLeite.setQtd_Leite_Tarde(rs.getDouble("qtd_Leite_Tarde"));
                    listAll.add(producaoLeite);
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
    public ProducaoLeite consultarPorDat(Date dat) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM categoria WHERE id = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (java.sql.Date) dat);
            ResultSet rs = pstmt.executeQuery();

            ProducaoLeite producaoLeite = null;
            if (rs.next()) {
                producaoLeite = new ProducaoLeite();
                producaoLeite.setDat_Producao(rs.getDate("dat_Producao"));
                producaoLeite.setQtd_Leite_Manha(rs.getDouble("qtd_Leite_Manha"));
                producaoLeite.setQtd_Leite_Tarde(rs.getDouble("qtd_Leite_Tarde"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return producaoLeite;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}
