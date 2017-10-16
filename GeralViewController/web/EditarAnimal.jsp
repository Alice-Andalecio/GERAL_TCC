<%-- 
    Document   : EditarAnimal
    Created on : 16/10/2017, 11:56:13
    Author     : jaops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
  <meta charset="utf-8">
  <title>Edição de Animais</title>
  <meta name="description" content="">  
  <meta name="author" content="">

  <!-- CSS -->
  <link rel="stylesheet" href="css/base.css">  
  <link rel="stylesheet" href="css/main.css">
  <link rel="stylesheet" href="css/vendor.css">    
  <link href="css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

  <!-- Ajustando o header -->
  <style type="text/css">
  header {
    width: 100%;
    position: absolute;
    left: 0;
    top: 0px;
    z-index: 600;
    background: #14171c;
  }
</style>
</head>

<body id="top">

 <!-- Header -->
 <header>
  <ul id="slide-out" class="side-nav">
    <br>
    <li>
      <div class="logo">
        <img class="background center-block responsive" src="logo.png">
      </div>
    </li>
    <br>
    <li><a class="waves-effect" href="CadastroAnimal.html">Cadastro de Animais</a></li>
    <li><a class="waves-effect" href="VisualizarExcluirAnimal.html">Visualizar e Excluir Animal</a></li>
    <li><a class="waves-effect" href="EditarAnimal.html">Editar Animal</a></li>
    <li><a class="waves-effect" href="Dieta.html">Dieta</a></li>
    <li><a class="waves-effect" href="medicamentos.html">Prescrição de Medicamentos</a></li>
    <li><a class="waves-effect" href="controleLeiteiro.html">Controle Leiteiro</a></li>
    <li><a class="waves-effect" href="vendaLeite.html">Venda de Leite</a></li>
    <li><a class="waves-effect" href="RepParto.html">Reprodução - Parto</a></li>
    <li><a class="waves-effect" href="RepInseminacao.html">Reprodução - Inseminação</a></li>
    <li><a class="waves-effect" href="RepDiagnostico">Reprodução - Diagnóstico</a></li>
    <li><a class="waves-effect" href="index.html">Sair</a></li>
    <!--<li><div class="divider"></div></li>-->
    <!--<li><a class="subheader">Subheader</a></li>-->
  </ul>
  <ul class="left ">
    <li>
      <button style="top: 15px;" data-activates="slide-out" class="waves-effect waves-light btn-flat button-collapse green-text #FFFFFF"><b>Menu</b></button>
    </li>
  </ul>        
</header>

