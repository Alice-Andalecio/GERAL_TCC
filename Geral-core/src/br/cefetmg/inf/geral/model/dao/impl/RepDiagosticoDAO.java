package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IRepDiagnosticoDAO;
import br.cefetmg.inf.geral.model.domain.RepDiagnostico;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

public class RepDiagosticoDAO implements IRepDiagnosticoDAO {

    @Override
    public Long inserir(RepDiagnostico repdiag) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO repparto (numAnimal, nomAnimal, inseminadasCobertas, vazias, gestantes, emCrescimento, padrao, doadora, receptora, descarte, dataDiagnostico, horaDiagnostico, diagnostico, sexo, numDias, reprodutor, raca, dataCio, cio, muco, te, utero, ovD, ovE, base ) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, repdiag.getNumAnimal());
            pstmt.setString(2, repdiag.getNomAnimal());
            pstmt.setString(3, repdiag.getInseminadasCobertas());
            pstmt.setString(4, repdiag.getVazias());
            pstmt.setString(5, repdiag.getGestantes());
            pstmt.setString(6, repdiag.getEmCrescimento());
            pstmt.setString(7, repdiag.getPadrao());
            pstmt.setString(8, repdiag.getDoadora());
            pstmt.setString(9, repdiag.getReceptora());
            pstmt.setString(10, repdiag.getDescarte());
            pstmt.setDate(11, (Date) repdiag.getDataDiagnostico());
            pstmt.setTime(12, (Time) repdiag.getHoraDiagnostico());
            pstmt.setString(13, repdiag.getDiagnostico());
            pstmt.setString(14, repdiag.getSexo());
            pstmt.setString(15, repdiag.getNumDias());
            pstmt.setString(16, repdiag.getReprodutor());
            pstmt.setString(17, repdiag.getRaca());
            pstmt.setDate(18, (Date) repdiag.getDataCio());
            pstmt.setTime(19, (Time) repdiag.getHoraCio());
            pstmt.setString(20, repdiag.getCio());
            pstmt.setString(21, repdiag.getMuco());
            pstmt.setString(22, repdiag.getTe());
            pstmt.setString(23, repdiag.getUtero());
            pstmt.setString(24, repdiag.getOvD());
            pstmt.setString(25, repdiag.getOvE());
            pstmt.setString(26, repdiag.getBase());
            ResultSet rs = pstmt.executeQuery();

            Long seq = null;
            if (rs.next()) {
                seq = new Long(rs.getLong("seq_ReproducaoDiagnostico"));
                repdiag.setSeq_ReproducaoDiagnostico(seq);
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
    public boolean atualizar(RepDiagnostico repdiag) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE repparto "
                    + " SET numAnimal = ?"
                    + "     nomAnimal = ?"
                    + "     inseminadasCobertas = ?"
                    + "     vazias = ?"
                    + "     gestantes = ?"
                    + "     emCrescimento = ?"
                    + "     padrao = ?"
                    + "     doadora = ?"
                    + "     receptora = ?"
                    + "     descarte = ?"
                    + "     dataDiagnostico = ?"
                    + "     horaDiagnostico = ?"
                    + "     diagnostico = ?"
                    + "     sexo = ?"
                    + "     numDias = ?"
                    + "     reprodutor = ?"
                    + "     raca = ?"
                    + "     dataCio = ?"
                    + "     cio = ?"
                    + "     muco = ?"
                    + "     te = ?"
                    + "     utero = ?"
                    + "     ovD = ?"
                    + "     ovE = ?"
                    + "     base = ?"
                    + " WHERE seq_ReproducaoDiagnostico = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, repdiag.getNumAnimal());
            pstmt.setString(2, repdiag.getNomAnimal());
            pstmt.setString(3, repdiag.getInseminadasCobertas());
            pstmt.setString(4, repdiag.getVazias());
            pstmt.setString(5, repdiag.getGestantes());
            pstmt.setString(6, repdiag.getEmCrescimento());
            pstmt.setString(7, repdiag.getPadrao());
            pstmt.setString(8, repdiag.getDoadora());
            pstmt.setString(9, repdiag.getReceptora());
            pstmt.setString(10, repdiag.getDescarte());
            pstmt.setDate(11, (Date) repdiag.getDataDiagnostico());
            pstmt.setTime(12, (Time) repdiag.getHoraDiagnostico());
            pstmt.setString(13, repdiag.getDiagnostico());
            pstmt.setString(14, repdiag.getSexo());
            pstmt.setString(15, repdiag.getNumDias());
            pstmt.setString(16, repdiag.getReprodutor());
            pstmt.setString(17, repdiag.getRaca());
            pstmt.setDate(18, (Date) repdiag.getDataCio());
            pstmt.setTime(19, (Time) repdiag.getHoraCio());
            pstmt.setString(20, repdiag.getCio());
            pstmt.setString(21, repdiag.getMuco());
            pstmt.setString(22, repdiag.getTe());
            pstmt.setString(23, repdiag.getUtero());
            pstmt.setString(24, repdiag.getOvD());
            pstmt.setString(25, repdiag.getOvE());
            pstmt.setString(26, repdiag.getBase());
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
    public boolean delete(RepDiagnostico repdiag) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM repdiag WHERE seq_ReproducaoDiagnostico= ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, repdiag.getNumAnimal());
            pstmt.setString(2, repdiag.getNomAnimal());
            pstmt.setString(3, repdiag.getInseminadasCobertas());
            pstmt.setString(4, repdiag.getVazias());
            pstmt.setString(5, repdiag.getGestantes());
            pstmt.setString(6, repdiag.getEmCrescimento());
            pstmt.setString(7, repdiag.getPadrao());
            pstmt.setString(8, repdiag.getDoadora());
            pstmt.setString(9, repdiag.getReceptora());
            pstmt.setString(10, repdiag.getDescarte());
            pstmt.setDate(11, (Date) repdiag.getDataDiagnostico());
            pstmt.setTime(12, (Time) repdiag.getHoraDiagnostico());
            pstmt.setString(13, repdiag.getDiagnostico());
            pstmt.setString(14, repdiag.getSexo());
            pstmt.setString(15, repdiag.getNumDias());
            pstmt.setString(16, repdiag.getReprodutor());
            pstmt.setString(17, repdiag.getRaca());
            pstmt.setDate(18, (Date) repdiag.getDataCio());
            pstmt.setTime(19, (Time) repdiag.getHoraCio());
            pstmt.setString(20, repdiag.getCio());
            pstmt.setString(21, repdiag.getMuco());
            pstmt.setString(22, repdiag.getTe());
            pstmt.setString(23, repdiag.getUtero());
            pstmt.setString(24, repdiag.getOvD());
            pstmt.setString(25, repdiag.getOvE());
            pstmt.setString(26, repdiag.getBase());
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
    public ArrayList<RepDiagnostico> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM repdiag ORDER BY seq_ReproducaoDiagnostico";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<RepDiagnostico> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    RepDiagnostico repdiag = new RepDiagnostico();
                    repdiag.setNumAnimal(rs.getLong("numAnimal"));
                    repdiag.setNomAnimal(rs.getString("nomAnimal"));
                    repdiag.setInseminadasCobertas(rs.getString("inseminadasCobertas"));
                    repdiag.setGestantes(rs.getString("gestantes"));
                    repdiag.setEmCrescimento(rs.getString("emCrescimento"));
                    repdiag.setPadrao(rs.getString("padrao"));
                    repdiag.setDoadora(rs.getString("doadora"));
                    repdiag.setReceptora(rs.getString("receptora"));
                    repdiag.setDescarte(rs.getString("descarte"));
                    repdiag.setDataDiagnostico(rs.getDate("dataDiagnostico"));
                    repdiag.setHoraDiagnostico(rs.getTime("horaDiagnostico"));
                    repdiag.setDiagnostico(rs.getString("diagnostico"));
                    repdiag.setSexo(rs.getString("sexo"));
                    repdiag.setNumDias(rs.getString("numDias"));
                    repdiag.setReprodutor(rs.getString("reprodutor"));
                    repdiag.setRaca(rs.getString("raca"));
                    repdiag.setDataCio(rs.getDate("dataCio"));
                    repdiag.setHoraCio(rs.getTime("horaCio"));
                    repdiag.setCio(rs.getString("cio"));
                    repdiag.setMuco(rs.getString("muco"));
                    repdiag.setTe(rs.getString("te"));
                    repdiag.setUtero(rs.getString("utero"));
                    repdiag.setOvD(rs.getString("ovD"));
                    repdiag.setOvE(rs.getString("ovE"));
                    repdiag.setBase(rs.getString("base"));
                    listAll.add(repdiag);
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
    public RepDiagnostico consultarPorSeq(Long seq) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM repdiag WHERE seq_ReproducaoDiagnostico = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seq);
            ResultSet rs = pstmt.executeQuery();

            RepDiagnostico repdiag = null;
            if (rs.next()) {
                repdiag = new RepDiagnostico();
                repdiag.setNumAnimal(rs.getLong("numAnimal"));
                repdiag.setNomAnimal(rs.getString("nomAnimal"));
                repdiag.setInseminadasCobertas(rs.getString("inseminadasCobertas"));
                repdiag.setGestantes(rs.getString("gestantes"));
                repdiag.setEmCrescimento(rs.getString("emCrescimento"));
                repdiag.setPadrao(rs.getString("padrao"));
                repdiag.setDoadora(rs.getString("doadora"));
                repdiag.setReceptora(rs.getString("receptora"));
                repdiag.setDescarte(rs.getString("descarte"));
                repdiag.setDataDiagnostico(rs.getDate("dataDiagnostico"));
                repdiag.setHoraDiagnostico(rs.getTime("horaDiagnostico"));
                repdiag.setDiagnostico(rs.getString("diagnostico"));
                repdiag.setSexo(rs.getString("sexo"));
                repdiag.setNumDias(rs.getString("numDias"));
                repdiag.setReprodutor(rs.getString("reprodutor"));
                repdiag.setRaca(rs.getString("raca"));
                repdiag.setDataCio(rs.getDate("dataCio"));
                repdiag.setHoraCio(rs.getTime("horaCio"));
                repdiag.setCio(rs.getString("cio"));
                repdiag.setMuco(rs.getString("muco"));
                repdiag.setTe(rs.getString("te"));
                repdiag.setUtero(rs.getString("utero"));
                repdiag.setOvD(rs.getString("ovD"));
                repdiag.setOvE(rs.getString("ovE"));
                repdiag.setBase(rs.getString("base"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return repdiag;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}