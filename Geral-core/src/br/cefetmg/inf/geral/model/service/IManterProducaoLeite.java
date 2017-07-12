package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.ProducaoLeite;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;
import java.util.Date;

public interface IManterProducaoLeite {
    Long cadastrar(ProducaoLeite producaoLeite) throws PersistenciaException, NegocioException;
    boolean alterar(ProducaoLeite producaoLeite) throws PersistenciaException, NegocioException;
    boolean excluir(ProducaoLeite producaoLeite) throws PersistenciaException, NegocioException;
    List<ProducaoLeite> pesquisarTodos() throws PersistenciaException;
    ProducaoLeite pesquisarPorDat(Date dat) throws PersistenciaException;
}
