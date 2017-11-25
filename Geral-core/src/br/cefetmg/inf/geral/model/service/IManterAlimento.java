package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Alimento;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterAlimento {
    public void cadastrar(Alimento alimento) throws PersistenciaException, NegocioException;
    public boolean alterar(Alimento alimento) throws PersistenciaException, NegocioException;
    public boolean excluir(Alimento alimento) throws PersistenciaException, NegocioException;
    public List<Alimento> pesquisarTodos() throws PersistenciaException;
    public Alimento pesquisarPorCod(Long cod) throws PersistenciaException;
}

