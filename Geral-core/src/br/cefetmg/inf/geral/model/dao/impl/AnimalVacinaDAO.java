package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IAnimalVacinaDAO;
import br.cefetmg.inf.geral.model.domain.AnimalVacina;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AnimalVacinaDAO implements IAnimalVacinaDAO {

    @Override
    public Long inserir(AnimalVacina animalVacina) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO animalVacina (dat_Vacinacao) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (Date) animalVacina.getDat_Vacinacao());
            ResultSet rs = pstmt.executeQuery();

            Long seq_Animal = null;
            if (rs.next()) {
                seq_Animal = new Long(rs.getLong("seq_Animal"));
                animalVacina.setSeq_Animal(seq_Animal);
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
    public boolean atualizar(AnimalVacina animalVacina) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();
            String sql = "UPDATE animalMedicamento "
                    + " SET dat_Vacinacao = ?, "
                    + " WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setDate(1, (Date) animalVacina.getDat_Vacinacao());
            pstmt.setLong(2, animalVacina.getSeq_Animal());
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
    public boolean delete(AnimalVacina animalVacina) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM animalVacina WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animalVacina.getSeq_Animal());
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
    public ArrayList<AnimalVacina> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM animal ORDER BY seq_Animal";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<AnimalVacina> listAll = null;
            IAnimalVacinaDAO animalVacinaDAO = new AnimalVacinaDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    AnimalVacina animalVacina = new AnimalVacina();
                    animalVacina.setSeq_Animal(rs.getLong("seq_Animal"));
                    animalVacina.setDat_Vacinacao(rs.getDate("dat_Vacinacao"));

                    listAll.add(animalVacina);
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
    public AnimalVacina consultarPorSeq(Long seq) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM animalVacina WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seq);
            ResultSet rs = pstmt.executeQuery();

            AnimalVacina animalVacina = null;
            IAnimalVacinaDAO animalVacinaDAO = new AnimalVacinaDAO();
            if (rs.next()) {
                animalVacina = new AnimalVacina();
                animalVacina.setSeq_Animal(rs.getLong("seq_Animal"));
                animalVacina.setDat_Vacinacao(rs.getDate("dat_Vacinacao"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return animalVacina;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}