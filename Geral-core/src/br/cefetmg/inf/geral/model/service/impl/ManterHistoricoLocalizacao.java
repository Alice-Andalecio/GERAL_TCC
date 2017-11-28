package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IHistoricoLocalizacaoDAO;
import br.cefetmg.inf.geral.model.dao.impl.HistoricoLocalizacaoDAO;
import br.cefetmg.inf.geral.model.domain.HistoricoLocalizacao;
import br.cefetmg.inf.geral.model.service.IManterHistoricoLocalizacao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.Date;
import java.util.List;

public class ManterHistoricoLocalizacao implements IManterHistoricoLocalizacao {

    private IHistoricoLocalizacaoDAO historicoLocalizacaoDAO;

    public ManterHistoricoLocalizacao() {
        historicoLocalizacaoDAO = new HistoricoLocalizacaoDAO();
    }

    @Override
    public Long cadastrar(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException, NegocioException {
        
        if ((historicoLocalizacao.getDat_Inicio_Localizacao()) == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = historicoLocalizacaoDAO.inserir(historicoLocalizacao);
        return result;
    }

    @Override
    public boolean alterar(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException, NegocioException {
        if ((historicoLocalizacao.getDat_Inicio_Localizacao()) == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }
        
        boolean result = historicoLocalizacaoDAO.atualizar(historicoLocalizacao);
        return result;
    }

    @Override
    public boolean excluir(HistoricoLocalizacao historicoLocalizacao) throws PersistenciaException, NegocioException {
        boolean result = historicoLocalizacaoDAO.delete(historicoLocalizacao);
        return result;
    }

    @Override
    public List<HistoricoLocalizacao> pesquisarTodos() throws PersistenciaException {
        List<HistoricoLocalizacao> result = historicoLocalizacaoDAO.listarTodos();
        return result;
    }

    @Override
    public HistoricoLocalizacao pesquisarPorDat(Date dat) throws PersistenciaException {
        HistoricoLocalizacao result = historicoLocalizacaoDAO.consultarPorDat(dat);
        return result;
    }
}
