package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.Setor;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface ISetorDAO {
    Long inserir(Setor setor) throws PersistenciaException;
    boolean atualizar(Setor setor) throws PersistenciaException;
    boolean delete(Setor setor) throws PersistenciaException;
    ArrayList<Setor> listarTodos() throws PersistenciaException;
    Setor consultarPorCod(Long cod) throws PersistenciaException;
}
