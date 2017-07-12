package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.ProducaoCompra;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterProducaoCompra {
    Long cadastrar(ProducaoCompra producaoCompra) throws PersistenciaException, NegocioException;
    boolean alterar(ProducaoCompra producaoCompra) throws PersistenciaException, NegocioException;
    boolean excluir(ProducaoCompra producaoCompra) throws PersistenciaException, NegocioException;
    List<ProducaoCompra> pesquisarTodos() throws PersistenciaException;
    ProducaoCompra pesquisarPorSeq(Long seq) throws PersistenciaException;
}