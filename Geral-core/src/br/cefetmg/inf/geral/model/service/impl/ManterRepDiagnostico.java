package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IRepDiagnosticoDAO;
import br.cefetmg.inf.geral.model.dao.impl.RepDiagosticoDAO;
import br.cefetmg.inf.geral.model.domain.RepDiagnostico;
import br.cefetmg.inf.geral.model.service.IManterRepDiagnostico;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterRepDiagnostico implements IManterRepDiagnostico{
    
    private IRepDiagnosticoDAO repdiagDAO;

    public ManterRepDiagnostico() {
        repdiagDAO = new RepDiagosticoDAO();
    }

    @Override
    public Long cadastrar(RepDiagnostico repdiag) throws PersistenciaException, NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(RepDiagnostico repdiag) throws PersistenciaException, NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(RepDiagnostico repdiag) throws PersistenciaException, NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RepDiagnostico> pesquisarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RepDiagnostico pesquisarPorSeq(Long seq) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
