package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.GrupoAlimentoDieta;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.sql.Date;
import java.util.ArrayList;

public interface IGrupoAlimentoDietaDAO {
    public void inserir(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException;
    public boolean atualizar(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException;
    public boolean delete(GrupoAlimentoDieta grupoAlimentoDieta) throws PersistenciaException;
    public ArrayList<GrupoAlimentoDieta> listarTodos() throws PersistenciaException;
    public GrupoAlimentoDieta consultarPorData(Date data) throws PersistenciaException;
}