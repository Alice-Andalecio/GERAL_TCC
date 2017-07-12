package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.AnimalMedicamento;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterAnimalMedicamento {
    Long cadastrar(AnimalMedicamento animalMedicamento) throws PersistenciaException, NegocioException;
    boolean alterar(AnimalMedicamento animalMedicamento) throws PersistenciaException, NegocioException;
    boolean excluir(AnimalMedicamento animalMedicamento) throws PersistenciaException, NegocioException;
    List<AnimalMedicamento> pesquisarTodos() throws PersistenciaException;
    AnimalMedicamento pesquisarPorSeq(Long seq) throws PersistenciaException;
}