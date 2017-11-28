package br.cefetmg.inf.geral.model.service.impl;

import br.cefetmg.inf.geral.model.dao.IAnimalDAO;
import br.cefetmg.inf.geral.model.dao.impl.AnimalDAO;
import br.cefetmg.inf.geral.model.domain.Animal;
import br.cefetmg.inf.geral.model.service.IManterAnimal;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public class ManterAnimal implements IManterAnimal {

    private IAnimalDAO animalDAO;

    public ManterAnimal() {
        animalDAO = new AnimalDAO();
    }

    @Override
    public Long cadastrar(Animal animal) throws PersistenciaException, NegocioException {
        if (animal.getSeq_Animal_Pai() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animal.getSeq_Animal_Mae() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animal.getNro_Animal() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animal.getDat_Nascimento() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        Long result = animalDAO.inserir(animal);
        return result;
    }

    @Override
    public boolean alterar(Animal animal) throws PersistenciaException, NegocioException {
        if (animal.getSeq_Animal_Pai() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animal.getSeq_Animal_Mae() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animal.getNro_Animal() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        if (animal.getDat_Nascimento() == null) {
            throw new NegocioException("O campo não pode ser nulo.");
        }

        boolean result = animalDAO.atualizar(animal);
        return result;
    }

    @Override
    public boolean excluir(Animal animal) throws PersistenciaException, NegocioException {
        boolean result = animalDAO.delete(animal);
        return result;
    }

    @Override
    public List<Animal> pesquisarTodos() throws PersistenciaException {
        List<Animal> result = animalDAO.listarTodos();
        return result;
    }

    @Override
    public Animal pesquisarPorSeq(Long seq) throws PersistenciaException {
        Animal result = animalDAO.consultarPorSeq(seq);
        return result;
    }
}
