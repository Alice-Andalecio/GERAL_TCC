package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Comprador;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterComprador {
    Long cadastrar(Comprador comprador) throws PersistenciaException, NegocioException;
    boolean alterar(Comprador comprador) throws PersistenciaException, NegocioException;
    boolean excluir(Comprador comprador) throws PersistenciaException, NegocioException;
    List<Comprador> pesquisarTodos() throws PersistenciaException;
    Comprador pesquisarPorCod(Long cod) throws PersistenciaException;
}