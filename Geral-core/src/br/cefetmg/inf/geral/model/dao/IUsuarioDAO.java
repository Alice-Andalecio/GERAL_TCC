package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.Usuario;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IUsuarioDAO {
    public void inserir(Usuario obj) throws PersistenciaException;
    public Usuario consultar(long idUsuario) throws PersistenciaException;
    public boolean alterar(Usuario usuario) throws PersistenciaException;
    public boolean excluir(Usuario usuario) throws PersistenciaException;
    public List<Usuario> listar() throws PersistenciaException;
    public Usuario consultarPorUsuarioSenha(String usuario, String senha) throws PersistenciaException;
}