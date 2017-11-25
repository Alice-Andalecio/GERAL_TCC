package br.cefetmg.controller;

import br.cefetmg.inf.geral.model.dao.IAlimentoDAO;
import br.cefetmg.inf.geral.model.dao.IGrupoAlimentoDietaDAO;
import br.cefetmg.inf.geral.model.dao.impl.AlimentoDAO;
import br.cefetmg.inf.geral.model.dao.impl.GrupoAlimentoDietaDAO;
import br.cefetmg.inf.geral.model.domain.Alimento;
import br.cefetmg.inf.geral.model.domain.GrupoAlimentoDieta;
import br.cefetmg.inf.util.db.exception.PersistenciaException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Alice
 */
public class DietaController {
  public static String execute(HttpServletRequest request) throws PersistenciaException, ParseException {
        String jsp;

        int num = Integer.parseInt(request.getParameter("num"));
        long numOutra = 9;

        GrupoAlimentoDieta gad = new GrupoAlimentoDieta();
        Alimento a = new Alimento();

        IGrupoAlimentoDietaDAO manterGad = new GrupoAlimentoDietaDAO();
        IAlimentoDAO manterA = new AlimentoDAO();

        String dataDieta = request.getParameter("dataDieta");
        request.setAttribute("dataDieta", dataDieta);

        java.sql.Date data = null;

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        data = new java.sql.Date(formato.parse(dataDieta).getTime());

        String obs = request.getParameter("obs");
        request.setAttribute("obs", obs);

        for (int i = 1; i <= num; i++) {
            String silagemManha = request.getParameter("silagemManha" + i);
            String silagemTarde = request.getParameter("silagemTarde" + i);

            String racaoManha = request.getParameter("racaoManha" + i);
            String racaoTarde = request.getParameter("racaoTarde" + i);

            String algodaoManha = request.getParameter("algodaoManha" + i);
            String algodaoTarde = request.getParameter("algodaoTarde" + i);

            String sojaManha = request.getParameter("sojaManha" + i);
            String sojaTarde = request.getParameter("sojaTarde" + i);

            String poupaManha = request.getParameter("poupaManha" + i);
            String poupaTarde = request.getParameter("poupaTarde" + i);

            String fubaManha = request.getParameter("fubaManha" + i);
            String fubaTarde = request.getParameter("fubaTarde" + i);

            String bicarbonatoManha = request.getParameter("bicarbonatoManha" + i);
            String bicarbonatoTarde = request.getParameter("bicarbonatoTarde" + i);

            String nucleoManha = request.getParameter("nucleoManha" + i);
            String nucleoTarde = request.getParameter("nucleoTarde" + i);

            String outra = request.getParameter("outra" + i);
            String outraManha = request.getParameter("outraManha" + i);
            String outraTarde = request.getParameter("outraTarde" + i);

            if ((silagemManha.length() != 0) || (silagemTarde.length() != 0)) {
                request.setAttribute("silagemManha", silagemManha + i);
                request.setAttribute("silagemTarde", silagemTarde + i);

                request.setAttribute("cod_grupo", i);
                request.setAttribute("cod_alimento", 1);

                gad.setCod_Grupo(i);
                gad.setCod_Alimento(1);
                gad.setDat_dieta(data);
                gad.setQtd_manha_kg(Double.parseDouble(silagemManha));
                gad.setQtd_tarde_kg(Double.parseDouble(silagemTarde));
                gad.setTxt_obs(obs);

                manterGad.inserir(gad);
            }

            if ((racaoManha.length() != 0) || (racaoTarde.length() != 0)) {
                request.setAttribute("racaoManha", racaoManha + i);
                request.setAttribute("racaoTarde", racaoTarde + i);

                request.setAttribute("cod_grupo", i);
                request.setAttribute("cod_alimento", 2);

                gad.setCod_Grupo(i);
                gad.setCod_Alimento(2);
                gad.setDat_dieta(data);
                gad.setQtd_manha_kg(Double.parseDouble(racaoManha));
                gad.setQtd_tarde_kg(Double.parseDouble(racaoTarde));
                gad.setTxt_obs(obs);

                manterGad.inserir(gad);
            }

            if ((algodaoManha.length() != 0) || (algodaoTarde.length() != 0)) {
                request.setAttribute("algodaoManha", algodaoManha + i);
                request.setAttribute("algodaoTarde", algodaoTarde + i);

                request.setAttribute("cod_grupo", i);
                request.setAttribute("cod_alimento", 3);

                gad.setCod_Grupo(i);
                gad.setCod_Alimento(3);
                gad.setDat_dieta(data);
                gad.setQtd_manha_kg(Double.parseDouble(algodaoManha));
                gad.setQtd_tarde_kg(Double.parseDouble(algodaoTarde));
                gad.setTxt_obs(obs);

                manterGad.inserir(gad);
            }

            if ((sojaManha.length() != 0) || (sojaTarde.length() != 0)) {
                request.setAttribute("sojaManha", sojaManha + i);
                request.setAttribute("sojaTarde", sojaTarde + i);

                request.setAttribute("cod_grupo", i);
                request.setAttribute("cod_alimento", 4);

                gad.setCod_Grupo(i);
                gad.setCod_Alimento(4);
                gad.setDat_dieta(data);
                gad.setQtd_manha_kg(Double.parseDouble(sojaManha));
                gad.setQtd_tarde_kg(Double.parseDouble(sojaTarde));
                gad.setTxt_obs(obs);

                manterGad.inserir(gad);
            }

            if ((poupaManha.length() != 0) || (poupaTarde.length() != 0)) {
                request.setAttribute("poupaManha", poupaManha + i);
                request.setAttribute("poupaTarde", poupaTarde + i);

                request.setAttribute("cod_grupo", i);
                request.setAttribute("cod_alimento", 5);

                gad.setCod_Grupo(i);
                gad.setCod_Alimento(5);
                gad.setDat_dieta(data);
                gad.setQtd_manha_kg(Double.parseDouble(poupaManha));
                gad.setQtd_tarde_kg(Double.parseDouble(poupaTarde));
                gad.setTxt_obs(obs);

                manterGad.inserir(gad);
            }

            if ((fubaManha.length() != 0) || (fubaTarde.length() != 0)) {
                request.setAttribute("fubaManha", fubaManha + i);
                request.setAttribute("fubaTarde", fubaTarde + i);

                request.setAttribute("cod_grupo", i);
                request.setAttribute("cod_alimento", 6);

                gad.setCod_Grupo(i);
                gad.setCod_Alimento(6);
                gad.setDat_dieta(data);
                gad.setQtd_manha_kg(Double.parseDouble(fubaManha));
                gad.setQtd_tarde_kg(Double.parseDouble(fubaTarde));
                gad.setTxt_obs(obs);

                manterGad.inserir(gad);
            }

            if ((bicarbonatoManha.length() != 0) || (bicarbonatoTarde.length() != 0)) {
                request.setAttribute("bicarbonatoManha", bicarbonatoManha + i);
                request.setAttribute("bicarbonatoTarde", bicarbonatoTarde + i);

                request.setAttribute("cod_grupo", i);
                request.setAttribute("cod_alimento", 7);

                gad.setCod_Grupo(i);
                gad.setCod_Alimento(7);
                gad.setDat_dieta(data);
                gad.setQtd_manha_kg(Double.parseDouble(bicarbonatoManha));
                gad.setQtd_tarde_kg(Double.parseDouble(bicarbonatoTarde));
                gad.setTxt_obs(obs);

                manterGad.inserir(gad);
            }

            if ((nucleoManha.length() != 0) || (nucleoTarde.length() != 0)) {
                request.setAttribute("nucleoManha", nucleoManha + i);
                request.setAttribute("nucleoTarde", nucleoTarde + i);

                request.setAttribute("cod_grupo", i);
                request.setAttribute("cod_alimento", 8);

                gad.setCod_Grupo(i);
                gad.setCod_Alimento(8);
                gad.setDat_dieta(data);
                gad.setQtd_manha_kg(Double.parseDouble(nucleoManha));
                gad.setQtd_tarde_kg(Double.parseDouble(nucleoTarde));
                gad.setTxt_obs(obs);

                manterGad.inserir(gad);
            }

            if ((outra.length() != 0) || (outraManha.length() != 0) || (outraTarde.length() != 0)) {
                request.setAttribute("outraManha", outraManha + i);
                request.setAttribute("outraTarde", outraTarde + i);

                request.setAttribute("cod_grupo", i);
                request.setAttribute("cod_alimento", numOutra);
                request.setAttribute(outra, "outra" + i);

                a.setCod_alimento(numOutra);
                a.setDes_Alimento(outra);

                gad.setCod_Grupo(i);
                gad.setCod_Alimento((int)numOutra);
                gad.setDat_dieta(data);
                gad.setQtd_manha_kg(Double.parseDouble(outraManha));
                gad.setQtd_tarde_kg(Double.parseDouble(outraTarde));
                gad.setTxt_obs(obs);

                manterA.inserir(a);

                manterGad.inserir(gad);

                numOutra++;
            }
        }
        jsp = "/VisualizarExcluirAnimal.jsp";
        return jsp;
    }
}
