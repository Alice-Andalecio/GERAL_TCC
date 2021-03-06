/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.controller;

import br.cefetmg.inf.geral.model.dao.IMedicamentoDAO;
import br.cefetmg.inf.geral.model.dao.IUsuarioDAO;
import br.cefetmg.inf.geral.model.dao.impl.MedicamentoDAO;
import br.cefetmg.inf.geral.model.dao.impl.UsuarioDAO;
import br.cefetmg.inf.geral.model.domain.Medicamento;
import br.cefetmg.inf.geral.model.domain.Usuario;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Aluno
 */
public class CadastroMedicamentoController {

    public static String execute(HttpServletRequest request) {
        String jsp = "";
        try {
            String nomeMedicamento = request.getParameter("nomMed");
            String prescricaoMedicamento = request.getParameter("prescricaoMed");
            Medicamento medicamento = new Medicamento();
            medicamento.setNomeMedicamento(nomeMedicamento);
            medicamento.setDes_Medicamento(prescricaoMedicamento);
            IMedicamentoDAO m = new MedicamentoDAO();
            m.inserir(medicamento);

            IUsuarioDAO usuario = new UsuarioDAO();
            Usuario usu = usuario.consultar((long) request.getSession().getAttribute("codUsuario"));
            String senha = usu.getSenha();
            String email = usu.getEmail();
            Usuario usr = usuario.consultarPorUsuarioSenha(email, senha, true);
            String nome = usr.getNome();
            request.getSession().setAttribute("nome", nome);

            jsp = "/VisualizarExcluirAnimal.jsp";
        } catch (PersistenciaException ex) {
            Logger.getLogger(CadastroMedicamentoController.class.getName()).log(Level.SEVERE, null, ex);

        }
        return jsp;
    }
}
