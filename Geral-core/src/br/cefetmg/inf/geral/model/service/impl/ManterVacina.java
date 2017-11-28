package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IVacinaDAO;
import br.cefetmg.inf.geral.model.dao.impl.VacinaDAO;
import br.cefetmg.inf.geral.model.domain.Vacina;
import br.cefetmg.inf.geral.model.service.IManterVacina;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterVacina implements IManterVacina {

    private IVacinaDAO vacinaDAO;

    public ManterVacina() {
        vacinaDAO = new VacinaDAO();
    }

    @Override
    public Long cadastrar(Vacina vacina) throws PersistenciaException, NegocioException {
        if ((vacina.getNom_Vacina() == null) || (vacina.getNom_Vacina().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = vacinaDAO.inserir(vacina);
        return result;
    }

    @Override
    public boolean alterar(Vacina vacina) throws PersistenciaException, NegocioException {
        if ((vacina.getNom_Vacina() == null) || (vacina.getNom_Vacina().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = vacinaDAO.atualizar(vacina);
        return result;
    }

    @Override
    public boolean excluir(Vacina vacina) throws PersistenciaException, NegocioException {
        boolean result = vacinaDAO.delete(vacina);
        return result;
    }

    @Override
    public List<Vacina> pesquisarTodos() throws PersistenciaException {
        List<Vacina> result = vacinaDAO.listarTodos();
        return result;
    }

    @Override
    public Vacina pesquisarPorCod(Long cod) throws PersistenciaException {
        Vacina result = vacinaDAO.consultarPorCod(cod);
        return result;
    }
}
