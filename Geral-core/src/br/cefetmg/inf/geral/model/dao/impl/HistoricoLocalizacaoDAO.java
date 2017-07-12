package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IHistoricoLocalizacaoDAO;
import br.cefetmg.inf.geral.model.domain.HistoricoLocalizacao;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;
import java.util.Date;

public class HistoricoLocalizacaoDAO implements IHistoricoLocalizacaoDAO {

    @Override
    public Long inserir(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<HistoricoLocalizacao> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HistoricoLocalizacao consultarPorDat(Date dat) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
