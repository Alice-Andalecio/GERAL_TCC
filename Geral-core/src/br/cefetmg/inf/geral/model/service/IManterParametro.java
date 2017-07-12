package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Parametro;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterParametro {
    Long cadastrar(Parametro parametro) throws PersistenciaException, NegocioException;
    boolean alterar(Parametro parametro) throws PersistenciaException, NegocioException;
    boolean excluir(Parametro parametro) throws PersistenciaException, NegocioException;
    List<Parametro> pesquisarTodos() throws PersistenciaException;
    Parametro pesquisarPorCod(String cod) throws PersistenciaException;
}