package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.RepDiagnostico;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IRepDiagnosticoDAO {
    Long inserir(RepDiagnostico repdiag) throws PersistenciaException;
    boolean atualizar(RepDiagnostico repdiag) throws PersistenciaException;
    boolean delete(RepDiagnostico repdiag) throws PersistenciaException;
    ArrayList<RepDiagnostico> listarTodos() throws PersistenciaException;
    RepDiagnostico consultarPorSeq(Long seq) throws PersistenciaException;
}
