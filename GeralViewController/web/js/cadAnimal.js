window.onload = function(){
    document.querySelector('#racaPuro').addEventListener('click', function(e){ EsconderPorcentagem(e.target.id) });
    document.querySelector('#racaMest').addEventListener('click', function(e){ ExibirPorcentagem(e.target.id) });
    document.querySelector('#radioAnimal').addEventListener('click', function(e){ CamposAnimal(e.target.id) });
    document.querySelector('#radioEmbriao').addEventListener('click', function(e){ CamposEmbriao(e.target.id) });
    document.querySelector('#radioSemen').addEventListener('click', function(e){ CamposSemen(e.target.id) });
}

//Fuções para exibir ou esconder campos referentes às raças dos animais (Puro ou Mestiço).

function ExibirPorcentagem(){
    //mostra a porcentagem e os campos de seleção de raça para mestiços.
    document.querySelector('#divPorcentagemRaca').classList.remove('esconder');
    document.querySelector('#divSelectRaca').classList.remove('esconder');
    //esconde o campo de seleção quando o animal é puro.
    document.querySelector('#divSelectRacaPuro').classList.add('esconder');
} 

function EsconderPorcentagem(){
    //esconde a porcentagem e os campos de seleção de raça para mestiços.
    document.querySelector('#divPorcentagemRaca').classList.add('esconder');
    document.querySelector('#divSelectRaca').classList.add('esconder');
    //mostra o campo de seleção quando o animal é puro.
    document.querySelector('#divSelectRacaPuro').classList.remove('esconder');
}

//Função para exibir os campos específicos para cadastro de "Animal".

function CamposAnimal(){   
    //Mostrando os campos específicos para cadastro de "Animal".
    document.querySelector('#divCampAnimal').classList.remove('esconder');
    document.querySelector('#divCampEmbriao').classList.add('esconder');
    document.querySelector('#divCampSemen').classList.add('esconder');
    //Exibindo os campos de genealogia.
    document.querySelector('#divGenealogia').classList.remove('esconder');
    document.querySelector('#divPai').classList.remove('esconder');
    document.querySelector('#divMae').classList.remove('esconder');
}

//Função para exibir os campos específicos para cadastro de "Embrião".

function CamposEmbriao(){
    //Mostrando os campos específicos para cadastro de "Embrião".
    document.querySelector('#divCampAnimal').classList.add('esconder');
    document.querySelector('#divCampEmbriao').classList.remove('esconder');
    document.querySelector('#divCampSemen').classList.add('esconder');
    //Exibindo os campos de genealogia.
    document.querySelector('#divGenealogia').classList.remove('esconder');
    document.querySelector('#divPai').classList.remove('esconder');
    document.querySelector('#divMae').classList.remove('esconder');
}

//Função para exibir os campos específicos para cadastro de "Sêmen".

function CamposSemen(){
    //Mostrando os campos específicos para cadastro de "Sêmen".
    document.querySelector('#divCampAnimal').classList.add('esconder');
    document.querySelector('#divCampEmbriao').classList.add('esconder');
    document.querySelector('#divCampSemen').classList.remove('esconder');
    //Escondendo os campos de genealogia.
    document.querySelector('#divGenealogia').classList.add('esconder');
    document.querySelector('#divPai').classList.add('esconder');
    document.querySelector('#divMae').classList.add('esconder');
}

