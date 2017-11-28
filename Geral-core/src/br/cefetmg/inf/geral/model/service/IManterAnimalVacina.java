package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.AnimalVacina;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterAnimalVacina {
    Long cadastrar(AnimalVacina animalVacina) throws PersistenciaException, NegocioException;
    boolean alterar(AnimalVacina animalVacina) throws PersistenciaException, NegocioException;
    boolean excluir(AnimalVacina animalVacina) throws PersistenciaException, NegocioException;
    List<AnimalVacina> pesquisarTodos() throws PersistenciaException;
    AnimalVacina pesquisarPorSeq(Long seq) throws PersistenciaException;
}