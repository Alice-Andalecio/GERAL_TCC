package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Vacina;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterVacina {
    Long cadastrar(Vacina vacina) throws PersistenciaException, NegocioException;
    boolean alterar(Vacina vacina) throws PersistenciaException, NegocioException;
    boolean excluir(Vacina vacina) throws PersistenciaException, NegocioException;
    List<Vacina> pesquisarTodos() throws PersistenciaException;
    Vacina pesquisarPorCod(Long cod) throws PersistenciaException;
}