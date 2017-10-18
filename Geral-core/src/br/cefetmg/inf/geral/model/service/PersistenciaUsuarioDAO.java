package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Usuario;
import java.util.List;

public interface PersistenciaUsuarioDAO {
    
    public void inserirUsuario(Usuario obj);
    public Usuario consultarUsuario (long id);
    public boolean alterarUsuario(long idObjetoAntigo, Usuario novoObj);
    public Usuario excluirUsuario (long id);
    public List<Usuario> listarUsuario();
    public Usuario consultarPorUsuarioSenha(String usuario, String senha);

}
