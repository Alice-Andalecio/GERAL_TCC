package br.cefetmg.controller;

import br.cefetmg.inf.util.db.exception.PersistenciaException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Alice
 */

public class DietaController {
    public static String execute(HttpServletRequest request) throws PersistenciaException {
        String jsp;
        
        int num = Integer.parseInt(request.getParameter("num"));
        
        System.out.println(num);
        
        jsp = "/VisualizarExcluirAnimal.jsp";
        return jsp;
    }
}
