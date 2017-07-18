package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IReproducaoDAO;
import br.cefetmg.inf.geral.model.domain.Reproducao;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ReproducaoDAO implements IReproducaoDAO {

    @Override
    public Long inserir(Reproducao reproducao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO reproducao (seq_Animal_Gestante, seq_Animal_Reprodutor, dat_Inseminacao, hor_Inseminacao, dat_Gestacao) VALUES(?,?,?,?,?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, reproducao.getSeq_Animal_Gestante());
            pstmt.setLong(2, reproducao.getSeq_Animal_Reprodutor());
            pstmt.setDate(3, (Date) reproducao.getDat_Inseminacao());
            pstmt.setLong(4, reproducao.getHor_Inseminacao());
            pstmt.setDate(5, (Date) reproducao.getDat_Gestacao());
            ResultSet rs = pstmt.executeQuery();

            Long seq = null;
            if (rs.next()) {
                seq = new Long(rs.getLong("seq_Reproducao"));
                reproducao.setSeq_Reproducao(seq);
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
    public boolean atualizar(Reproducao reproducao) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE reproducao "
                    + " SET seq_Animal_Gestante = ?"
                    + "     seq_Animal_Reprodutor = ?"
                    + "     dat_Inseminacao = ?"
                    + "     hor_Inseminacao = ?"
                    + "     dat_Gestacao = ?"
                    + " WHERE seq_Reproducao = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, reproducao.getSeq_Animal_Gestante());
            pstmt.setLong(2, reproducao.getSeq_Animal_Reprodutor());
            pstmt.setDate(3, (Date) reproducao.getDat_Inseminacao());
            pstmt.setLong(4, reproducao.getHor_Inseminacao());
            pstmt.setDate(5, (Date) reproducao.getDat_Gestacao());
            pstmt.setLong(6, reproducao.getSeq_Reproducao());
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
    public boolean delete(Reproducao reproducao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM reproducao WHERE seq_Reproducao = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, reproducao.getSeq_Reproducao());
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
    public ArrayList<Reproducao> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM reproducao ORDER BY dat_Inseminacao";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Reproducao> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Reproducao reproducao = new Reproducao();
                    reproducao.setSeq_Animal_Gestante(rs.getLong("seq_Animal_Gestante"));
                    reproducao.setSeq_Animal_Reprodutor(rs.getLong("seq_Animal_Reprodutor"));
                    reproducao.setDat_Inseminacao(rs.getDate("dat_Inseminacao"));
                    reproducao.setHor_Inseminacao(rs.getLong("hor_Inseminacao"));
                    reproducao.setDat_Gestacao(rs.getDate("dat_Gestacao"));
                    reproducao.setSeq_Reproducao(rs.getLong("seq_Reproducao"));
                    listAll.add(reproducao);
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
    public Reproducao consultarPorSeq(Long seq) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM reproducao WHERE seq_Reproducao = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seq);
            ResultSet rs = pstmt.executeQuery();

            Reproducao reproducao = null;
            if (rs.next()) {
                reproducao = new Reproducao();
                reproducao.setSeq_Animal_Gestante(rs.getLong("seq_Animal_Gestante"));
                reproducao.setSeq_Animal_Reprodutor(rs.getLong("seq_Animal_Reprodutor"));
                reproducao.setDat_Inseminacao(rs.getDate("dat_Inseminacao"));
                reproducao.setHor_Inseminacao(rs.getLong("hor_Inseminacao"));
                reproducao.setDat_Gestacao(rs.getDate("dat_Gestacao"));
                reproducao.setSeq_Reproducao(rs.getLong("seq_Reproducao"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return reproducao;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}
