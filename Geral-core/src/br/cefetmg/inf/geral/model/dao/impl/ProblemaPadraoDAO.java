package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IProblemaPadraoDAO;
import br.cefetmg.inf.geral.model.domain.ProblemaPadrao;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProblemaPadraoDAO implements IProblemaPadraoDAO {

    @Override
    public String inserir(ProblemaPadrao problemaPadrao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "INSERT INTO problema_padrao (des_Problema) VALUES(?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, problemaPadrao.getDes_Problema());
            ResultSet rs = pstmt.executeQuery();

            String cod = null;
            if (rs.next()) {
                cod = new String(rs.getString("cod_Problema"));
                problemaPadrao.setCod_Problema(cod);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return cod;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

    @Override
    public boolean atualizar(ProblemaPadrao problemaPadrao) throws PersistenciaException {
        try {

            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE problema_padrao "
                    + " SET des_Problema = ?"
                    + " WHERE cod_Problema = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, problemaPadrao.getDes_Problema());
            pstmt.setString(2, problemaPadrao.getCod_Problema());
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
    public boolean delete(ProblemaPadrao problemaPadrao) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM problema_padrao WHERE cod_Problema = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, problemaPadrao.getCod_Problema());
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
    public ArrayList<ProblemaPadrao> listarTodos() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM problema_padrao ORDER BY des_Problema";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<ProblemaPadrao> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    ProblemaPadrao problemaPadrao = new ProblemaPadrao();
                    problemaPadrao.setCod_Problema(rs.getString("cod_Problema"));
                    problemaPadrao.setDes_Problema(rs.getString("des_Problema"));
                    listAll.add(problemaPadrao);
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
    public ProblemaPadrao consultarPorCod(String cod) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM problema_padrao WHERE cod_Problema = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cod);
            ResultSet rs = pstmt.executeQuery();

            ProblemaPadrao problemaPadrao = null;
            if (rs.next()) {
                problemaPadrao = new ProblemaPadrao();
                problemaPadrao.setCod_Problema(rs.getString("cod_Problema"));
                problemaPadrao.setDes_Problema(rs.getString("des_Problema"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return problemaPadrao;

        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage(), e);
        }
    }

}
