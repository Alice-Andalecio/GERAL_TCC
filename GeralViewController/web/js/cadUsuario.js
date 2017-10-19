function validaCampo() {
    let frm = document.formLogin;
    let email = frm.email.value;
    let senha = frm.password.value;
    
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

function GravarUsuario (form) {
    form = document.formCad;
    let nome = form.name.value;
    let apelido = form.apelido.value;
    let senha = form.password.value;
    let confSenha = form.password_confirm.value;
    let email = form.email.value;
    
    if (nome = "") {
        alert("Campo nome obrigatorio.");
        document.getElementById("name").focus();
       return false;
    } 
    
    else if (apelido = "") {
        alert("Campo apelido obrigatório.");
        document.getElementById("apelido").focus();
        return false;
    }
    
    else if (senha = "") {
        alert("Campo senha obrigatorio.");
        document.getElementById("password").focus();
        return false;

    } 
  /*  else if (senha != confSenha) {
        alert("A senha está diferente.");
        document.getElementById("password_confirm").focus();
        return false;

    } */
    else if (email = "") {
        alert("Campo email obrigatorio.");
        document.getElementById("email").focus();
       return false;

    } 

    } 
    else if (form.acao.value == "gravar") {
        caminhourl = "/GeralViewController/Servlet?acao=GravarUsuario";
        form.action = caminhourl;
        form.submit();
    }
}
