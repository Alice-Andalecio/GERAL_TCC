package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IProducaoCompraDAO;
import br.cefetmg.inf.geral.model.domain.ProducaoCompra;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProducaoCompraDAO implements IProducaoCompraDAO {

    @Override
    public Long inserir(ProducaoCompra producaoCompra) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO producao_compra (txt_Observacao) VALUES(?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, producaoCompra.getTxt_Observacao());
            ResultSet rs = pstmt.executeQuery();

            Long seq = null;
            if (rs.next()) {
                seq = new Long(rs.getLong("seq_Compra"));
                producaoCompra.setSeq_Compra(seq);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return seq;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(ProducaoCompra producaoCompra) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE producao_compra "
                    + " SET txt_Observacao = ?"
                    + " WHERE seq_Compra = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, producaoCompra.getTxt_Observacao());
            pstmt.setLong(2, producaoCompra.getSeq_Compra());
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
    public boolean delete(ProducaoCompra producaoCompra) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM producao_compra WHERE seq_Compra = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, producaoCompra.getSeq_Compra());
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
    public ArrayList<ProducaoCompra> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM producao_compra ORDER BY seq_Compra";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<ProducaoCompra> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    ProducaoCompra producaoCompra = new ProducaoCompra();
                    producaoCompra.setSeq_Compra(rs.getLong("seq_Compra"));
                    producaoCompra.setTxt_Observacao(rs.getString("txt_Observacao"));
                    listAll.add(producaoCompra);
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
    public ProducaoCompra consultarPorSeq(Long seq) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM producao_compra WHERE seq_Compra = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seq);
            ResultSet rs = pstmt.executeQuery();

            ProducaoCompra producaoCompra = null;
            if (rs.next()) {
                producaoCompra = new ProducaoCompra();
                producaoCompra.setSeq_Compra(rs.getLong("seq_Compra"));
                producaoCompra.setTxt_Observacao(rs.getString("txt_Observacao"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return producaoCompra;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}
