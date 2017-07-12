package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Grupo;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterGrupo {
    Long cadastrar(Grupo grupo) throws PersistenciaException, NegocioException;
    boolean alterar(Grupo grupo) throws PersistenciaException, NegocioException;
    boolean excluir(Grupo grupo) throws PersistenciaException, NegocioException;
    List<Grupo> pesquisarTodos() throws PersistenciaException;
    Grupo pesquisarPorCod(Long cod) throws PersistenciaException;
}
