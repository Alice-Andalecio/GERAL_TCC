package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.RepParto;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterRepParto {
    Long cadastrar(RepParto repparto) throws PersistenciaException, NegocioException;
    boolean alterar(RepParto repparto) throws PersistenciaException, NegocioException;
    boolean excluir(RepParto repparto) throws PersistenciaException, NegocioException;
    List<RepParto> pesquisarTodos() throws PersistenciaException;
    RepParto pesquisarPorSeq(Long seq) throws PersistenciaException;
}
