/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.inf.geral.model.service.impl.Teste;

import org.junit.Test;
import static org.junit.Assert.*;
import br.cefetmg.inf.geral.model.service.impl.ManterAnimalVacina;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import br.cefetmg.inf.geral.model.dao.IAnimalVacinaDAO;
import br.cefetmg.inf.geral.model.dao.impl.AnimalVacinaDAO;
import br.cefetmg.inf.geral.model.domain.AnimalVacina;

/**
 *
 * @author Eduardo
 */
public class ManterAnimalVacinaTest {
    private IAnimalVacinaDAO animalVacinaDAO;
    
    public ManterAnimalVacinaTest() {
        animalVacinaDAO = new AnimalVacinaDAO();
    }
    
    
    @Test
    public void testCadastrar() throws Exception {
        ManterAnimalVacina objeto = new ManterAnimalVacina();
        System.out.println("Teste do método cadastrar");
        try{
            objeto.cadastrar(null);
        } catch (NegocioException e) {
            return;
        }
        fail("O teste não passou!!");
    }
    public void testAlterar() throws Exception {
        ManterAnimalVacina objeto = new ManterAnimalVacina();
        System.out.println("Teste do método alterar");

        try{
            objeto.alterar(null);
        } catch (NegocioException e) {
            return;
        }
        fail("O teste não passou!!");
    }
    public void testExcluir() throws Exception {
        ManterAnimalVacina objeto = new ManterAnimalVacina();
        System.out.println("Teste do método excluir");

        try{
            objeto.excluir(null);
        } catch (NegocioException | PersistenciaException e) {
            return;
        }
        fail("O teste não passou!!");
    }
        public void testPesquisarTodos() throws Exception {
        ManterAnimalVacina objeto = new ManterAnimalVacina();
        System.out.println("Teste do método pesquisarTodos");

        try{
            objeto.pesquisarTodos();
        } catch (PersistenciaException e) {
            return;
        }
        fail("O teste não passou!!");
    }
     public void testPesquisarPorCod() throws Exception {
        ManterAnimalVacina objeto = new ManterAnimalVacina();
        System.out.println("Teste do método pesquisarPorCod");

        try{
            AnimalVacina pesquisarPorSeq = objeto.pesquisarPorSeq(null);
        } catch (PersistenciaException e) {
            return;
        }
        fail("O teste não passou!!");
    }
}