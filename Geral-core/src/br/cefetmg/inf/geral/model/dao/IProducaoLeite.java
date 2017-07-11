package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.ProducaoLeite;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IProducaoLeite {
    Long inserir(ProducaoLeite producaoLeite) throws PersistenciaException;
    boolean atualizar(ProducaoLeite producaoLeite) throws PersistenciaException;
    boolean delete(ProducaoLeite producaoLeite) throws PersistenciaException;
    ArrayList<ProducaoLeite> listarTodos() throws PersistenciaException;
    ProducaoLeite consultarPorId(Long id) throws PersistenciaException;
}
