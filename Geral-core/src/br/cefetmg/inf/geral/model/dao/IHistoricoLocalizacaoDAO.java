package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.HistoricoLocalizacao;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;
import java.util.Date;


public interface IHistoricoLocalizacaoDAO {
    Long inserir(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException;
    boolean atualizar(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException;
    boolean delete(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException;
    ArrayList<HistoricoLocalizacao> listarTodos() throws PersistenciaException;
    HistoricoLocalizacao consultarPorDat(Date dat) throws PersistenciaException;
}
