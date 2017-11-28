package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IUsuarioDAO;
import br.cefetmg.inf.geral.model.dao.impl.UsuarioDAO;
import br.cefetmg.inf.geral.model.domain.Usuario;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

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
    public Usuario consultarEmail(String email)  throws PersistenciaException{
        return dao.consultarEmail(email);
    }

    @Override
    public boolean alterar(Usuario usuario)  throws PersistenciaException{
        return dao.alterar(usuario);
    }
    
    @Override
    public boolean alterar(String email, boolean emailVerificado)  throws PersistenciaException{
        return dao.alterar(email, emailVerificado);
    }
    
    @Override
    public boolean alterar(String email, int codigoValidacao)  throws PersistenciaException{
        return dao.alterar(email, codigoValidacao);
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
    public Usuario consultarPorUsuarioSenha(String usuario, String senha, boolean cripto) throws PersistenciaException{
        return dao.consultarPorUsuarioSenha(usuario, senha, cripto);
    }
}
