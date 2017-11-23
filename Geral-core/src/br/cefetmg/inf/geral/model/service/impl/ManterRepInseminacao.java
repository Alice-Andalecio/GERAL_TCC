package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IRepInseminacaoDAO;
import br.cefetmg.inf.geral.model.dao.impl.RepInseminacaoDAO;
import br.cefetmg.inf.geral.model.domain.RepInseminacao;
import br.cefetmg.inf.geral.model.service.IManterRepInseminacao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterRepInseminacao implements IManterRepInseminacao {

    private IRepInseminacaoDAO repinseminacaoDAO;

    public ManterRepInseminacao() {
        repinseminacaoDAO = new RepInseminacaoDAO();
    }

    @Override
    public Long cadastrar(RepInseminacao repinseminacao) throws PersistenciaException, NegocioException {
      
        Long result = repinseminacaoDAO.inserir(repinseminacao);
        return result;
    }

    @Override
    public boolean alterar(RepInseminacao repinseminacao) throws PersistenciaException, NegocioException {

        boolean result = repinseminacaoDAO.atualizar(repinseminacao);
        return result;
    }

    @Override
    public boolean excluir(RepInseminacao repinseminacao) throws PersistenciaException, NegocioException {
        boolean result = repinseminacaoDAO.delete(repinseminacao);
        return result;
    }

    @Override
    public List<RepInseminacao> pesquisarTodos() throws PersistenciaException {
        List<RepInseminacao> result = repinseminacaoDAO.listarTodos();
        return result;
    }

    @Override
    public RepInseminacao pesquisarPorSeq(Long seq) throws PersistenciaException {
        RepInseminacao result = repinseminacaoDAO.consultarPorSeq(seq);
        return result;
    }
}
