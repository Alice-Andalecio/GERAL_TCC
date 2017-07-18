package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IHistoricoLocalizacaoDAO;
import br.cefetmg.inf.geral.model.domain.HistoricoLocalizacao;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class HistoricoLocalizacaoDAO implements IHistoricoLocalizacaoDAO {

    @Override
    public Long inserir(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO historicoLocalizacao (dat_Inicio_Localizacao) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (java.sql.Date) historicoLocalizacao.getDat_Inicio_Localizacao());
            ResultSet rs = pstmt.executeQuery();

            Long seq_Animal = null;
            if (rs.next()) {
                seq_Animal = new Long(rs.getLong("seq_Animal"));
                historicoLocalizacao.setSeq_Animal(seq_Animal);
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
    public boolean atualizar(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();
            String sql = "UPDATE grupoAlimentoDieta "
                    + " SET dat_Inicio_Localizacao = ?, "
                    + " WHERE Seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (java.sql.Date) historicoLocalizacao.getDat_Inicio_Localizacao());
            pstmt.setLong(2, historicoLocalizacao.getSeq_Animal());
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
    public boolean delete(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM historicoLocalizacao WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (java.sql.Date) historicoLocalizacao.getDat_Inicio_Localizacao());
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
    public ArrayList<HistoricoLocalizacao> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM comprador ORDER BY cod_CNPJ";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<HistoricoLocalizacao> listAll = null;
            IHistoricoLocalizacaoDAO historicoLocalizacaoDAO = new HistoricoLocalizacaoDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    HistoricoLocalizacao historicoLocalizacao = new HistoricoLocalizacao();
                    historicoLocalizacao.setSeq_Animal(rs.getLong("seq_Animal"));
                    historicoLocalizacao.setDat_Inicio_Localizacao(rs.getDate("dat_Inicio_Localizacao"));

                    listAll.add(historicoLocalizacao);
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
    public HistoricoLocalizacao consultarPorDat(Date dat) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM grupoAlimentoDieta WHERE cod_Grupo = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (java.sql.Date) dat);
            ResultSet rs = pstmt.executeQuery();

            HistoricoLocalizacao historicoLocalizacao = null;
            IHistoricoLocalizacaoDAO historicoLocalizacaoDAO = new HistoricoLocalizacaoDAO();
            if (rs.next()) {
                historicoLocalizacaoDAO = new HistoricoLocalizacaoDAO();
                historicoLocalizacao.setSeq_Animal(rs.getLong("seq_Animal"));
                historicoLocalizacao.setDat_Inicio_Localizacao(rs.getDate("dat_Inicio_Localizacao"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return historicoLocalizacao;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}