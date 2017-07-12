package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IMedicamentoDAO;
import br.cefetmg.inf.geral.model.dao.impl.MedicamentoDAO;
import br.cefetmg.inf.geral.model.domain.Medicamento;
import br.cefetmg.inf.geral.model.service.IManterMedicamento;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterMedicamento implements IManterMedicamento {

    private IMedicamentoDAO medicamentoDAO;

    public ManterMedicamento() {
        medicamentoDAO = new MedicamentoDAO();
    }

    @Override
    public Long cadastrar(Medicamento medicamento) throws PersistenciaException, NegocioException {
        if ((medicamento.getDes_Medicamento() == null) || (medicamento.getDes_Medicamento().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = medicamentoDAO.inserir(medicamento);
        return result;
    }

    @Override
    public boolean alterar(Medicamento medicamento) throws PersistenciaException, NegocioException {
        if ((medicamento.getDes_Medicamento() == null) || (medicamento.getDes_Medicamento().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = medicamentoDAO.atualizar(medicamento);
        return result;
    }

    @Override
    public boolean excluir(Medicamento medicamento) throws PersistenciaException, NegocioException {
        boolean result = medicamentoDAO.delete(medicamento);
        return result;
    }

    @Override
    public List<Medicamento> pesquisarTodos() throws PersistenciaException {
        List<Medicamento> result = medicamentoDAO.listarTodos();
        return result;
    }

    @Override
    public Medicamento pesquisarPorCod(Long cod) throws PersistenciaException {
        Medicamento result = medicamentoDAO.consultarPorCod(cod);
        return result;
    }
}
