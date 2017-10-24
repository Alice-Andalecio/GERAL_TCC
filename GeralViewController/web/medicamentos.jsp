<%-- 
    Document   : medicamentos
    Created on : 16/10/2017, 11:56:49
    Author     : jaops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
 <meta charset="utf-8">
 <title>Medicamentos</title>
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

 li ul{
   display: none;
 }

 li:hover ul { 
   display: block; 
 }

</style>

</head>

<body id="top">

 <!-- Header -->
 <header>
  <ul id="slide-out" class="side-nav">
    <li>
     <br>
     <div class="user-view">
      <div class="background">
       <img src="images/logoPreto.png">
     </div>
     <li><a class="waves-effect" href="" onClick="linkVisualizarExcluirAnimal()">Animais</a></li> 
     <li><a class="waves-effect" href="CadastroAnimal.jsp">Cadastro de Animais</a></li>
     <li><a class="waves-effect" href="controleLeiteiro.jsp">Controle Leiteiro</a></li>
     <li><a class="waves-effect" href="#">Controle Reprodutivo</a>
       <ul>
        <li><a class="waves-effect" href="RepInseminacao.jsp">Inseminação/Cobrição</a></li>
        <li><a class="waves-effect" href="RepDiagnostico.jsp">Diagnóstico</a></li>
        <li><a class="waves-effect" href="RepParto.jsp">Parto</a>
        </ul>
      </li>
      <li><a class="waves-effect" href="Dieta.jsp">Dieta</a></li>
      <li><a class="waves-effect" href="medicamentos.jsp">Prescrição de Medicamentos</a></li>     
      <li><a class="waves-effect" href="vendaLeite.jsp">Venda de Leite</a></li>
      <li><a class="waves-effect" href="index.jsp" style="color: green">SAIR</a></li>
    </ul>
    <ul class="left ">
     <li>
      <button style="top: 15px;" data-activates="slide-out" class="waves-effect waves-light btn-flat button-collapse green-text #FFFFFF"><b>Menu</b></button>
    </li>
  </ul>        
</header>

<!-- Formulário para realizar login no sistema -->
<section id="process"> 
  <br> 
  <div class="row">
    <form id="formMedicamentos" action="" method="POST" class="col s12">
        <input type='hidden' name='acao' id="acao" value='gravarMedicamento'>
      <div class="row section-intro">
        <div class="col-twelve">
          <br>
          <h2 style="color: green">Cadastro de Medicamentos</h2>
          <br>
        </div>         
      </div>

      <div class="row">
        <div class="col s1"></div>
        <div class="input-field col s10">
          <input type="text" id="nomMed" name="nomMed">
          <label for="nomMed"><b>Insira o nome do medicamento</b></label>
        </div>
      </div>

      <div class="row">
        <div class="col s1"></div>
        <div class="col s10" style="color: green">  
          <i class="material-icons">edit</i>
          <b>Prescrição:</b>
        </div>
      </div>

      <div class="row">
        <div class="col s1"></div>
        <div class=" col s10">
          <textarea id="prescricaoMed" name="prescricaoMed" placeholder="Insira a prescrição e observações necessárias"></textarea>
        </div>
      </div>

      <!-- Espaço para adicionar novos medicamentos -->

      <div class="esconder" id="novoMedicamento">
      </div>

      <div class="row">
        <br>
        <div class="col s1"></div>
        <div class="col s3">
         <a class="btn-floating btn waves-effect waves-light" id="adicionarMed" style="background: green">
          <i class="material-icons">add</i>
        </a>
        <a class="btn-floating btn waves-effect waves-light" id="removerMed" style="background: green">
          <i class="material-icons">delete</i>
        </a>
      </div>
    </div>

    <div class="row">
      <br><br>
      <div class="col s1"></div>
      <div class="col s10" align="right">
        <a class="waves-effect waves-light btn" id="salvarMed" style="background: green" onclick="CadastrarMedicamento()">
          <i class="material-icons right">done</i>Salvar</a>
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
<script src="js/medicacao.js"></script>
<script src="js/menu.js"></script>
<script src="js/cadMedicamento.js"></script>
<script src="js/linkMenu.js"></script>

</body>
</html>