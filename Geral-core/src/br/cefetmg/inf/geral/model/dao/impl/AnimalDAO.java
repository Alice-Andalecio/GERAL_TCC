package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IAnimalDAO;
import br.cefetmg.inf.geral.model.domain.Animal;
import br.cefetmg.inf.geral.model.domain.Usuario;
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
            Long seq_Animal;
            try (Connection connection = ConnectionManager.getInstance().getConnection()) {
                String sql = "INSERT INTO public.animal("
                        + " cod_grupo, cod_email, nro_animal,dat_nascimento, idt_tipo,"
                        + " idt_status, pelagem, peso, idade, nom_animal,num_sisbov, "
                        + " desmama, aptidao, num_pai,num_mae, entrada, brinco_eletronico,"
                        + " raca_pura, raca_mestica_1, raca_mestica_2, porcentagem_1, porcentagem_2,"
                        + " nome_pai, nome_mae)"
                        + " VALUES (?, ?, ?, "
                        + "            ?, ?, ?, ?, ?, ?, ?,"
                        + "            ?, ?, ?, ?, ?, ?, ?,"
                        + "            ?, ?, ?, ?, ?,"
                        + "            ?, ?);";
                
                
                try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
                    pstmt.setLong(1, animal.getCod_Grupo());
                    pstmt.setString(2, animal.getCod_email());
                    pstmt.setLong(3, animal.getNro_Animal());
                    pstmt.setDate(4, (Date) animal.getDat_Nascimento());
                    pstmt.setString(5, animal.getIdt_Tipo());
                    pstmt.setString(6, animal.getIdt_Status());
                    pstmt.setString(7, animal.getPelagem());
                    pstmt.setLong(8, animal.getPeso());
                    pstmt.setLong(9, animal.getIdade());
                    pstmt.setString(10, animal.getNomeAnimal());
                    pstmt.setLong(11, animal.getNumSisbov());
                    pstmt.setDate(12, (Date) animal.getDesmama());
                    pstmt.setDate(13, (Date) animal.getAptidao());
                    pstmt.setLong(14, animal.getNumPai());
                    pstmt.setLong(15, animal.getNumMae());
                    pstmt.setDate(16, (Date) animal.getEntrada());
                    pstmt.setLong(17, animal.getBrincoEletronico());
                    pstmt.setString(18, animal.getRacaPura());
                    pstmt.setString(19, animal.getRacaMestica_1());
                    pstmt.setString(20, animal.getRacaMestica_2());
                    Long teste = animal.getPorcentagem_1();
                    pstmt.setLong(21, animal.getPorcentagem_1());
                    pstmt.setLong(22, animal.getPorcentagem_2());
                    pstmt.setString(23, animal.getNomePai());
                    pstmt.setString(24, animal.getNomeMae());
                    ResultSet rs = pstmt.executeQuery();
                    seq_Animal = null;
                    if (rs.next()) {
                        seq_Animal = new Long(rs.getLong("seq_Animal"));
                        animal.setSeq_Animal(seq_Animal);
                    }   rs.close();
                }
            }

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

            String sql = "UPDATE public.animal"
                    + "   SET seq_animal=?, seq_procedencia=?, cod_grupo=?, cod_email=?, nro_animal=?,"
                    + "       dat_nascimento=?, idt_tipo=?, idt_status=?, pelagem=?, peso=?,"
                    + "       idade=?, nom_animal=?, num_sisbov=?, desmama=?, aptidao=?, num_pai=?,"
                    + "       num_mae=?, entrada=?, brinco_eletronico=?, raca_pura=?, raca_mestica_1=?,"
                    + "       raca_mestica_2=?, porcentagem_1=?, porcentagem_2=?, nome_pai=?,"
                    + "       nome_mae=?"
                    + " WHERE seq_animal = ?;";

            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setLong(1, animal.getSeq_Procedencia());
            pstmt.setLong(2, animal.getCod_Grupo());
            pstmt.setLong(3, animal.getNro_Animal());
            pstmt.setDate(4, (Date) animal.getDat_Nascimento());
            pstmt.setString(5, animal.getIdt_Tipo());
            pstmt.setString(6, animal.getIdt_Status());
            pstmt.setString(7, animal.getPelagem());
            pstmt.setLong(8, animal.getPeso());
            pstmt.setLong(9, animal.getIdade());
            pstmt.setString(10, animal.getNomeAnimal());
            pstmt.setLong(11, animal.getNumSisbov());
            pstmt.setDate(12, (Date) animal.getDesmama());
            pstmt.setDate(13, (Date) animal.getAptidao());
            pstmt.setLong(14, animal.getNumPai());
            pstmt.setLong(15, animal.getNumMae());
            pstmt.setDate(16, (Date) animal.getEntrada());
            pstmt.setLong(17, animal.getBrincoEletronico());
            pstmt.setString(18, animal.getRacaPura());
            pstmt.setString(19, animal.getRacaMestica_1());
            pstmt.setString(20, animal.getRacaMestica_2());
            pstmt.setLong(21, animal.getPorcentagem_1());
            pstmt.setLong(22, animal.getPorcentagem_2());
            pstmt.setString(23, animal.getNomePai());
            pstmt.setString(24, animal.getNomeMae());

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
                    animal.setCod_Grupo(rs.getLong("cod_grupo"));
                    animal.setNro_Animal(rs.getLong("nro_animal"));
                    animal.setDat_Nascimento(rs.getDate("dat_nascimento"));
                    animal.setIdt_Tipo(rs.getString("idt_tipo"));
                    animal.setIdt_Status(rs.getString("idt_status"));
                    animal.setPelagem(rs.getString("pelagem"));
                    animal.setPeso(rs.getInt("peso"));
                    animal.setIdade(rs.getInt("idade"));
                    animal.setNomeAnimal(rs.getString("nom_animal"));
                    animal.setNumSisbov(rs.getLong("num_sisbov"));
                    animal.setDesmama(rs.getDate("desmama"));
                    animal.setAptidao(rs.getDate("aptidao"));
                    animal.setNumPai(rs.getLong("num_pai"));
                    animal.setNumMae(rs.getLong("num_mae"));
                    animal.setEntrada(rs.getDate("entrada"));
                    animal.setBrincoEletronico(rs.getLong("brinco_eletronico"));
                    animal.setRacaPura(rs.getString("raca_pura"));
                    animal.setRacaMestica_1(rs.getString("raca_mestica_1"));
                    animal.setRacaMestica_2(rs.getString("raca_mestica_2"));
                    animal.setPorcentagem_1(rs.getLong("porcentagem_1"));
                    animal.setPorcentagem_2(rs.getLong("porcentagem_2"));
                    animal.setNomePai(rs.getString("nome_pai"));
                    animal.setNomeMae(rs.getString("nome_mae"));

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
                animal.setCod_Grupo(rs.getLong("cod_grupo"));
                animal.setNro_Animal(rs.getLong("nro_animal"));
                animal.setDat_Nascimento(rs.getDate("dat_nascimento"));
                animal.setIdt_Tipo(rs.getString("idt_tipo"));
                animal.setIdt_Status(rs.getString("idt_status"));
                animal.setPelagem(rs.getString("pelagem"));
                animal.setPeso(rs.getInt("peso"));
                animal.setIdade(rs.getInt("idade"));
                animal.setNomeAnimal(rs.getString("nom_animal"));
                animal.setNumSisbov(rs.getLong("num_sisbov"));
                animal.setDesmama(rs.getDate("desmama"));
                animal.setAptidao(rs.getDate("aptidao"));
                animal.setNumPai(rs.getLong("num_pai"));
                animal.setNumMae(rs.getLong("num_mae"));
                animal.setEntrada(rs.getDate("entrada"));
                animal.setBrincoEletronico(rs.getLong("brinco_eletronico"));
                animal.setRacaPura(rs.getString("raca_pura"));
                animal.setRacaMestica_1(rs.getString("raca_mestica_1"));
                animal.setRacaMestica_2(rs.getString("raca_mestica_2"));
                animal.setPorcentagem_1(rs.getLong("porcentagem_1"));
                animal.setPorcentagem_2(rs.getLong("porcentagem_2"));
                animal.setNomePai(rs.getString("nome_pai"));
                animal.setNomeMae(rs.getString("nome_mae"));

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
