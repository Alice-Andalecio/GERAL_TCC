package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IControleProducaoDAO;
import br.cefetmg.inf.geral.model.domain.ControleProducao;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ControleProducaoDAO implements IControleProducaoDAO {

    @Override
    public Long inserir(ControleProducao controleProducao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO controleProducao (nom_comprador) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (Date) controleProducao.getDat_producao());
            ResultSet rs = pstmt.executeQuery();

            Long seq_Animal = null;
            if (rs.next()) {
                seq_Animal = new Long(rs.getLong("seq_Animal"));
                controleProducao.setSeq_Animal(seq_Animal);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return seq_Animal;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(ControleProducao controleProducao) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();
            String sql = "UPDATE controleProducao "
                    + " SET dat_Producao = ?, "
                    + " WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (Date) controleProducao.getDat_producao());
            pstmt.setLong(2, controleProducao.getSeq_Animal());
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
    public boolean delete(ControleProducao controleProducao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM controleProducao WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (Date) controleProducao.getDat_producao());
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
    public ArrayList<ControleProducao> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM controleProducao ORDER BY seq_Animal";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<ControleProducao> listAll = null;
            IControleProducaoDAO controleProducaoDAO = new ControleProducaoDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    ControleProducao controleProducao = new ControleProducao();
                    controleProducao.setSeq_Animal(rs.getLong("seq_animal"));
                    controleProducao.setDat_producao(rs.getDate("dat_Producao"));

                    listAll.add(controleProducao);
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
    public ControleProducao consultarPorSeq(Long seq) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM controleProducao WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seq);
            ResultSet rs = pstmt.executeQuery();

            ControleProducao controleProducao = null;
            IControleProducaoDAO controleProducaoDAO = new ControleProducaoDAO();
            if (rs.next()) {
                controleProducao = new ControleProducao();
                controleProducao.setSeq_Animal(rs.getLong("seq_animal"));
                controleProducao.setDat_producao(rs.getDate("dat_Producao"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return controleProducao;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}