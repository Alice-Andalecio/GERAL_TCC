package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.Procedencia;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IProcedenciaDAO {
    Long inserir(Procedencia procedencia) throws PersistenciaException;
    boolean atualizar(Procedencia procedencia) throws PersistenciaException;
    boolean delete(Procedencia procedencia) throws PersistenciaException;
    ArrayList<Procedencia> listarTodos() throws PersistenciaException;
    Procedencia consultarPorSeq(Long seq) throws PersistenciaException;
}