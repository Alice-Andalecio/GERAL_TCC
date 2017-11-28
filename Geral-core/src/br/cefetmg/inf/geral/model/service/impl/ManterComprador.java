package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.ICompradorDAO;
import br.cefetmg.inf.geral.model.dao.impl.CompradorDAO;
import br.cefetmg.inf.geral.model.domain.Comprador;
import br.cefetmg.inf.geral.model.service.IManterComprador;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterComprador implements IManterComprador {

    private ICompradorDAO compradorDAO;

    public ManterComprador() {
        compradorDAO = new CompradorDAO();
    }

    @Override
    public Long cadastrar(Comprador comprador) throws PersistenciaException, NegocioException {
        if ((comprador.getNom_Comprador() == null) || (comprador.getNom_Comprador().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = compradorDAO.inserir(comprador);
        return result;
    }

    @Override
    public boolean alterar(Comprador comprador) throws PersistenciaException, NegocioException {
        if ((comprador.getNom_Comprador() == null) || (comprador.getNom_Comprador().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = compradorDAO.atualizar(comprador);
        return result;
    }

    @Override
    public boolean excluir(Comprador comprador) throws PersistenciaException, NegocioException {
        boolean result = compradorDAO.delete(comprador);
        return result;
    }

    @Override
    public List<Comprador> pesquisarTodos() throws PersistenciaException {
        List<Comprador> result = compradorDAO.listarTodos();
        return result;
    }

    @Override
    public Comprador pesquisarPorCod(Long cod) throws PersistenciaException {
        Comprador result = compradorDAO.consultarPorCod(cod);
        return result;
    }
}
