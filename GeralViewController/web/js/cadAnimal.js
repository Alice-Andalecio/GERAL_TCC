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