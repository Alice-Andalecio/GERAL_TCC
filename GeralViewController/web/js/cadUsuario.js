function validaCampo() {
    let frm = document.formLogin;
    let email = frm.email.value;
    let senha = frm.senha.value;
    
    if(email == "") {
        alert("O campo email é obrigatório!!");
        document.getElementById("nome").focus();
        return false;
    } else if (senha == "") {
        alert("O campo senha é obrigatório!!");
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
    let priNome = form.priNome.value;
    let apelido = form.apelido.value;
    let senha = form.senha.value;
    let confSenha = form.password_confirm.value;
    let email = form.email.value;
    
    if (nome = "") {
        alert("Campo nome obrigatorio.");
        document.getElementById("priNome").focus();
       return false;
    } 
    
    else if (apelido = "") {
        alert("Campo apelido obrigatório.");
        document.getElementById("apelido").focus();
        return false;
    }
    
    else if (senha = "") {
        alert("Campo senha obrigatorio.");
        document.getElementById("senha").focus();
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