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
        if (repdiag.getDataDiagnostico() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getHoraDiagnostico() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getDiagnostico() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getSexo() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getNumDias() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getReprodutor() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getRaca() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getDataCio() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getHoraCio() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getCio() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getMuco() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getTe() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getUtero() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getOvD() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getOvE() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getBase() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        Long result = repdiagDAO.inserir(repdiag);
        return result;
    }

    @Override
    public boolean alterar(RepDiagnostico repdiag) throws PersistenciaException, NegocioException {
        
        if (repdiag.getDataDiagnostico() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getHoraDiagnostico() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getDiagnostico() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getSexo() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getNumDias() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getReprodutor() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getRaca() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getDataCio() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getHoraCio() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getCio() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getMuco() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getTe() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getUtero() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getOvD() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getOvE() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        if (repdiag.getBase() == null) {
            throw new NegocioException("Insira a opção.");
        }
        
        boolean result = repdiagDAO.atualizar(repdiag);
        return result;
    }

    @Override
    public boolean excluir(RepDiagnostico repdiag) throws PersistenciaException, NegocioException {
        boolean result = repdiagDAO.delete(repdiag);
        return result;
    }

    @Override
    public List<RepDiagnostico> pesquisarTodos() throws PersistenciaException {
        List<RepDiagnostico> result = repdiagDAO.listarTodos();
        return result;
    }

    @Override
    public RepDiagnostico pesquisarPorSeq(Long seq) throws PersistenciaException {
         RepDiagnostico result = repdiagDAO.consultarPorSeq(seq);
        return result;
    }
}
