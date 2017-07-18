package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.ProblemaPadrao;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IProblemaPadraoDAO {
    String inserir(ProblemaPadrao problemaPadrao) throws PersistenciaException;
    boolean atualizar(ProblemaPadrao problemaPadrao) throws PersistenciaException;
    boolean delete(ProblemaPadrao problemaPadrao) throws PersistenciaException;
    ArrayList<ProblemaPadrao> listarTodos() throws PersistenciaException;
    ProblemaPadrao consultarPorCod(String cod) throws PersistenciaException;
}