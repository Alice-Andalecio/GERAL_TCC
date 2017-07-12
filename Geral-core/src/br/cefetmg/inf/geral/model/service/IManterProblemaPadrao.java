package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.ProblemaPadrao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterProblemaPadrao {
    Long cadastrar(ProblemaPadrao problemaPadrao) throws PersistenciaException, NegocioException;
    boolean alterar(ProblemaPadrao problemaPadrao) throws PersistenciaException, NegocioException;
    boolean excluir(ProblemaPadrao problemaPadrao) throws PersistenciaException, NegocioException;
    List<ProblemaPadrao> pesquisarTodos() throws PersistenciaException;
    ProblemaPadrao pesquisarPorCod(String cod) throws PersistenciaException;
}