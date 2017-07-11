package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.Parametro;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IParametro {
    Long inserir(Parametro parametro) throws PersistenciaException;
    boolean atualizar(Parametro parametro) throws PersistenciaException;
    boolean delete(Parametro parametro) throws PersistenciaException;
    ArrayList<Parametro> listarTodos() throws PersistenciaException;
    Parametro consultarPorId(Long id) throws PersistenciaException;
}