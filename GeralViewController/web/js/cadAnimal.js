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
    //Escondendo os campos específicos de "Embrião".
    document.querySelector('#divCamposEmbriao').classList.add('esconder');
    //Desabilitando os campos que NÃO devem ser preenchidos para cadastro de "Sêmen".
    document.querySelector('#numSISBOV').disabled = false;
    document.querySelector('#brincoEle').disabled = false;
    document.querySelector('#numRGN').disabled = false;
    document.querySelector('#numRGD').disabled = false;
    document.querySelector('#nomCompAnimal').disabled = false;
    document.querySelector('#nomAnimal').disabled = false;
    document.querySelector('#peso').disabled = false;
    document.querySelector('#idade').disabled = false;
    document.querySelector('#nascimento').disabled = false;
    document.querySelector('#entrada').disabled = false;
    document.querySelector('#desmama').disabled = false;
    document.querySelector('#aptidao').disabled = false;
    document.querySelector('#pelagem').disabled = false;
    document.querySelector('#categoria').disabled = false;
    //Exibindo os campos de genealogia.
    document.querySelector('#divGenealogia').classList.remove('esconder');
    document.querySelector('#divPai').classList.remove('esconder');
    document.querySelector('#divMae').classList.remove('esconder');
}

//Função para exibir os campos específicos para cadastro de "Embrião".
function CamposEmbriao(){
    //Exibindo os campos específicos de "Embrião".
    document.querySelector('#divCamposEmbriao').classList.remove('esconder');
    //Desabilitando os campos que NÃO devem ser preenchidos para cadastro de "Embrião".
    document.querySelector('#numSISBOV').disabled = true;
    document.querySelector('#brincoEle').disabled = true;
    document.querySelector('#numRGN').disabled = true;
    document.querySelector('#numRGD').disabled = true;
    document.querySelector('#nomCompAnimal').disabled = true;
    document.querySelector('#nomAnimal').disabled = true;
    document.querySelector('#peso').disabled = true;
    document.querySelector('#idade').disabled = true;
    document.querySelector('#nascimento').disabled = true;
    document.querySelector('#entrada').disabled = false;
    document.querySelector('#desmama').disabled = true;
    document.querySelector('#aptidao').disabled = true;
    document.querySelector('#pelagem').disabled = true;
    document.querySelector('#categoria').disabled = true;
    //Exibindo os campos de genealogia.
    document.querySelector('#divGenealogia').classList.remove('esconder');
    document.querySelector('#divPai').classList.remove('esconder');
    document.querySelector('#divMae').classList.remove('esconder');
}

//Função para exibir os campos específicos para cadastro de "Sêmen".
function CamposSemen(){
    //Escondendo os campos específicos de "Embrião".
    document.querySelector('#divCamposEmbriao').classList.add('esconder');
    //Desabilitando os campos que NÃO devem ser preenchidos para cadastro de "Sêmen".
    document.querySelector('#numSISBOV').disabled = true;
    document.querySelector('#brincoEle').disabled = true;
    document.querySelector('#numRGN').disabled = true;
    document.querySelector('#numRGD').disabled = true;
    document.querySelector('#nomCompAnimal').disabled = true;
    document.querySelector('#nomAnimal').disabled = true;
    document.querySelector('#peso').disabled = true;
    document.querySelector('#idade').disabled = true;
    document.querySelector('#nascimento').disabled = true;
    document.querySelector('#entrada').disabled = true;
    document.querySelector('#desmama').disabled = true;
    document.querySelector('#aptidao').disabled = true;
    document.querySelector('#pelagem').disabled = true;
    document.querySelector('#categoria').disabled = true;
    //Escondendo os campos de genealogia.
    document.querySelector('#divGenealogia').classList.add('esconder');
    document.querySelector('#divPai').classList.add('esconder');
    document.querySelector('#divMae').classList.add('esconder');
}
