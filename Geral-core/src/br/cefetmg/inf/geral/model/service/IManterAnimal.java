package br.cefetmg.inf.geral.model.service;

import br.cefetmg.inf.geral.model.domain.Animal;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterAnimal {
    Long cadastrar(Animal animal) throws PersistenciaException, NegocioException;
    boolean alterar(Animal animal) throws PersistenciaException, NegocioException;
    boolean excluir(Animal animal) throws PersistenciaException, NegocioException;
    List<Animal> pesquisarTodos() throws PersistenciaException;
    Animal pesquisarPorSeq(Long seq) throws PersistenciaException;
}
