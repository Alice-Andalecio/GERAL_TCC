package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.HistoricoLocalizacao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;
import java.util.Date;


public interface IManterHistoricoLocalizacao {
    Long cadastrar(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException, NegocioException;
    boolean alterar(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException, NegocioException;
    boolean excluir(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException, NegocioException;
    List<HistoricoLocalizacao> pesquisarTodos() throws PersistenciaException;
    HistoricoLocalizacao pesquisarPorDat(Date dat) throws PersistenciaException;
}