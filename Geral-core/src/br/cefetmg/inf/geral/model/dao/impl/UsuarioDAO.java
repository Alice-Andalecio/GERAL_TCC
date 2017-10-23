package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IUsuarioDAO;
import br.cefetmg.inf.geral.model.domain.Usuario;
import br.cefetmg.inf.util.db.ConnectionManager;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements IUsuarioDAO {//SQL

    @Override
    public void inserir(Usuario usuario) throws PersistenciaException {

        try (Connection connection = ConnectionManager.getInstance().getConnection()) {

            String sql = "INSERT INTO usuario (nom_usuario, txt_Senha, cod_Email) VALUES(?,md5(?),?) RETURNING id_Usuario";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getSenha());
            pstmt.setString(3, usuario.getEmail());
            ResultSet rs = pstmt.executeQuery();

            Long id = null;
            if (rs.next()) {
                id = new Long(rs.getLong("id_Usuario"));
                usuario.setId(id);
            }

            rs.close();
            pstmt.close();

        } catch (Exception e) {
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public Usuario consultar(long idUsuario) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM usuario WHERE idt_Perfil = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, idUsuario);
            ResultSet rs = pstmt.executeQuery();

            Usuario usuario = null;
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getLong("id_Usuario"));
                usuario.setNome(rs.getString("nom_usuario"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("cod_Email"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public boolean alterar(Usuario usuario) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "UPDATE usuario "
                    + "   SET nom_usuario = ?, "
                    + "       txt_Senha = md5(?), "
                    + "       cod_Email = ? "
                    + " WHERE id_Usuario = ?;";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getSenha());
            pstmt.setString(3, usuario.getEmail());
            pstmt.setLong(4, usuario.getId());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public boolean excluir(Usuario usuario) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "DELETE FROM usuario WHERE id_Usuario = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, usuario.getId());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public List<Usuario> listar() throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();

            String sql = "SELECT * FROM usuario ORDER BY nom_usuario";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Usuario> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getLong("id_Usuario"));
                    usuario.setNome(rs.getString("nom_usuario"));
                    usuario.setSenha(rs.getString("txt_Senha"));
                    usuario.setEmail(rs.getString("cod_Email"));
                    listAll.add(usuario);
                } while (rs.next());
            }

            rs.close();
            pstmt.close();
            connection.close();

            return listAll;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }

    @Override
    public Usuario consultarPorUsuarioSenha(String usuarioLogin, String senha, boolean cripto) throws PersistenciaException {
        try {
            Connection connection = ConnectionManager.getInstance().getConnection();
            String sql = "";
            if (cripto) {
                sql = "SELECT * FROM usuario WHERE cod_email = ? AND txt_Senha = ?;";
            } else {
                sql = "SELECT * FROM usuario WHERE cod_email = ? AND txt_Senha = md5(?);";
            }
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, usuarioLogin);
            pstmt.setString(2, senha);
            ResultSet rs = pstmt.executeQuery();

            Usuario usuario = null;
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getLong("id_Usuario"));
                usuario.setNome(rs.getString("nom_usuario"));
                usuario.setSenha(rs.getString("txt_Senha"));
                usuario.setEmail(rs.getString("cod_Email"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersistenciaException(e.getMessage());
        }
    }
}
