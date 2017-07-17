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

            String sql = "INSERT INTO animal (Seq_Animal_Pai, Seq_Animal_Mae, Nro_Animal, Dat_Nascimento ) VALUES(?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animal.getSeq_Animal_Pai());
            pstmt.setLong(2, animal.getSeq_Animal_Mae());
            pstmt.setString(3, animal.getNro_Animal());
            pstmt.setDate(4, (Date) animal.getDat_Nascimento());
            ResultSet rs = pstmt.executeQuery();

            Long Seq_Animal = null;
            if (rs.next()) {
                Seq_Animal = new Long(rs.getLong("Seq_Animal"));
                animal.setSeq_Animal(Seq_Animal);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return Seq_Animal;
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
                    + " SET Seq_Animal_Pai = ?, "
                    + "     Seq_Animal_Mae = ? "
                    + "     Nro_Animal = ? "
                    + "     Dat_Nascimento = ? "
                    + " WHERE id = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, animal.getSeq_Animal_Pai());
            pstmt.setLong(2, animal.getSeq_Animal_Mae());
            pstmt.setString(3, animal.getNro_Animal());
            pstmt.setDate(4, (Date) animal.getDat_Nascimento());
            pstmt.setLong(5, animal.getSeq_Animal());
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

            String sql = "DELETE FROM animal WHERE Seq_Animal = ?";

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

            String sql = "SELECT * FROM animal ORDER BY Nro_Animal";

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
                    animal.setNro_Animal(rs.getString("Nro_Animal"));
                    animal.setDat_Nascimento(rs.getDate("Dat_Nascimento"));
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

            String sql = "SELECT * FROM animal WHERE Seq_Animal = ?";

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
                animal.setNro_Animal(rs.getString("Nro_Animal"));
                animal.setDat_Nascimento(rs.getDate("Dat_Nascimento"));
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