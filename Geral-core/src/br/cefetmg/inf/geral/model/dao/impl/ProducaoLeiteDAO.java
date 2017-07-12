package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IProducaoLeiteDAO;
import br.cefetmg.inf.geral.model.domain.ProducaoLeite;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;
import java.util.Date;

public class ProducaoLeiteDAO implements IProducaoLeiteDAO{

    @Override
    public Long inserir(ProducaoLeite producaoLeite) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(ProducaoLeite producaoLeite) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ProducaoLeite producaoLeite) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ProducaoLeite> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProducaoLeite consultarPorDat(Date dat) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
