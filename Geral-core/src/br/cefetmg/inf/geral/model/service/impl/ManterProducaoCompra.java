package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IProducaoCompraDAO;
import br.cefetmg.inf.geral.model.dao.impl.ProducaoCompraDAO;
import br.cefetmg.inf.geral.model.domain.ProducaoCompra;
import br.cefetmg.inf.geral.model.service.IManterProducaoCompra;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterProducaoCompra implements IManterProducaoCompra {

    private IProducaoCompraDAO producaoCompraDAO;

    public ManterProducaoCompra() {
        producaoCompraDAO = new ProducaoCompraDAO();
    }

    @Override
    public Long cadastrar(ProducaoCompra producaoCompra) throws PersistenciaException, NegocioException {
        if ((producaoCompra.getTxt_Observacao() == null) || (producaoCompra.getTxt_Observacao().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = producaoCompraDAO.inserir(producaoCompra);
        return result;
    }

    @Override
    public boolean alterar(ProducaoCompra producaoCompra) throws PersistenciaException, NegocioException {
        if ((producaoCompra.getTxt_Observacao() == null) || (producaoCompra.getTxt_Observacao().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = producaoCompraDAO.atualizar(producaoCompra);
        return result;
    }

    @Override
    public boolean excluir(ProducaoCompra producaoCompra) throws PersistenciaException, NegocioException {
        boolean result = producaoCompraDAO.delete(producaoCompra);
        return result;
    }

    @Override
    public List<ProducaoCompra> pesquisarTodos() throws PersistenciaException {
        List<ProducaoCompra> result = producaoCompraDAO.listarTodos();
        return result;
    }

    @Override
    public ProducaoCompra pesquisarPorSeq(Long seq) throws PersistenciaException {
        ProducaoCompra result = producaoCompraDAO.consultarPorSeq(seq);
        return result;
    }

}
