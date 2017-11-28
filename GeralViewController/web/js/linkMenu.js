/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function linkCadastroAnimal() {
    var ancor = document.getElementById("ancorCadAnimal");
    caminhourl = "Servlet?acao=CadAnimal";
    ancor.href = caminhourl;
    ancor.submit();
    return true;
}

function linkControleLeiteiro() {
    var ancor = document.getElementById("ancorControleLeiteiro");
    caminhourl = "Servlet?acao=ControleLeiteiro";
    ancor.href = caminhourl;
    ancor.submit();
    return true;
}