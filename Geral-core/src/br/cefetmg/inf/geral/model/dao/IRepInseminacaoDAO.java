package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.RepInseminacao;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IRepInseminacaoDAO {
    Long inserir(RepInseminacao repinseminacao) throws PersistenciaException;
    boolean atualizar(RepInseminacao repinseminacao) throws PersistenciaException;
    boolean delete(RepInseminacao repinseminacao) throws PersistenciaException;
    ArrayList<RepInseminacao> listarTodos() throws PersistenciaException;
    RepInseminacao consultarPorSeq(Long seq) throws PersistenciaException;
}

