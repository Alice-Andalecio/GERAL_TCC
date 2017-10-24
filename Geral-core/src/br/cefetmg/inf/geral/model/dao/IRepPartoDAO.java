package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.RepParto;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IRepPartoDAO {
    Long inserir(RepParto repparto) throws PersistenciaException;
    boolean atualizar(RepParto repparto) throws PersistenciaException;
    boolean delete(RepParto repparto) throws PersistenciaException;
    ArrayList<RepParto> listarTodos() throws PersistenciaException;
    RepParto consultarPorSeq(Long seq) throws PersistenciaException;
}
