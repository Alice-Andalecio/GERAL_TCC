package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.Alimento;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IAlimentoDAO {
    public void inserir(Alimento alimento) throws PersistenciaException;
    public boolean atualizar(Alimento alimento) throws PersistenciaException;
    public boolean delete(Alimento alimento) throws PersistenciaException;
    public ArrayList<Alimento> listarTodos() throws PersistenciaException;
    public Alimento consultarPorCod(Long cod) throws PersistenciaException;
}
