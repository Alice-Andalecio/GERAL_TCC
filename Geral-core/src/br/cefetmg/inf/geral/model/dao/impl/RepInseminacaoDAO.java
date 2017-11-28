package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IRepInseminacaoDAO;
import br.cefetmg.inf.geral.model.domain.RepInseminacao;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

public class RepInseminacaoDAO implements IRepInseminacaoDAO {

    @Override
    public Long inserir(RepInseminacao repinseminacao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO repparto (numAnimal, nomAnimal, inseminadasCobertas, vazias, gestantes, inseminacao, cobricao, somSetor, todos, padrao, doadora, receptora, descarte,  dataInseminacao, horaInseminacao, reprodutor, raca, inseminador, numDoses, dataCio, horaCio, cio, muco, te, ecc, proIATF) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, repinseminacao.getNumAnimal());
            pstmt.setString(2, repinseminacao.getNomAnimal());
            pstmt.setString(3, repinseminacao.getInseminadasCobertas());
            pstmt.setString(4, repinseminacao.getVazias());
            pstmt.setString(5, repinseminacao.getGestantes());
            pstmt.setString(6, repinseminacao.getInseminacao());
            pstmt.setString(7, repinseminacao.getCobricao());
            pstmt.setString(8, repinseminacao.getSomSetor());
            pstmt.setString(9, repinseminacao.getTodos());
            pstmt.setString(10, repinseminacao.getPadrao());
            pstmt.setString(11, repinseminacao.getDoadora());
            pstmt.setString(12, repinseminacao.getReceptora());
            pstmt.setString(13, repinseminacao.getDescarte());
            pstmt.setDate(14, (Date) repinseminacao.getDataInseminacao());
            pstmt.setTime(15, (Time) repinseminacao.getHoraInseminacao());
            pstmt.setString(16, repinseminacao.getReprodutor());
            pstmt.setString(17, repinseminacao.getRaca());
            pstmt.setString(18, repinseminacao.getInseminador());
            pstmt.setString(19, repinseminacao.getNumDoses());
            pstmt.setDate(20, (Date) repinseminacao.getDataCio());
            pstmt.setTime(21, (Time) repinseminacao.getHoraCio());
            pstmt.setLong(22, repinseminacao.getCio());
            pstmt.setLong(23, repinseminacao.getMuco());
            pstmt.setLong(24, repinseminacao.getTe());
            pstmt.setString(25, repinseminacao.getEcc());
            pstmt.setString(26, repinseminacao.getProIATF());

            ResultSet rs = pstmt.executeQuery();

