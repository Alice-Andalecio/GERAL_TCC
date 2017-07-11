package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.Animal;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IAnimal {
    Long inserir(Animal animal) throws PersistenciaException;
    boolean atualizar(Animal animal) throws PersistenciaException;
    boolean delete(Animal animal) throws PersistenciaException;
    ArrayList<Animal> listarTodos() throws PersistenciaException;
    Animal consultarPorId(Long id) throws PersistenciaException;
}