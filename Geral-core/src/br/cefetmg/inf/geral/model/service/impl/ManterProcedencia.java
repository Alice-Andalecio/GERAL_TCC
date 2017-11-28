package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IProcedenciaDAO;
import br.cefetmg.inf.geral.model.dao.impl.ProcedenciaDAO;
import br.cefetmg.inf.geral.model.domain.Procedencia;
import br.cefetmg.inf.geral.model.service.IManterProcedencia;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterProcedencia implements IManterProcedencia {

    private IProcedenciaDAO procedenciaDAO;

    public ManterProcedencia() {
        procedenciaDAO = new ProcedenciaDAO();
    }

    @Override
    public Long cadastrar(Procedencia procedencia) throws PersistenciaException, NegocioException {
        if ((procedencia.getNom_Fazenda() == null) || (procedencia.getNom_Fazenda().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if ((procedencia.getNom_Proprietario() == null) || (procedencia.getNom_Proprietario().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (procedencia.getIdt_Proprietario() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = procedenciaDAO.inserir(procedencia);
        return result;
    }

    @Override
    public boolean alterar(Procedencia procedencia) throws PersistenciaException, NegocioException {
        if ((procedencia.getNom_Fazenda() == null) || (procedencia.getNom_Fazenda().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if ((procedencia.getNom_Proprietario() == null) || (procedencia.getNom_Proprietario().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (procedencia.getIdt_Proprietario() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = procedenciaDAO.atualizar(procedencia);
        return result;
    }

    @Override
    public boolean excluir(Procedencia procedencia) throws PersistenciaException, NegocioException {
        boolean result = procedenciaDAO.delete(procedencia);
        return result;
    }

    @Override
    public List<Procedencia> pesquisarTodos() throws PersistenciaException {
        List<Procedencia> result = procedenciaDAO.listarTodos();
        return result;
    }

    @Override
    public Procedencia pesquisarPorSeq(Long seq) throws PersistenciaException {
        Procedencia result = procedenciaDAO.consultarPorSeq(seq);
        return result;
    }
}
