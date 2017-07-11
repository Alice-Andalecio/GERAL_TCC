package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.AnimalVacina;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IAnimalVacina {
    Long inserir(AnimalVacina animalVacina) throws PersistenciaException;
    boolean atualizar(AnimalVacina animalVacina) throws PersistenciaException;
    boolean delete(AnimalVacina animalVacina) throws PersistenciaException;
    ArrayList<AnimalVacina> listarTodos() throws PersistenciaException;
    AnimalVacina consultarPorId(Long id) throws PersistenciaException;
}