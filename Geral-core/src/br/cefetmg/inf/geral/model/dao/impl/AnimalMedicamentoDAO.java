package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IAnimalMedicamentoDAO;
import br.cefetmg.inf.geral.model.domain.AnimalMedicamento;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AnimalMedicamentoDAO implements IAnimalMedicamentoDAO {

    @Override
    public Long inserir(AnimalMedicamento animalMedicamento) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO animalMedicamento (dat_Inicio, dat_Fim, txt_Prescricao, qtd_Dosagem, qtd_frequencia) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (Date) animalMedicamento.getDat_Inicio());
            pstmt.setDate(2, (Date) animalMedicamento.getDat_Fim());
            pstmt.setString(3, animalMedicamento.getTxt_Prescricao());
            pstmt.setDouble(4, animalMedicamento.getQtd_Dosagem());
            pstmt.setLong(5, animalMedicamento.getQtd_Fequencia());
            ResultSet rs = pstmt.executeQuery();

            Long seq_Animal = null;
            if (rs.next()) {
                seq_Animal = new Long(rs.getLong("seq_Animal"));
                animalMedicamento.setSeq_Animal(seq_Animal);
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
    public boolean atualizar(AnimalMedicamento animalMedicamento) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();
            String sql = "UPDATE animalMedicamento "
                    + " SET dat_Inicio = ?, "
                    + " SET dat_Fim = ?, "
                    + " SET txt_Prescricao = ?, "
                    + " SET qtd_Dosagem = ?, "
                    + " SET qtd_frequencia = ?, "
                    + " WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (Date) animalMedicamento.getDat_Inicio());
            pstmt.setDate(2, (Date) animalMedicamento.getDat_Fim());
            pstmt.setString(3, animalMedicamento.getTxt_Prescricao());
            pstmt.setDouble(4, animalMedicamento.getQtd_Dosagem());
            pstmt.setLong(5, animalMedicamento.getQtd_Fequencia());
            pstmt.setLong(6, animalMedicamento.getSeq_Animal());
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
    public boolean delete(AnimalMedicamento animalMedicamento) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM animal WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animalMedicamento.getSeq_Animal());
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
    public ArrayList<AnimalMedicamento> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM animal ORDER BY cod_Animal";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<AnimalMedicamento> listAll = null;
            IAnimalMedicamentoDAO animalMedicamentoDAO = new AnimalMedicamentoDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    AnimalMedicamento animalMedicamento = new AnimalMedicamento();
                    animalMedicamento.setDat_Inicio(rs.getDate("dat_Inicio"));
                    animalMedicamento.setDat_Fim(rs.getDate("dat_Fim"));
                    animalMedicamento.setTxt_Prescricao(rs.getString("txt_Prescricao"));
                    animalMedicamento.setQtd_Dosagem(rs.getDouble("qtd_Dosagem"));
                    animalMedicamento.setQtd_Fequencia(rs.getLong("qtd_Frequencia"));
                    animalMedicamento.setSeq_Animal(rs.getLong("seq_Animal"));

                    listAll.add(animalMedicamento);
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
    public AnimalMedicamento consultarPorSeq(Long seq) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM animal WHERE cod_Alimento = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seq);
            ResultSet rs = pstmt.executeQuery();

            AnimalMedicamento animalMedicamento = null;
            IAnimalMedicamentoDAO animalMedicamentoDAO = new AnimalMedicamentoDAO();
            if (rs.next()) {
                animalMedicamento = new AnimalMedicamento();
                animalMedicamento.setSeq_Animal(rs.getLong("seq_Animal"));
                animalMedicamento.setDat_Inicio(rs.getDate("dat_Inicio"));
                animalMedicamento.setDat_Fim(rs.getDate("dat_Fim"));
                animalMedicamento.setTxt_Prescricao(rs.getString("txt_Prescricao"));
                animalMedicamento.setQtd_Dosagem(rs.getDouble("qtd_Dosagem"));
                animalMedicamento.setQtd_Fequencia(rs.getLong("qtd_Frequencia"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return animalMedicamento;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}