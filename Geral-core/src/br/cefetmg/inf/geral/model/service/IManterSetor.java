package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Setor;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterSetor {
    Long cadastrar(Setor setor) throws PersistenciaException, NegocioException;
    boolean alterar(Setor setor) throws PersistenciaException, NegocioException;
    boolean excluir(Setor setor) throws PersistenciaException, NegocioException;
    List<Setor> pesquisarTodos() throws PersistenciaException;
    Setor pesquisarPorCod(Long cod) throws PersistenciaException;
}


