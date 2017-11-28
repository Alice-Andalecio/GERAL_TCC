package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.ISetorDAO;
import br.cefetmg.inf.geral.model.dao.impl.SetorDAO;
import br.cefetmg.inf.geral.model.domain.Setor;
import br.cefetmg.inf.geral.model.service.IManterSetor;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterSetor implements IManterSetor {

    private ISetorDAO setorDAO;

    public ManterSetor() {
        setorDAO = new SetorDAO();
    }

    @Override
    public Long cadastrar(Setor setor) throws PersistenciaException, NegocioException {
         if ((setor.getNom_setor() == null) || (setor.getNom_setor().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = setorDAO.inserir(setor);
        return result;
    }

    @Override
    public boolean alterar(Setor setor) throws PersistenciaException, NegocioException {
        if ((setor.getNom_setor() == null) || (setor.getNom_setor().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = setorDAO.atualizar(setor);
        return result;
    }

    @Override
    public boolean excluir(Setor setor) throws PersistenciaException, NegocioException {
        boolean result = setorDAO.delete(setor);
        return result;
    }

    @Override
    public List<Setor> pesquisarTodos() throws PersistenciaException {
        List<Setor> result = setorDAO.listarTodos();
        return result;
    }

    @Override
    public Setor pesquisarPorCod(Long cod) throws PersistenciaException {
        Setor result = setorDAO.consultarPorCod(cod);
        return result;
    }

}