<!-- Formulário para edição de animais -->
<section id="process">  
  <br>
  <div class="row">
    <form id="formEditarAnimal" class="col s12">

      <div class="row section-intro">
       <div class="col-twelve">
        <br>
        <h2 style="color: green">Edição de Animais</h2>
        <br>
      </div>         
    </div>

    <!-- Campos básicos para cadastro de animais (devem aparecer preenchidos com os dados cadastrados) -->    
    <div class="row">  
      <div class="input-field col s12" style="color: green"> 
        <i class="material-icons">edit</i>
        <b>Selecione uma opção de cadastro:</b>
        <br><br>
      </div>
    </div>

    <div class="row">
      <div class="col s2">
        <input class="with-gap" name="radioCadastro" type="radio" id="radioAnimal"/>
        <label for="radioAnimal"><b>Animal</b></label>
      </div>
      <div class="col s2">
        <input class="with-gap" name="radioCadastro" type="radio" id="radioEmbriao"/>
        <label for="radioEmbriao"><b>Embrião</b></label>
      </div>
      <div class="col s2">
        <input class="with-gap" name="radioCadastro" type="radio" id="radioSemen"/>
        <label for="radioSemen"><b>Sêmen</b></label>
      </div>
      <div class="col s3">
        <select class="browser-default" name="cadSexo" id="cadSexo">
          <option value="" disabled selected>Sexo</option>
          <option value="1">Fêmea</option>
          <option value="2">Macho</option>
        </select>
      </div>
      <div class="col s3">
        <select class="browser-default" name="cadPertFaz" id="cadPertFaz">
          <option value="" disabled selected>Pertence à fazenda?</option>
          <option value="1">Sim</option>
          <option value="2">Não</option>
        </select>
      </div>
      <br><hr>
    </div>

    <div class="row">  
      <div class="input-field col s12" style="color: green"> 
        <i class="material-icons">edit</i>
        <b>Preencha os campos abaixo:</b>
        <br><br>
      </div>
    </div>

    <!-- A div "divCamposEmbriao" só deve ser exibida caso seja selecionada o opção de cadastro de Embrião -->
    <div class="row esconder" id="divCamposEmbriao">
      <div class="col s2">
        <select class="browser-default" name="tipoEmbriao" id="tipoEmbriao">
          <option value="" disabled selected>Tipo de Embrião</option>
          <option value="1">Fresco</option>
          <option value="2">Congelado</option>
        </select>
      </div>
      <div class="col s1"></div>
      <div class="col s3">
        <select class="browser-default" name="classificacaoEmbriao" id="classificacaoEmbriao">
          <option value="" disabled selected>Classificação do Embrião</option>
          <option value="1">Blastocisto</option>
          <option value="2">Blastocisto Expandido</option>
          <option value="3">Mórula</option>
        </select>
      </div>
      <br><br><hr>
    </div>

    <div class="row">
      <div class="input-field col s2">
        <input type="text" id="numSISBOV"></input>
        <label for="numSISBOV"><b>Nº SISBOV</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s3">
        <input type="text" id="brincoEle"></input>
        <label for="brincoEle"><b>Brinco Eletrônico</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s2">
        <input type="text" id="numRGN"></input>
        <label for="numRGN"><b>RGN</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s2">
        <input type="text" id="numRGD"></input>
        <label for="numRGD"><b>RGD</b></label>
      </div>
    </div>

    <div class="row">
      <div class="input-field col s2">
        <input type="text" id="numAnimal"></input>
        <label for="numAnimal"><b>Nº do Animal</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s3">
        <input type="text" id="nomCompAnimal"></input>
        <label for="nomCompAnimal"><b>Nome Completo do Animal</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s2">
        <input type="text" id="nomAnimal"></input>
        <label for="nomAnimal"><b>Nome Resumido</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s1">
        <input type="text" id="peso"></input>
        <label for="peso"><b>Peso</b></label>
      </div>
      <div class="input-field col s1">
        <input type="text" id="idade"></input>
        <label for="idade"><b>Idade</b></label>
      </div>
    </div>  

    <div class="row">
      <div class="input-field col s2">
        <b>Nascimento</b> 
        <input type="date" name="nascimento" id="nascimento">
      </div>
      <div class="col s1"></div>
      <div class="input-field col s3">
        <b>Entrada</b> 
        <input type="date" name="entrada" id="entrada">
      </div>
      <div class="col s1"></div>
      <div class="input-field col s2">
        <b>Desmama</b> 
        <input type="date" name="desmama" id="desmama">
      </div>
      <div class="col s1"></div>
      <div class="input-field col s2">
        <b>Aptidão</b> 
        <input type="date" name="aptidao" id="aptidao">
      </div>
    </div>

    <div class="row">
      <div class="col s2">
        <select class="browser-default" name="pelagem" id="pelagem">
          <option value="" disabled selected>Pelagem</option>
          <option value="1">Amarelada</option>
          <option value="2">Branco</option>
          <option value="3">Branco e Preta</option>
          <option value="4">Cinzenta</option>
          <option value="5">Chita</option>
          <option value="6">Parda</option>
          <option value="7">Vermelho e branco</option>
          <option value="3">Parda</option>
          <option value="2">Outro</option>
        </select>
      </div>
      <div class="col s1"></div>
      <div class="col s3">
        <select class="browser-default" name="categoria" id="categoria">
          <option value="" disabled selected>Categoria</option>
          <option value="1">Vacas em Lactação</option>
          <option value="2">Vacas Pré-parto</option>
          <option value="3">Vacas Secas</option>
          <option value="4">Bezerras Lactantes</option>
          <option value="5">Novilhas</option>
          <option value="6">Touro</option>
        </select>
      </div>
      <br><br><hr>
    </div>

    <div class="row">
      <div class="col s2">
        <b>Tipo de Raça:</b>
      </div>
      <div class="col s2"> 
        <input class="with-gap" name="tipoRaca" type="radio" id="racaPuro"/>
        <label for="racaPuro"><b>Puro</b></label>
      </div>
      <div class="col s2">
        <input class="with-gap" name="tipoRaca" type="radio" id="racaMest"/>
        <label for="racaMest"><b>Mestiço</b></label>
      </div>
    </div>

    <div class="row esconder" id="divPorcentagemRaca">
      <div class="input-field col s3">
        <input type="text" name="porcentagem1" id="porcentagem1" />
        <label for="porcentagem1"><b>Porcentagem</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s3">
        <input type="text" name="porcentagem2" id="porcentagem2" />
        <label for="porcentagem2"><b>Porcentagem</b></label>
      </div>
    </div>

    <div class="row esconder" id="divSelectRaca">
      <div class="col s3">
        <select class="browser-default" name="raca1" id="raca1">
          <option value="" disabled selected>Selecione a raça</option>
          <option value="1">AN - Aberdeen Angos</option>
          <option value="2">AF - Africander</option>
          <option value="3">AU - Aubrac</option>
          <option value="4">AY - Ayrshire</option>
          <option value="5">BA - Barzona</option>
          <option value="6">BE - Beefala</option>
          <option value="7">BN - Beefmaster</option>
          <option value="8">BB - Belgian Blue</option>
          <option value="9">BT - Belmont Red</option>
          <option value="10">BD - Blond D'Aquitaine</option>
          <option value="11">NS - Bonsmara</option>
          <option value="12">BO - Braford</option>
          <option value="13">BR - Brahman</option>
          <option value="14">BH - Brahmental</option>
          <option value="15">BL - Braler</option>
          <option value="16">BN - Brangus</option>
          <option value="17">CP - Campino Red Pied</option>
          <option value="18">CN - Canadienne</option>
          <option value="19">CC - Canchim</option>
          <option value="20">CO - Carabao</option>
          <option value="21">CR - Caracu</option>
          <option value="22">CB - Charbray</option>
          <option value="23">CH - Charolês</option>
          <option value="24">CA - Chianina</option>
          <option value="25">XX - Composto</option>
          <option value="26">CL - Curraleiro</option>
          <option value="27">DB - Danish Black & White</option>
          <option value="28">DE - Devon</option>
        </select>
      </div>
      <div class="col s1"></div>
      <div class="col s3">
        <select class="browser-default" name="raca2" id="raca2">
          <option value="" disabled selected>Selecione a raça</option>
          <option value="1">AN - Aberdeen Angos</option>
          <option value="2">AF - Africander</option>
          <option value="3">AU - Aubrac</option>
          <option value="4">AY - Ayrshire</option>
          <option value="5">BA - Barzona</option>
          <option value="6">BE - Beefala</option>
          <option value="7">BN - Beefmaster</option>
          <option value="8">BB - Belgian Blue</option>
          <option value="9">BT - Belmont Red</option>
          <option value="10">BD - Blond D'Aquitaine</option>
          <option value="11">NS - Bonsmara</option>
          <option value="12">BO - Braford</option>
          <option value="13">BR - Brahman</option>
          <option value="14">BH - Brahmental</option>
          <option value="15">BL - Braler</option>
          <option value="16">BN - Brangus</option>
          <option value="17">CP - Campino Red Pied</option>
          <option value="18">CN - Canadienne</option>
          <option value="19">CC - Canchim</option>
          <option value="20">CO - Carabao</option>
          <option value="21">CR - Caracu</option>
          <option value="22">CB - Charbray</option>
          <option value="23">CH - Charolês</option>
          <option value="24">CA - Chianina</option>
          <option value="25">XX - Composto</option>
          <option value="26">CL - Curraleiro</option>
          <option value="27">DB - Danish Black & White</option>
          <option value="28">DE - Devon</option>
        </select>
      </div>
    </div>

    <!-- Select de raça específico para categoria "Puro"-->

    <div class="row esconder" id="divSelectRacaPuro">
      <div class="col s3">
        <select class="browser-default" name="selectRacaPuro" id="selectRacaPuro">
          <option value="" disabled selected>Selecione a raça</option>
          <option value="1">AN - Aberdeen Angos</option>
          <option value="2">AF - Africander</option>
          <option value="3">AU - Aubrac</option>
          <option value="4">AY - Ayrshire</option>
          <option value="5">BA - Barzona</option>
          <option value="6">BE - Beefala</option>
          <option value="7">BN - Beefmaster</option>
          <option value="8">BB - Belgian Blue</option>
          <option value="9">BT - Belmont Red</option>
          <option value="10">BD - Blond D'Aquitaine</option>
          <option value="11">NS - Bonsmara</option>
          <option value="12">BO - Braford</option>
          <option value="13">BR - Brahman</option>
          <option value="14">BH - Brahmental</option>
          <option value="15">BL - Braler</option>
          <option value="16">BN - Brangus</option>
          <option value="17">CP - Campino Red Pied</option>
          <option value="18">CN - Canadienne</option>
          <option value="19">CC - Canchim</option>
          <option value="20">CO - Carabao</option>
          <option value="21">CR - Caracu</option>
          <option value="22">CB - Charbray</option>
          <option value="23">CH - Charolês</option>
          <option value="24">CA - Chianina</option>
          <option value="25">XX - Composto</option>
          <option value="26">CL - Curraleiro</option>
          <option value="27">DB - Danish Black & White</option>
          <option value="28">DE - Devon</option>
        </select>
      </div>
    </div>

    <div class="row esconder" id="divGenealogia">  
      <div class="input-field col s12" style="color: green">
        <hr><br>
        <i class="material-icons">edit</i>
        <b>Genealogia:</b>
        <br>
      </div>
    </div>  

    <div class="row esconder" id="divPai">
      <div class="input-field col s2">
        <input type="text" id="numPai"></input>
        <label for="numPai"><b>Nº do Pai</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s3">
        <input type="text" id="nomCompPai"></input>
        <label for="nomCompPai"><b>Nome Completo do Pai</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s2">
        <input type="text" id="nomPai"></input>
        <label for="nomPai"><b>Nome do Pai</b></label>
      </div>
    </div>

    <div class="row esconder" id="divMae">
      <div class="input-field col s2">
        <input type="text" id="numMae"></input>
        <label for="numMae"><b>Nº da Mãe</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s3">
        <input type="text" id="nomCompMae"></input>
        <label for="nomCompMae"><b>Nome Completo da Mãe</b></label>
      </div>
      <div class="col s1"></div>
      <div class="input-field col s2">
        <input type="text" id="nomMae"></input>
        <label for="nomMae"><b>Nome da Mãe</b></label>
      </div>
    </div>

    <div class="row">
      <hr><br>
      <div class="col s12" style="color: green">
        <i class="material-icons">edit</i>
        <b>Observações:</b>
      </div>
      <br>
    </div>

    <div class="row">
      <div class="col s12">
        <textarea id="obs"></textarea>
      </div>
    </div>

    <div class="row">
      <br><br>
      <div class="col s2">
        <a class="waves-effect waves-light btn" id="atualizarCad" style="background: green">
          <i class="material-icons right">loop</i>Atualizar</a>
        </div>
      </div>

    </form>
  </div>
