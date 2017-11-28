package br.cefetmg.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jaops
 */
public class Servlet extends HttpServlet {

    private String jsp = "";

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acao = request.getParameter("acao");
        if (acao.equals("Logar")) {
            try {
                jsp = Login.execute(request);
            } catch (Exception ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        if (acao.equals("gravarCadUsuario")) {
            try {
                jsp = CadastroUsuarioController.execute(request);
            } catch (Exception ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (acao.equals("SalvarCadAnimal")) {
            try {
                jsp = CadastroAnimalController.execute(request);
            } catch (Exception ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (acao.equals("gravarMedicamento")) {
            try {
                jsp = CadastroMedicamentoController.execute(request);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (acao.equals("CadAnimal")) {
            try {
                jsp = VisualizarExcluirAnimalController.execute(request);
            } catch (Exception ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (acao.equals("GerarDieta")) {
            try {
                jsp = DietaController.execute(request);
            } catch (Exception ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (acao.equals("gravarInfoParto")) {
            try {
                jsp = RepPartoController.execute(request);
            } catch (Exception ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (acao.equals("ControleLeiteiro")) {
            try {
                jsp = ContoleLeiteiroController.execute(request);
            } catch (Exception ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         if (acao.equals("VendaLeite")) {
            try {
                jsp = VendaLeiteController.execute(request);
            } catch (Exception ex) {
                Logger.getLogger(Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        RequestDispatcher rd = request.getRequestDispatcher(jsp);
        rd.forward(request, response);
    }
}
