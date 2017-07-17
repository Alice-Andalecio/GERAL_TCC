package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IAnimalMedicamentoDAO;
import br.cefetmg.inf.geral.model.dao.impl.AnimalMedicamentoDAO;
import br.cefetmg.inf.geral.model.domain.AnimalMedicamento;
import br.cefetmg.inf.geral.model.service.IManterAnimalMedicamento;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterAnimalMedicamento implements IManterAnimalMedicamento {

    private IAnimalMedicamentoDAO animalMedicamentoDAO;

    public ManterAnimalMedicamento() {
        animalMedicamentoDAO = new AnimalMedicamentoDAO();
    }

    @Override
    public Long cadastrar(AnimalMedicamento animalMedicamento) throws PersistenciaException, NegocioException {
        if (animalMedicamento.getDat_Inicio() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animalMedicamento.getDat_Fim() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if ((animalMedicamento.getTxt_Prescricao() == null) || (animalMedicamento.getTxt_Prescricao().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animalMedicamento.getQtd_Dosagem() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animalMedicamento.getQtd_Fequencia() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = animalMedicamentoDAO.inserir(animalMedicamento);
        return result;
    }

    @Override
    public boolean alterar(AnimalMedicamento animalMedicamento) throws PersistenciaException, NegocioException {
        if (animalMedicamento.getDat_Inicio() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animalMedicamento.getDat_Fim() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if ((animalMedicamento.getTxt_Prescricao() == null) || (animalMedicamento.getTxt_Prescricao().isEmpty())) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animalMedicamento.getQtd_Dosagem() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animalMedicamento.getQtd_Fequencia() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = animalMedicamentoDAO.atualizar(animalMedicamento);
        return result;
    }

    @Override
    public boolean excluir(AnimalMedicamento animalMedicamento) throws PersistenciaException, NegocioException {
        boolean result = animalMedicamentoDAO.delete(animalMedicamento);
        return result;
    }

    @Override
    public List<AnimalMedicamento> pesquisarTodos() throws PersistenciaException {
        List<AnimalMedicamento> result = animalMedicamentoDAO.listarTodos();
        return result;
    }

    @Override
    public AnimalMedicamento pesquisarPorSeq(Long seq) throws PersistenciaException {
        AnimalMedicamento result = animalMedicamentoDAO.consultarPorSeq(seq);
        return result;
    }
}
