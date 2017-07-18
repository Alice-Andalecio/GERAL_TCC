/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.inf.geral.model.service.impl.Teste;


import br.cefetmg.inf.geral.model.domain.HistoricoLocalizacao;
import org.junit.Test;
import static org.junit.Assert.*;
import br.cefetmg.inf.geral.model.service.impl.ManterHistoricoLocalizacao;
import br.cefetmg.inf.util.db.exception.NegocioException;
import br.cefetmg.inf.util.db.exception.PersistenciaException;

/**
 *
 * @author Eduardo
 */
public class ManterHistoricoLocalizacaoTest {
    
    public ManterHistoricoLocalizacaoTest() {
    }
    
    @Test
    public void testCadastrar() throws Exception {
        ManterHistoricoLocalizacao objeto = new ManterHistoricoLocalizacao();
        System.out.println("Teste do método cadastrar");
        try{
            objeto.cadastrar(null);
        } catch (NegocioException | PersistenciaException e) {
            return;
        }
        fail("O teste não passou!!");
    }
    public void testAlterar() throws Exception {
        ManterHistoricoLocalizacao objeto = new ManterHistoricoLocalizacao();
        System.out.println("Teste do método alterar");

        try{
            objeto.alterar(null);
        } catch (NegocioException | PersistenciaException e) {
            return;
        }
        fail("O teste não passou!!");
    }
    public void testExcluir() throws Exception {
        ManterHistoricoLocalizacao objeto = new ManterHistoricoLocalizacao();
        System.out.println("Teste do método excluir");

        try{
            objeto.excluir(null);
        } catch (NegocioException | PersistenciaException e) {
            return;
        }
        fail("O teste não passou!!");
    }
        public void testPesquisarTodos() throws Exception {
        ManterHistoricoLocalizacao objeto = new ManterHistoricoLocalizacao();
        System.out.println("Teste do método pesquisarTodos");

        try{
            objeto.pesquisarTodos();
        } catch (PersistenciaException e) {
            return;
        }
        fail("O teste não passou!!");
    }
     public void testPesquisarPorCod() throws Exception {
        ManterHistoricoLocalizacao objeto = new ManterHistoricoLocalizacao();
        System.out.println("Teste do método pesquisarPorCod");

        try{
            HistoricoLocalizacao pesquisarPorDat = objeto.pesquisarPorDat(null);
        } catch (PersistenciaException e) {
            return;
        }
        fail("O teste não passou!!");
    }
}


