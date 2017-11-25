package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.GrupoAlimentoDieta;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Date;
import java.util.List;

public interface IManterGrupoAlimentoDieta {
   public void cadastrar(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException, NegocioException;
   public boolean alterar(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException, NegocioException;
   public boolean excluir(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException, NegocioException;
   public List<GrupoAlimentoDieta> pesquisarTodos() throws PersistenciaException;
   public GrupoAlimentoDieta pesquisarPorData(Date data) throws PersistenciaException;
}