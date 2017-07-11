package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.Grupo;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IGrupo {
    Long inserir(Grupo grupo) throws PersistenciaException;
    boolean atualizar(Grupo grupo) throws PersistenciaException;
    boolean delete(Grupo grupo) throws PersistenciaException;
    ArrayList<Grupo> listarTodos() throws PersistenciaException;
    Grupo consultarPorCod(Long cod) throws PersistenciaException;
}
