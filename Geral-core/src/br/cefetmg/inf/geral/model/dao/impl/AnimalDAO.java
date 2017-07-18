package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IAnimalDAO;
import br.cefetmg.inf.geral.model.domain.Animal;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AnimalDAO implements IAnimalDAO {

    @Override
    public Long inserir(Animal animal) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO animal (seq_Animal_Pai, seq_Animal_Mae, nro_Animal, dat_Nascimento ) VALUES(?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animal.getSeq_Animal_Pai());
            pstmt.setLong(2, animal.getSeq_Animal_Mae());
            pstmt.setString(3, animal.getNro_Animal());
            pstmt.setDate(4, (Date) animal.getDat_Nascimento());
            ResultSet rs = pstmt.executeQuery();

            Long seq_Animal = null;
            if (rs.next()) {
                seq_Animal = new Long(rs.getLong("seq_Animal"));
                animal.setSeq_Animal(seq_Animal);
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
    public boolean atualizar(Animal animal) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE animal "
                    + " SET seq_Animal_Pai = ?, "
                    + "     seq_Animal_Mae = ? "
                    + "     nro_Animal = ? "
                    + "     dat_Nascimento = ? "
                    + " WHERE nro_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animal.getSeq_Animal_Pai());
            pstmt.setLong(2, animal.getSeq_Animal_Mae());
            pstmt.setString(3, animal.getNro_Animal());
            pstmt.setDate(4, (Date) animal.getDat_Nascimento());
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
    public boolean delete(Animal animal) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM animal WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animal.getSeq_Animal());
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
    public ArrayList<Animal> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM animal ORDER BY nro_Animal";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Animal> listAll = null;
            IAnimalDAO estadoDAO = new AnimalDAO();
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Animal animal = new Animal();
                    animal.setSeq_Animal(rs.getLong("seq_Animal"));
                    animal.setSeq_Animal_Pai(rs.getLong("seq_Animal_Pai"));
                    animal.setSeq_Animal_Mae(rs.getLong("seq_Animal_Mae"));
                    animal.setNro_Animal(rs.getString("nro_Animal"));
                    animal.setDat_Nascimento(rs.getDate("dat_Nascimento"));
                    listAll.add(animal);
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
    public Animal consultarPorSeq(Long seq) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM animal WHERE seq_Animal = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seq);
            ResultSet rs = pstmt.executeQuery();

            Animal animal = null;
            IAnimalDAO estadoDAO = new AnimalDAO();
            if (rs.next()) {
                animal = new Animal();
                animal.setSeq_Animal(rs.getLong("seq_Animal"));
                animal.setSeq_Animal_Pai(rs.getLong("seq_Animal_Pai"));
                animal.setSeq_Animal_Pai(rs.getLong("seq_Animal_Mae"));
                animal.setNro_Animal(rs.getString("nro_Animal"));
                animal.setDat_Nascimento(rs.getDate("dat_Nascimento"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return animal;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}