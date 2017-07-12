package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Procedencia;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterProcedencia {
    Long cadastrar(Procedencia procedencia) throws PersistenciaException, NegocioException;
    boolean alterar(Procedencia procedencia) throws PersistenciaException, NegocioException;
    boolean excluir(Procedencia procedencia) throws PersistenciaException, NegocioException;
    List<Procedencia> pesquisarTodos() throws PersistenciaException;
    Procedencia pesquisarPorSeq(Long seq) throws PersistenciaException;
}