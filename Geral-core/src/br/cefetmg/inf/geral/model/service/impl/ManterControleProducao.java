package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IControleProducaoDAO;
import br.cefetmg.inf.geral.model.dao.impl.ControleProducaoDAO;
import br.cefetmg.inf.geral.model.domain.ControleProducao;
import br.cefetmg.inf.geral.model.service.IManterControleProducao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterControleProducao implements IManterControleProducao {

    private IControleProducaoDAO controleProducaoDAO;

    public ManterControleProducao() {
        controleProducaoDAO = new ControleProducaoDAO();
    }

    @Override
    public Long cadastrar(ControleProducao controleProducao) throws PersistenciaException, NegocioException {
        if (controleProducao.getDat_producao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = controleProducaoDAO.inserir(controleProducao);
        return result;
    }

    @Override
    public boolean alterar(ControleProducao controleProducao) throws PersistenciaException, NegocioException {
        if (controleProducao.getDat_producao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = controleProducaoDAO.atualizar(controleProducao);
        return result;
    }

    @Override
    public boolean excluir(ControleProducao controleProducao) throws PersistenciaException, NegocioException {
        boolean result = controleProducaoDAO.delete(controleProducao);
        return result;
    }

    @Override
    public List<ControleProducao> pesquisarTodos() throws PersistenciaException {
        List<ControleProducao> result = controleProducaoDAO.listarTodos();
        return result;
    }

    @Override
    public ControleProducao pesquisarPorSeq(Long seq) throws PersistenciaException {
        ControleProducao result = controleProducaoDAO.consultarPorSeq(seq);
        return result;
    }

}
