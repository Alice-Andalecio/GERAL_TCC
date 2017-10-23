/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function logarRedirect() {
    var frm = document.formLogin;
    var email = frm.email.value;
    var senha = frm.password.value;
    
    if(email == "") {
        alert("Campo Email Obrigatório !!");
        document.getElementById("nome").focus();
        return false;
    } else if (senha == "") {
        alert("Campo  Senha Obrigatório !!");
        document.getElementById("password").focus();
        return false;
    } else {
        caminhourl = "Servlet?acao=Logar";
        frm.action = caminhourl;
        frm.submit();
        return true;
    }  
}
