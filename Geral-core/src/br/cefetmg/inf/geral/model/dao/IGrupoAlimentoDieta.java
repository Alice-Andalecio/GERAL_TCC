package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.GrupoAlimentoDieta;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IGrupoAlimentoDieta {
    Long inserir(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException;
    boolean atualizar(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException;
    boolean delete(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException;
    ArrayList<GrupoAlimentoDieta> listarTodos() throws PersistenciaException;
    GrupoAlimentoDieta consultarPorCod(Long cod) throws PersistenciaException;
}