package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.Medicamento;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IMedicamentoDAO {
    public Long inserir(Medicamento medicamento) throws PersistenciaException;
    public boolean atualizar(Medicamento medicamento) throws PersistenciaException;
    public boolean delete(Medicamento medicamento) throws PersistenciaException;
    public ArrayList<Medicamento> listarTodos() throws PersistenciaException;
    public Medicamento consultarPorCod(Long cod) throws PersistenciaException;
}
