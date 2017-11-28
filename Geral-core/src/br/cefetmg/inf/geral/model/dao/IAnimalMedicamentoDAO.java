package br.cefetmg.inf.geral.model.dao;

import br.cefetmg.inf.geral.model.domain.AnimalMedicamento;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IAnimalMedicamentoDAO {
    Long inserir(AnimalMedicamento animalMedicamento) throws PersistenciaException;
    boolean atualizar(AnimalMedicamento animalMedicamento) throws PersistenciaException;
    boolean delete(AnimalMedicamento animalMedicamento) throws PersistenciaException;
    ArrayList<AnimalMedicamento> listarTodos() throws PersistenciaException;
    AnimalMedicamento consultarPorSeq(Long seq) throws PersistenciaException;
}
