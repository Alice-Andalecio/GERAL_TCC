package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.ProducaoCompra;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IProducaoCompraDAO {
    Long inserir(ProducaoCompra producaoCompra) throws PersistenciaException;
    boolean atualizar(ProducaoCompra producaoCompra) throws PersistenciaException;
    boolean delete(ProducaoCompra producaoCompra) throws PersistenciaException;
    ArrayList<ProducaoCompra> listarTodos() throws PersistenciaException;
    ProducaoCompra consultarPorSeq(Long seq) throws PersistenciaException;
}