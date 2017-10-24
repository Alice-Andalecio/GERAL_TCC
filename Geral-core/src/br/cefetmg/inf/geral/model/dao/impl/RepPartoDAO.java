package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IRepPartoDAO;
import br.cefetmg.inf.geral.model.domain.RepParto;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

public class RepPartoDAO implements IRepPartoDAO {
    
    @Override
    public Long inserir(RepParto repparto) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO repparto (nro_Animal, nom_Animal, perParto1, perParto2, diasGest, tipo, dataParto, horaParto, grau, numCria1, pelagem1, peso1, sexo1, numCria2, pelagem2, peso2, sexo2) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, repparto.getNro_Animal());
            pstmt.setString(2, repparto.getNom_Animal());
            pstmt.setDate(3, (Date) repparto.getPerParto1());
            pstmt.setDate(4, (Date) repparto.getPerParto2());
            pstmt.setString(5, repparto.getDiasGest());
            pstmt.setString(6, repparto.getTipo());
            pstmt.setDate(7, (Date) repparto.getDataParto());
            pstmt.setTime(8, (Time) repparto.getHoraParto());
            pstmt.setString(9, repparto.getTipoParto());
            pstmt.setString(10, repparto.getGrau());
            pstmt.setString(11, repparto.getNumCria1());
            pstmt.setString(12, repparto.getPelagem1());
            pstmt.setString(13, repparto.getPeso1());
            pstmt.setString(14, repparto.getSexo1());
            pstmt.setString(15, repparto.getNumCria2());
            pstmt.setString(16, repparto.getPelagem2());
            pstmt.setString(17, repparto.getPeso2());
            pstmt.setString(18, repparto.getSexo2());
            ResultSet rs = pstmt.executeQuery();
            
            Long seq = null;
            if (rs.next()) {
                seq = new Long(rs.getLong("seq_Reproducao"));
                repparto.setSeq_ReproducaoParto(seq);
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
    public boolean atualizar(RepParto repparto) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE repparto "
                    + " SET nro_Animal = ?, "
                    + "     nom_Animal = ?"
                    + "     perParto1 = ?"
                    + "     perParto2 = ?"
                    + "     diasGest = ?"
                    + "     tipo = ?"
                    + "     dataParto = ?"
                    + "     horaParto = ?"
                    + "     tipoParto = ?"
                    + "     grau = ?"
                    + "     numCria1 = ?"
                    + "     pelagem1 = ?"
                    + "     peso1 = ?"
                    + "     sexo1 = ?"
                    + "     numCria2 = ?"
                    + "     pelagem2 = ?"
                    + "     peso2 = ?"
                    + "     sexo2 = ?"
                    + " WHERE seq_ReproducaoParto = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, repparto.getNro_Animal());
            pstmt.setString(2, repparto.getNom_Animal());
            pstmt.setDate(3, (Date) repparto.getPerParto1());
            pstmt.setDate(4, (Date) repparto.getPerParto2());
            pstmt.setString(5, repparto.getDiasGest());
            pstmt.setString(6, repparto.getTipo());
            pstmt.setDate(7, (Date) repparto.getDataParto());
            pstmt.setTime(8, (Time) repparto.getHoraParto());
            pstmt.setString(9, repparto.getTipoParto());
            pstmt.setString(10, repparto.getGrau());
            pstmt.setString(11, repparto.getNumCria1());
            pstmt.setString(12, repparto.getPelagem1());
            pstmt.setString(13, repparto.getPeso1());
            pstmt.setString(14, repparto.getSexo1());
            pstmt.setString(15, repparto.getNumCria2());
            pstmt.setString(16, repparto.getPelagem2());
            pstmt.setString(17, repparto.getPeso2());
            pstmt.setString(18, repparto.getSexo2());
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
    public boolean delete(RepParto repparto) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM repparto WHERE seq_ReproducaoParto = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, repparto.getNro_Animal());
            pstmt.setString(2, repparto.getNom_Animal());
            pstmt.setDate(3, (Date) repparto.getPerParto1());
            pstmt.setDate(4, (Date) repparto.getPerParto2());
            pstmt.setString(5, repparto.getDiasGest());
            pstmt.setString(6, repparto.getTipo());
            pstmt.setDate(7, (Date) repparto.getDataParto());
            pstmt.setTime(8, (Time) repparto.getHoraParto());
            pstmt.setString(9, repparto.getTipoParto());
            pstmt.setString(10, repparto.getGrau());
            pstmt.setString(11, repparto.getNumCria1());
            pstmt.setString(12, repparto.getPelagem1());
            pstmt.setString(13, repparto.getPeso1());
            pstmt.setString(14, repparto.getSexo1());
            pstmt.setString(15, repparto.getNumCria2());
            pstmt.setString(16, repparto.getPelagem2());
            pstmt.setString(17, repparto.getPeso2());
            pstmt.setString(18, repparto.getSexo2());
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
    public ArrayList<RepParto> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM repparto ORDER BY seq_ReproducaoParto";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<RepParto> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    RepParto repparto = new RepParto();
                    repparto.setNro_Animal(rs.getString("nro_Animal"));
                    repparto.setNom_Animal(rs.getString("nom_Animal"));
                    repparto.setPerParto1(rs.getDate("perParto1"));
                    repparto.setPerParto2(rs.getDate("perParto2"));
                    repparto.setDiasGest(rs.getString("diasGest"));
                    repparto.setTipo(rs.getString("tipo"));
                    repparto.setDataParto(rs.getDate("dataParto")); 
                    repparto.setHoraParto(rs.getTime("horaParto"));        
                    repparto.setTipoParto(rs.getString("tipoParto"));        
                    repparto.setGrau(rs.getString("grau"));        
                    repparto.setNumCria1(rs.getString("numCria1"));        
                    repparto.setPelagem1(rs.getString("pelagem1"));        
                    repparto.setPeso1(rs.getString("peso1"));        
                    repparto.setSexo1(rs.getString("sexo1"));        
                    repparto.setNumCria2(rs.getString("numCria2"));        
                    repparto.setPelagem2(rs.getString("pelagem2")); 
                    repparto.setPeso2(rs.getString("peso2")); 
                    repparto.setSexo2(rs.getString("sexo2")); 
                    listAll.add(repparto);
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
    
    public RepParto consultarPorSeq(Long seq) throws PersistenciaException {
       try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM reproducao WHERE seq_ReproducaoParto = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seq);
            ResultSet rs = pstmt.executeQuery();

            RepParto repparto = null;
            if (rs.next()) {
                repparto = new RepParto();
                repparto.setNro_Animal(rs.getString("nro_Animal"));
                repparto.setNom_Animal(rs.getString("nom_Animal"));
                repparto.setPerParto1(rs.getDate("perParto1"));
                repparto.setPerParto2(rs.getDate("perParto2"));
                repparto.setDiasGest(rs.getString("diasGest"));
                repparto.setTipo(rs.getString("tipo"));
                repparto.setDataParto(rs.getDate("dataParto")); 
                repparto.setHoraParto(rs.getTime("horaParto"));        
                repparto.setTipoParto(rs.getString("tipoParto"));        
                repparto.setGrau(rs.getString("grau"));        
                repparto.setNumCria1(rs.getString("numCria1"));        
                repparto.setPelagem1(rs.getString("pelagem1"));        
                repparto.setPeso1(rs.getString("peso1"));        
                repparto.setSexo1(rs.getString("sexo1"));        
                repparto.setNumCria2(rs.getString("numCria2"));        
                repparto.setPelagem2(rs.getString("pelagem2")); 
                repparto.setPeso2(rs.getString("peso2")); 
                repparto.setSexo2(rs.getString("sexo2")); 
            }

            rs.close();
            pstmt.close();
            connection.close();

            return repparto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
} 