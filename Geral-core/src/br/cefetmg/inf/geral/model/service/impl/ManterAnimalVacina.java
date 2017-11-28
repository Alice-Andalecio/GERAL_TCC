package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IAnimalVacinaDAO;
import br.cefetmg.inf.geral.model.dao.impl.AnimalVacinaDAO;
import br.cefetmg.inf.geral.model.domain.AnimalVacina;
import br.cefetmg.inf.geral.model.service.IManterAnimalVacina;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterAnimalVacina implements IManterAnimalVacina {

    private IAnimalVacinaDAO animalVacinaDAO;

    public ManterAnimalVacina() {
        animalVacinaDAO = new AnimalVacinaDAO();
    }

    @Override
    public Long cadastrar(AnimalVacina animalVacina) throws PersistenciaException, NegocioException {
        if (animalVacina.getDat_Vacinacao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = animalVacinaDAO.inserir(animalVacina);
        return result;
    }

    @Override
    public boolean alterar(AnimalVacina animalVacina) throws PersistenciaException, NegocioException {
        if (animalVacina.getDat_Vacinacao() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = animalVacinaDAO.atualizar(animalVacina);
        return result;
    }

    @Override
    public boolean excluir(AnimalVacina animalVacina) throws PersistenciaException, NegocioException {
        boolean result = animalVacinaDAO.delete(animalVacina);
        return result;
    }

    @Override
    public List<AnimalVacina> pesquisarTodos() throws PersistenciaException {
        List<AnimalVacina> result = animalVacinaDAO.listarTodos();
        return result;
    }

    @Override
    public AnimalVacina pesquisarPorSeq(Long seq) throws PersistenciaException {
        AnimalVacina result = animalVacinaDAO.consultarPorSeq(seq);
        return result;
    }
}