            Long seq = null;
            if (rs.next()) {
                seq = new Long(rs.getLong("seq_Reproducao"));
                repinseminacao.setSeq_RepInseminacao(seq);
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
    public boolean atualizar(RepInseminacao repinseminacao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE repparto "
                    + " SET numAnimal = ?, "
                    + "     nomAnimal = ?"
                    + "     inseminadasCobertas = ?"
                    + "     vazias = ?"
                    + "     gestantes = ?"
                    + "     inseminacao = ?"
                    + "     cobricao = ?"
                    + "     somSetor = ?"
                    + "     todos = ?"
                    + "     padrao = ?"
                    + "     doadora = ?"
                    + "     receptora = ?"
                    + "     descarte = ?"
                    + "     dataInseminacao = ?"
                    + "     horaInseminacao = ?"
                    + "     reprodutor = ?"
                    + "     raca = ?"
                    + "     inseminador = ?"
                    + "     numDoses = ?"
                    + "     dataCio = ?"
                    + "     horaCio = ?"
                    + "     cio = ?"
                    + "     muco = ?"
                    + "     te = ?"
                    + "     ecc = ?"
                    + "     proIATF = ?"
                    + " WHERE seq_RepInseminacaoo = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, repinseminacao.getNumAnimal());
            pstmt.setString(2, repinseminacao.getNomAnimal());
            pstmt.setString(3, repinseminacao.getInseminadasCobertas());
            pstmt.setString(4, repinseminacao.getVazias());
            pstmt.setString(5, repinseminacao.getGestantes());
            pstmt.setString(6, repinseminacao.getInseminacao());
            pstmt.setString(7, repinseminacao.getCobricao());
            pstmt.setString(8, repinseminacao.getSomSetor());
            pstmt.setString(9, repinseminacao.getTodos());
            pstmt.setString(10, repinseminacao.getPadrao());
            pstmt.setString(11, repinseminacao.getDoadora());
            pstmt.setString(12, repinseminacao.getReceptora());
            pstmt.setString(13, repinseminacao.getDescarte());
            pstmt.setDate(14, (Date) repinseminacao.getDataInseminacao());
            pstmt.setTime(15, (Time) repinseminacao.getHoraInseminacao());
            pstmt.setString(16, repinseminacao.getReprodutor());
            pstmt.setString(17, repinseminacao.getRaca());
            pstmt.setString(18, repinseminacao.getInseminador());
            pstmt.setString(19, repinseminacao.getNumDoses());
            pstmt.setDate(20, (Date) repinseminacao.getDataCio());
            pstmt.setTime(21, (Time) repinseminacao.getHoraCio());
            pstmt.setLong(22, repinseminacao.getCio());
            pstmt.setLong(23, repinseminacao.getMuco());
            pstmt.setLong(24, repinseminacao.getTe());
            pstmt.setString(25, repinseminacao.getEcc());
            pstmt.setString(26, repinseminacao.getProIATF());

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
    public boolean delete(RepInseminacao repinseminacao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM repparto WHERE seq_RepInseminacao = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, repinseminacao.getNumAnimal());
            pstmt.setString(2, repinseminacao.getNomAnimal());
            pstmt.setString(3, repinseminacao.getInseminadasCobertas());
            pstmt.setString(4, repinseminacao.getVazias());
            pstmt.setString(5, repinseminacao.getGestantes());
            pstmt.setString(6, repinseminacao.getInseminacao());
            pstmt.setString(7, repinseminacao.getCobricao());
            pstmt.setString(8, repinseminacao.getSomSetor());
            pstmt.setString(9, repinseminacao.getTodos());
            pstmt.setString(10, repinseminacao.getPadrao());
            pstmt.setString(11, repinseminacao.getDoadora());
            pstmt.setString(12, repinseminacao.getReceptora());
            pstmt.setString(13, repinseminacao.getDescarte());
            pstmt.setDate(14, (Date) repinseminacao.getDataInseminacao());
            pstmt.setTime(15, (Time) repinseminacao.getHoraInseminacao());
            pstmt.setString(16, repinseminacao.getReprodutor());
            pstmt.setString(17, repinseminacao.getRaca());
            pstmt.setString(18, repinseminacao.getInseminador());
            pstmt.setString(19, repinseminacao.getNumDoses());
            pstmt.setDate(20, (Date) repinseminacao.getDataCio());
            pstmt.setTime(21, (Time) repinseminacao.getHoraCio());
            pstmt.setLong(22, repinseminacao.getCio());
            pstmt.setLong(23, repinseminacao.getMuco());
            pstmt.setLong(24, repinseminacao.getTe());
            pstmt.setString(25, repinseminacao.getEcc());
            pstmt.setString(26, repinseminacao.getProIATF());
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
    public ArrayList<RepInseminacao> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM repinseminacao ORDER BY seq_RepInseminacao";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<RepInseminacao> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    RepInseminacao repinseminacao = new RepInseminacao();
                    repinseminacao.setNumAnimal(rs.getLong("numAnimal"));
                    repinseminacao.setNomAnimal(rs.getString("nomAnimal"));
                    repinseminacao.setInseminadasCobertas(rs.getString("inseminadasCobertas"));
                    repinseminacao.setVazias(rs.getString("vazias"));
                    repinseminacao.setGestantes(rs.getString("gestantes"));
                    repinseminacao.setInseminacao(rs.getString("inseminacao"));
                    repinseminacao.setCobricao(rs.getString("cobricao"));
                    repinseminacao.setSomSetor(rs.getString("somSetor"));
                    repinseminacao.setTodos(rs.getString("todos"));
                    repinseminacao.setPadrao(rs.getString("padrao"));
                    repinseminacao.setDoadora(rs.getString("doadora"));
                    repinseminacao.setReceptora(rs.getString("receptora"));
                    repinseminacao.setDescarte(rs.getString("descarte"));
                    repinseminacao.setDataInseminacao(rs.getDate("dataInseminacao"));
                    repinseminacao.setHoraInseminacao(rs.getTime("horaIseminacao"));
                    repinseminacao.setReprodutor(rs.getString("reprodutor"));
                    repinseminacao.setRaca(rs.getString("raca"));
                    repinseminacao.setNumDoses(rs.getNString("numDoses"));
                    repinseminacao.setDataCio(rs.getDate("dataCio"));
                    repinseminacao.setHoraCio(rs.getTime("horaCio"));
                    repinseminacao.setCio(rs.getLong("cio"));
                    repinseminacao.setMuco(rs.getLong("muco"));
                    repinseminacao.setTe(rs.getLong("te"));
                    repinseminacao.setEcc(rs.getString("ecc"));
                    repinseminacao.setProIATF(rs.getString("proIATF"));
                    listAll.add(repinseminacao);
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
    public RepInseminacao consultarPorSeq(Long seq) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM repinseminacao WHERE seq_RepInseminacao = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seq);
            ResultSet rs = pstmt.executeQuery();

            RepInseminacao repinseminacao = null;
            if (rs.next()) {
                repinseminacao = new RepInseminacao();
                repinseminacao.setNumAnimal(rs.getLong("numAnimal"));
                repinseminacao.setNomAnimal(rs.getString("nomAnimal"));
                repinseminacao.setInseminadasCobertas(rs.getString("inseminadasCobertas"));
                repinseminacao.setVazias(rs.getString("vazias"));
                repinseminacao.setGestantes(rs.getString("gestantes"));
                repinseminacao.setInseminacao(rs.getString("inseminacao"));
                repinseminacao.setCobricao(rs.getString("cobricao"));
                repinseminacao.setSomSetor(rs.getString("somSetor"));
                repinseminacao.setTodos(rs.getString("todos"));
                repinseminacao.setPadrao(rs.getString("padrao"));
                repinseminacao.setDoadora(rs.getString("doadora"));
                repinseminacao.setReceptora(rs.getString("receptora"));
                repinseminacao.setDescarte(rs.getString("descarte"));
                repinseminacao.setDataInseminacao(rs.getDate("dataInseminacao"));
                repinseminacao.setHoraInseminacao(rs.getTime("horaIseminacao"));
                repinseminacao.setReprodutor(rs.getString("reprodutor"));
                repinseminacao.setRaca(rs.getString("raca"));
                repinseminacao.setNumDoses(rs.getNString("numDoses"));
                repinseminacao.setDataCio(rs.getDate("dataCio"));
                repinseminacao.setHoraCio(rs.getTime("horaCio"));
                repinseminacao.setCio(rs.getLong("cio"));
                repinseminacao.setMuco(rs.getLong("muco"));
                repinseminacao.setTe(rs.getLong("te"));
                repinseminacao.setEcc(rs.getString("ecc"));
                repinseminacao.setProIATF(rs.getString("proIATF"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return repinseminacao;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}