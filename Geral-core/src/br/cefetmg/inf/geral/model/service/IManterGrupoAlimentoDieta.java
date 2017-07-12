package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.GrupoAlimentoDieta;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterGrupoAlimentoDieta {
    Long cadastrar(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException, NegocioException;
    boolean alterar(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException, NegocioException;
    boolean excluir(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException, NegocioException;
    List<GrupoAlimentoDieta> pesquisarTodos() throws PersistenciaException;
    GrupoAlimentoDieta pesquisarPorCod(Long cod) throws PersistenciaException;
}