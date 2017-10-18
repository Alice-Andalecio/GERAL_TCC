package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.domain.Usuario;
import java.util.List;
import br.cefetmg.inf.geral.model.dao.IUsuarioDAO;
import br.cefetmg.inf.geral.model.dao.impl.UsuarioDAO;
import br.cefetmg.inf.util.db.exception.PersistenciaException;

public class implementacaoUsuarioDAO implements IUsuarioDAO{
    private final IUsuarioDAO dao;
    public implementacaoUsuarioDAO(){
        dao = (IUsuarioDAO) new UsuarioDAO();
    }
    public implementacaoUsuarioDAO(IUsuarioDAO dao){
        this.dao = dao;
    }
    @Override
    public void inserir(Usuario obj)  throws PersistenciaException{
        dao.inserir(obj);
    }

    @Override
    public Usuario consultar(long id)  throws PersistenciaException{
        return dao.consultar(id);
    }

    @Override
    public boolean alterar(Usuario usuario)  throws PersistenciaException{
        return dao.alterar(usuario);
    }

    @Override
    public boolean excluir(Usuario usuario)  throws PersistenciaException{
        return dao.excluir(usuario);
    }

    @Override
    public List<Usuario> listar()  throws PersistenciaException{
        return dao.listar();
    }
    
    @Override
    public Usuario consultarPorUsuarioSenha(String usuario, String senha) throws PersistenciaException{
        return dao.consultarPorUsuarioSenha(usuario, senha);
    }
}
