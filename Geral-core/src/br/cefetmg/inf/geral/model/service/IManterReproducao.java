package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Reproducao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterReproducao {
    Long cadastrar(Reproducao reproducao) throws PersistenciaException, NegocioException;
    boolean alterar(Reproducao reproducao) throws PersistenciaException, NegocioException;
    boolean excluir(Reproducao reproducao) throws PersistenciaException, NegocioException;
    List<Reproducao> pesquisarTodos() throws PersistenciaException;
    Reproducao pesquisarPorSeq(Long seq) throws PersistenciaException;
}
