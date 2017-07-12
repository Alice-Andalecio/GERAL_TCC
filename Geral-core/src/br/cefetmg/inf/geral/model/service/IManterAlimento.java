package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Alimento;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterAlimento {
    Long cadastrar(Alimento alimento) throws PersistenciaException, NegocioException;
    boolean alterar(Alimento alimento) throws PersistenciaException, NegocioException;
    boolean excluir(Alimento alimento) throws PersistenciaException, NegocioException;
    List<Alimento> pesquisarTodos() throws PersistenciaException;
    Alimento pesquisarPorCod(Long cod) throws PersistenciaException;
}

