package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.RepInseminacao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterRepInseminacao {
    Long cadastrar(RepInseminacao repinseminacao) throws PersistenciaException, NegocioException;
    boolean alterar(RepInseminacao repinseminacao) throws PersistenciaException, NegocioException;
    boolean excluir(RepInseminacao repinseminacao) throws PersistenciaException, NegocioException;
    List<RepInseminacao> pesquisarTodos() throws PersistenciaException;
    RepInseminacao pesquisarPorSeq(Long seq) throws PersistenciaException;
}