function validacaoCampos() {
    let frm = document.formLogin;
    let radioCadastro = frm.radioCadastro.value;
    let cadSexo = frm.cadSexo.value;
    let cadPertFaz = frm.cadPertFaz.value;
    
    //Refernte a opção "Animal";
    let numSISBOV = frm.numSISBOV.value;
    let brincoEle = frm.brincoEle.value;
    let numRGN = frm.numRGN.value;
    let numRGD = frm.numRGD.value;
    let numAnimal = frm.numAnimal.value;
    let nomCompAnimal = fmr.nomCompAnimal;
    let nomAnimal = frm.nomAnimal.value;
    let peso = frm.peso.value;
    let idade = frm.idade.value;
    let nascimento = frm.nascimento.value;
    let entrada = frm.entrada.value;
    let desmama = frm.desmama.value;
    let aptidao = frm.aptidao.value;
    let  = frm.pelagem.value;
    let  = frm.categoria.value;
    
    //Referente a opção "Embrião";
    let entradaEmbriao = frm.entradaEmbriao.value;
    let numEmbriao = frm.numEmbriao.value;
    let tipoEmbriao = frm.tipoEmbriao.value;
    let classificacaoEmbriao = frm.classificacaoEmbriao.value;

    //Referente ao cadastro de Semen;
    let numSemen = frm.numSemen.value;
    
    //Tipo de Raça;
    let racaPuro = frm.racaPuro.value;
    let racaMest = frm.racaMest.value;
    let porcentagem1 = frm.porcentagem1.value;
    let porcentagem2 = frm.porcentagem2.value;
    let raca1 = frm.raca1.value;
    let raca2 = frm.raca2.value;
    let selectRacaPuro = frm.selectRacaPuro.value; //Especifico para categoria de raça "Puro";
    
    //Genealogia
    let numPai = frm.numPai.value;
    let nomCompPai = frm.nomCompPai.value;
    let nomPai = frm.nomPai.value;
    let numMae = frm.numMae.value;
    let nomCompMae = frm.nomCompMae.value;
    let nomMae = frm.nomMae.value;
    
    
    if(radioCadastro == "") {
        alert("Selecione o tipo de Cadastro!");
        document.getElementById("nome").focus();
        return false;
    } 
    
    else if (cadSexo == "") {
        alert("Selecione o Sexo!");
        document.getElementById("password").focus();
        return false;
    } 
    
    else if (cadPertFaz == ""){
        alert ("O campo Pertence à Fazenda deve ser preenchido!");
        document.getElementById("cadPertFaz").focus();
        return false;
    }
    
    else if (numSISBOV == ""){
        alert ("Insira o número SISBOV.");
        document.getElementById("numSISBOV").focus();
        return false;
    }
    
    else if (brincoEle == ""){
        alert ("Insira o número referente ao Brinco Eletrônico.");
        document.getElementById("brincoEle").focus();
        return false;
    }
    
    else if (numRGN == ""){
        alert ("Insira o RGN.");
        document.getElementById("numRGN").focus();
        return false;
    }
    
    else if (numRGD == ""){
        alert ("Insira o RGD");
        document.getElementById("numRGD").focus();
        return false;
    }
    
    else if (numAnimal == ""){
        alert ("Insira o número do Animal.");
        document.getElementById("numAnimal").focus();
        return false;
    }
    
    else if (nomCompAnimal == ""){
        alert ("Insira o nome completo do animal.");
        document.getElementById("nomCompAnimal").focus();
        return false;
    }
    
    else if (nomAnimal == ""){
        alert ("Insira o nome resumido do animal.");
        document.getElementById("nomAnimal").focus();
        return false;
    }
    
    else if (peso == ""){
        alert ("Insira o peso do animal.");
        document.getElementById("peso").focus();
        return false;
    }
    
    else if (idade == ""){
        alert ("Insira a idade do animal.");
        document.getElementById("idade").focus();
        return false;
    }
    
    else if (nascimento == ""){
        alert ("Insira a data de nascimento do animal.");
        document.getElementById("nascimento").focus();
        return false;
    }
    
    else if (entrada == ""){
        alert ("Insira a data de entrada do animal.");
        document.getElementById("entrada").focus();
        return false;
    }
    
    else if (desmama == ""){
        alert ("Insira a data de desamama do animal.");
        document.getElementById("desmama").focus();
        return false;
    }
    
    else if (aptidao == ""){
        alert ("Insira a data de Aptidão do animal.");
        document.getElementById("aptidao").focus();
        return false;
    }
    
    else if (pelagem == ""){
        alert ("Insira o tipo de Pelagem do animal");
        document.getElementById("pelagem").focus();
        return false;
    }
    
    else if (categoria == ""){
        alert ("Insira a Categoria do animal.");
        document.getElementById("categoria").focus();
        return false;
    }
    
    //Embriao
    else if (entradaEmbriao == ""){
        alert ("Insira a Entrada do embrião.");
        document.getElementById("emtradaEmbriao").focus();
        return false;
    }
    
    else if (numEmbriao == ""){
        alert ("Insira o Número referente ao embrião.");
        document.getElementById("").focus();
        return false;
    }
    
    else if (tipoEmbriao == ""){
        alert ("Insira o tipo de embrião.");
        document.getElementById("tipoEmbriao").focus();
        return false;
    }
    
    //Sêmen;
    else if (numSemen == ""){
        alert ("Insira o número do sêmen");
        document.getElementById("numSemen").focus();
        return false;
    }
    
    //Tipo de Raça;
    else if (racaPuro == ""){
        alert ("Selecione se for puro.");
        document.getElementById("racaPuro").focus();
        return false;
    }
    
        else if (racaMest == ""){
        alert ("");
        document.getElementById("racaMest").focus();
        return false;
    }
  /* 
    else if ( == ""){
        alert ("");
        document.getElementById("").focus();
        return false;
    }
   */  
}

function salvarRedirect(){
        var frm = document.getElementById("formCadastroAnimal");
        caminhourl = "Servlet?acao=SalvarCadAnimal";
        frm.action = caminhourl;
        frm.submit();
        return true;
}