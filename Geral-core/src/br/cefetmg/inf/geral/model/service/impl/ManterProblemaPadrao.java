package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IProblemaPadraoDAO;
import br.cefetmg.inf.geral.model.dao.impl.ProblemaPadraoDAO;
import br.cefetmg.inf.geral.model.domain.ProblemaPadrao;
import br.cefetmg.inf.geral.model.service.IManterProblemaPadrao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterProblemaPadrao implements IManterProblemaPadrao {

    private IProblemaPadraoDAO problemaPadraoDAO;

    public ManterProblemaPadrao() {
        problemaPadraoDAO = new ProblemaPadraoDAO();
    }

    @Override
    public Long cadastrar(ProblemaPadrao problemaPadrao) throws PersistenciaException, NegocioException {
        if ((problemaPadrao.getDes_Problema() == null) || (problemaPadrao.getDes_Problema().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = problemaPadraoDAO.inserir(problemaPadrao);
        return result;
    }

    @Override
    public boolean alterar(ProblemaPadrao problemaPadrao) throws PersistenciaException, NegocioException {
        if ((problemaPadrao.getDes_Problema() == null) || (problemaPadrao.getDes_Problema().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = problemaPadraoDAO.atualizar(problemaPadrao);
        return result;
    }

    @Override
    public boolean excluir(ProblemaPadrao problemaPadrao) throws PersistenciaException, NegocioException {
        boolean result = problemaPadraoDAO.delete(problemaPadrao);
        return result;
    }

    @Override
    public List<ProblemaPadrao> pesquisarTodos() throws PersistenciaException {
        List<ProblemaPadrao> result = problemaPadraoDAO.listarTodos();
        return result;
    }

    @Override
    public ProblemaPadrao pesquisarPorCod(String cod) throws PersistenciaException {
        ProblemaPadrao result = problemaPadraoDAO.consultarPorCod(cod);
        return result;
    }
}