</section>

<!-- Footer -->
<footer>
  <div class="footer-main">
   <div class="row">  
    <div class="col-four tab-full mob-full footer-info">            
     <div class="footer-logo"></div>
     <p>
      Centro Federal de Educação Tecnológica de Minas Gerais
      <br>
      Av. Amazonas, 7675 - Nova Gameleira, Belo Horizonte - MG
      <br>
      Telefone: +55 (31) 3319-6722
    </p>
  </div>
  <div class="col-two tab-1-3 mob-1-2">
   <h4>Instituição</h4>
   <ul>
    <li><a href="http://www.cefetmg.br/">CEFET-MG</a></li>
    <li><a href="http://www.campus2.cefetmg.br/">CEFET-MG/CII</a></li>
    <li><a href="http://www.decom.cefetmg.br/">DECOM</a></li>
  </ul>
</div>    
<div class="col-two tab-1-3 mob-1-2 social-links">
  <h4>Sigam-nos</h4>
  <ul>
    <li><a href="https://www.facebook.com/cefetminasgerais/">Facebook CEFET</a></li>
    <li><a href="https://www.facebook.com/cefetmg.campus2/">Facebook CEFET/CII</a></li>
    <li><a href="https://www.instagram.com/cefetmg/">Instagram CEFET</a></li>
  </ul>               
</div>    
<div class="col-four tab-1-3 mob-full">
  <h4>Professores</h4>
  <p>Cristiano Amaral Maffort - LPII.
    <br>
    Glívia Angélica Rodrigues Barbosa - PSI.
    <br>
    Edson Marchetti da Silva - BD.
  </p>                        
</div>
</div>
</div> 
<div class="footer-bottom">
  <div class="row">
    <div class="col-twelve">
     <div class="copyright"></div>
     <div id="go-top" style="display: block;">
      <a class="smoothscroll" title="Back to Top" href="#top" style="background: green"><i class="icon ion-android-arrow-up"></i></a>
    </div>         
  </div>
</div>       
</div> 
</footer>    
<div id="preloader"> 
  <div id="loader"></div>
</div> 

<!-- Java Script -->
<script src="js/modernizr.js"></script>
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/jquery-migrate-1.2.1.min.js"></script>
<script src="js/plugins.js"></script>
<script src="js/main.js"></script>
<script src="js/materialize.js"></script>
<script src="js/cadAnimal.js"></script>
<script src="js/menu.js"></script>
</body>
</html>
