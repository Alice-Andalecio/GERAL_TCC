package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IProducaoCompraDAO;
import br.cefetmg.inf.geral.model.domain.ProducaoCompra;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public class ProducaoCompraDAO implements IProducaoCompraDAO {

    @Override
    public Long inserir(ProducaoCompra producaoCompra) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(ProducaoCompra producaoCompra) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ProducaoCompra producaoCompra) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ProducaoCompra> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProducaoCompra consultarPorSeq(Long seq) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
