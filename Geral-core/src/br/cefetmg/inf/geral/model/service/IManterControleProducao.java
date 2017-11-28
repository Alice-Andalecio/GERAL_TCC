package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.ControleProducao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterControleProducao {
    Long cadastrar(ControleProducao controleProducao) throws PersistenciaException, NegocioException;
    boolean alterar(ControleProducao controleProducao) throws PersistenciaException, NegocioException;
    boolean excluir(ControleProducao controleProducao) throws PersistenciaException, NegocioException;
    List<ControleProducao> pesquisarTodos() throws PersistenciaException;
    ControleProducao pesquisarPorSeq(Long seq) throws PersistenciaException;
}