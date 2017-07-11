package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.Medicamento;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IMedicamento {
    Long inserir(Medicamento medicamento) throws PersistenciaException;
    boolean atualizar(Medicamento medicamento) throws PersistenciaException;
    boolean delete(Medicamento medicamento) throws PersistenciaException;
    ArrayList<Medicamento> listarTodos() throws PersistenciaException;
    Medicamento consultarPorCod(Long cod) throws PersistenciaException;
}
