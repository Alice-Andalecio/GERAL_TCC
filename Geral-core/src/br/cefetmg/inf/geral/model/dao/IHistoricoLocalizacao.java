package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.HistoricoLocalizacao;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;


public interface IHistoricoLocalizacao {
    Long inserir(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException;
    boolean atualizar(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException;
    boolean delete(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException;
    ArrayList<HistoricoLocalizacao> listarTodos() throws PersistenciaException;
    HistoricoLocalizacao consultarPorId(Long id) throws PersistenciaException;
}
