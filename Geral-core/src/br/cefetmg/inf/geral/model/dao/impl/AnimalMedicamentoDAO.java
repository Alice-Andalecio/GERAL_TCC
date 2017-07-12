package br.cefetmg.inf.geral.model.dao.impl;

import br.cefetmg.inf.geral.model.dao.IAnimalMedicamentoDAO;
import br.cefetmg.inf.geral.model.domain.AnimalMedicamento;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public class AnimalMedicamentoDAO implements IAnimalMedicamentoDAO {

    @Override
    public Long inserir(AnimalMedicamento animalMedicamento) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(AnimalMedicamento animalMedicamento) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(AnimalMedicamento animalMedicamento) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AnimalMedicamento> listarTodos() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AnimalMedicamento consultarPorSeq(Long seq) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
