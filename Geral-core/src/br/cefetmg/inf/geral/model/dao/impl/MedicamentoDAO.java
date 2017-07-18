package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IMedicamentoDAO;
import br.cefetmg.inf.geral.model.domain.Medicamento;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MedicamentoDAO implements IMedicamentoDAO {

    @Override
    public Long inserir(Medicamento medicamento) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO medicamento (des_Medicamento) VALUES(?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, medicamento.getDes_Medicamento());
            ResultSet rs = pstmt.executeQuery();

            Long cod_Medicamento = null;

            if (rs.next()) {
                cod_Medicamento = rs.getLong("cod_Medicamento");
                medicamento.setCod_Medicamento(cod_Medicamento);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return cod_Medicamento;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(Medicamento medicamento) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE medicamento "
                    + " SET des_Medicamento = ? "
                    + " WHERE cod_Medicamento = ? ";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, medicamento.getDes_Medicamento());
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
    public boolean delete(Medicamento medicamento) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM medicamento WHERE cod_Medicamento = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, medicamento.getCod_Medicamento());
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
    public ArrayList<Medicamento> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM medicamento ORDER BY cod_Medicamento";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Medicamento> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Medicamento medicamento = new Medicamento();
                    medicamento.setCod_Medicamento(rs.getLong("cod_Medicamento"));
                    medicamento.setDes_Medicamento(rs.getString("des_Medicamento"));
                    listAll.add(medicamento);
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
    public Medicamento consultarPorCod(Long cod) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM medicamento WHERE cod_Medicamento = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, cod);
            ResultSet rs = pstmt.executeQuery();

            Medicamento medicamento = null;
            if (rs.next()) {
                medicamento = new Medicamento();
                medicamento.setCod_Medicamento(rs.getLong("cod_Medicamento"));
                medicamento.setDes_Medicamento(rs.getString("des_Medicamento"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return medicamento;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }
}
