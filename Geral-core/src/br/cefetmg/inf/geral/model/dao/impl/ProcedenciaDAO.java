package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IProcedenciaDAO;
import br.cefetmg.inf.geral.model.domain.Procedencia;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProcedenciaDAO implements IProcedenciaDAO {

    @Override
    public Long inserir(Procedencia procedencia) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO procedencia (nom_Fazenda, nom_Proprietario, idt_Proprietario) VALUES(?,?,?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, procedencia.getNom_Fazenda());
            pstmt.setString(2, procedencia.getNom_Proprietario());
            pstmt.setLong(3, procedencia.getIdt_Proprietario());
            ResultSet rs = pstmt.executeQuery();

            Long seq = null;
            if (rs.next()) {
                seq = new Long(rs.getLong("seq_Procedencia"));
                procedencia.setSeq_Procedencia(seq);
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
    public boolean atualizar(Procedencia procedencia) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE procedencia "
                    + " SET nom_Fazenda = ?"
                    + "     nom_Proprietario = ?"
                    + "     idt_Proprietario = ?"
                    + " WHERE seq_Procedencia = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, procedencia.getNom_Fazenda());
            pstmt.setString(2, procedencia.getNom_Proprietario());
            pstmt.setLong(3, procedencia.getIdt_Proprietario());
            pstmt.setLong(4, procedencia.getSeq_Procedencia());
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
    public boolean delete(Procedencia procedencia) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM procedencia WHERE seq_Procedencia = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, procedencia.getSeq_Procedencia());
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
    public ArrayList<Procedencia> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM procedencia ORDER BY nom_Fazenda";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Procedencia> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Procedencia procedencia = new Procedencia();
                    procedencia.setSeq_Procedencia(rs.getLong("seq_Procedencia"));
                    procedencia.setNom_Fazenda(rs.getString("nom_Fazenda"));
                    procedencia.setNom_Proprietario(rs.getString("nom_Proprietario"));
                    procedencia.setIdt_Proprietario(rs.getLong("idt_Proprietario"));
                    listAll.add(procedencia);
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
    public Procedencia consultarPorSeq(Long seq) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM procedencia WHERE seq_Procedencia = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seq);
            ResultSet rs = pstmt.executeQuery();

            Procedencia procedencia = null;
            if (rs.next()) {
                procedencia = new Procedencia();
                procedencia.setSeq_Procedencia(rs.getLong("seq_Procedencia"));
                procedencia.setNom_Fazenda(rs.getString("nom_Fazenda"));
                procedencia.setNom_Proprietario(rs.getString("nom_Proprietario"));
                procedencia.setIdt_Proprietario(rs.getLong("idt_Proprietario"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return procedencia;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}
