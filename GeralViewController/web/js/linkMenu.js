/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function linkVisualizarExcluirAnimal() {
    var ancor = document.getElementById("ancorCadAnimal");
    caminhourl = "Servlet?acao=CadAnimal";
    ancor.href = caminhourl;
    ancor.submit();
    return true;

}
