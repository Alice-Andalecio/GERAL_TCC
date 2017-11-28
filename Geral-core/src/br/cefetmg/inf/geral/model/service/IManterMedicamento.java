package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Medicamento;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterMedicamento {
    Long cadastrar(Medicamento medicamento) throws PersistenciaException, NegocioException;
    boolean alterar(Medicamento medicamento) throws PersistenciaException, NegocioException;
    boolean excluir(Medicamento medicamento) throws PersistenciaException, NegocioException;
    List<Medicamento> pesquisarTodos() throws PersistenciaException;
    Medicamento pesquisarPorCod(Long cod) throws PersistenciaException;
}