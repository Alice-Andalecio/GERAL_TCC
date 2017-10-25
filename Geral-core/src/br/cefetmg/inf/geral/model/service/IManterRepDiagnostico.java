package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.RepDiagnostico;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterRepDiagnostico {
    Long cadastrar(RepDiagnostico repdiag) throws PersistenciaException, NegocioException;
    boolean alterar(RepDiagnostico repdiag) throws PersistenciaException, NegocioException;
    boolean excluir(RepDiagnostico repdiag) throws PersistenciaException, NegocioException;
    List<RepDiagnostico> pesquisarTodos() throws PersistenciaException;
    RepDiagnostico pesquisarPorSeq(Long seq) throws PersistenciaException;
}


