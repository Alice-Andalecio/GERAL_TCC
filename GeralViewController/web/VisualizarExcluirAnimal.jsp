<%-- 
    Document   : VisualizarExcluirAnimal
    Created on : 16/10/2017, 11:58:01
    Author     : jaops
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.cefetmg.controller.Login"%>
<!DOCTYPE html>
<% Login.validarSessao(request,response); %>
<html class="no-js" lang="en">
<head>
   <meta charset="utf-8">
   <title>Visualização e Exclusão de Animais</title>
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
        <li><a class="waves-effect" href="VisualizarExcluirAnimal.jsp">Animais</a></li> 
        <li><a id="ancorCadAnimal" class="waves-effect" href="" onclick="linkVisualizarExcluirAnimal()">Cadastro de Animais</a></li>
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
             <button style="top: 15px;" data-activates="slide-out" class="waves-effect waves-light btn-flat button-collapse green-text #FFFFFF"><b>Menu : <%= request.getAttribute("nome") %></b></button>
         </li>
      </ul>        
   </header>

<!-- Formulário para visualização e exclusão de animais -->
<section id="process">  
   <br>

   <div class="row">
      <form id="formVisExcAnimais">
         
         <div class="row">
            <div class="input-field col s2">
               <input type="text" id="pesquisarAnimal"></input>
               <label for="pesquisarAnimal"><b>Pesquisar</b></label>
            </div>
            <div class="col s1">
               <a id="pesquisar" class="btn-floating waves-effect waves-light" style="background: green">
                  <i class="material-icons">search</i>
               </a>
            </div>
            <div class="col s5"></div>
            <div class="col s2">
               <a class="waves-effect waves-light btn modal-trigger" href="#modalExcluirAnimal" id="excluirAnimal" style="background: green">
                  <i class="material-icons right">delete</i>Excluir Animal
               </a>
            </div>
            <div class="col s2">
               <a class="waves-effect waves-light btn" id="editarAnimal" style="background: green; color: white" href="EditarAnimal.jsp">
                  <i class="material-icons right">edit</i>Editar Animal
               </a>
            </div>
            <br><br><hr>
         </div>

         <!-- Modal Structure -->
         <div id="modalExcluirAnimal" class="modal">
            <div class="modal-content"> 
               <center><h4>Exclusão de Animal</h4></center>
               <p>
                  <b>Data de baixa:</b>
                  <input id="dataBaixa" type="date">
               </p>
               <p class="input-field">
                  <input type="text" id="motivoBaixa"></input>
                  <label for="motivoBaixa"><b>Motivo de Baixa</b></label>
               </p>
               <br>
               <p>
                  <center>
                     <a class="waves-effect waves-light btn" id="ConfirmExclusao" style="background: green">
                        <i class="material-icons right">done</i>Confirmar</a>
                     </center>
                  </p>
               </div>
            </div>

            <div class="row" style="color: green">
               <div class="col s12">
                  <p><b>Dados do Animal:</b></p>
               </div>
            </div>
            
            <div class="row">
               <div class="input-field col s2">
                  <input type="text" id="numAnimal"></input>
                  <label for="numAnimal"><b>Nº do Animal</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" id="nomAnimal"></input>
                  <label for="nomAnimal"><b>Nome do Animal</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s3">
                  <input type="text" id="nomCompAnimal"></input>
                  <label for="nomCompAnimal"><b>Nome Completo do Animal</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" id="regAnimal"></input>
                  <label for="regAnimal"><b>Registro do Pai</b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <input type="text" id="numMae"></input>
                  <label for="numMae"><b>Nº da Mãe</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" id="nomMae"></input>
                  <label for="nomMae"><b>Nome da Mãe</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s3">
                  <input type="text" id="nomCompMae"></input>
                  <label for="nomCompMae"><b>Nome Completo da Mãe</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" id="regMae"></input>
                  <label for="regMae"><b>Registro da Mãe</b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <input type="text" id="numPai"></input>
                  <label for="numPai"><b>Nº do Pai</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" id="nomPai"></input>
                  <label for="nomPai"><b>Nome do Pai</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s3">
                  <input type="text" id="nomCompPai"></input>
                  <label for="nomCompPai"><b>Nome Completo do Pai</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" id="regAnimal"></input>
                  <label for="regAnimal"><b>Registro do Animal</b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <input type="text" id="categoria"></input>
                  <label for="categoria"><b>Categoria</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" id="setor"></input>
                  <label for="setor"><b>Setor</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s1">
                  <input type="text" id="sexo"></input>
                  <label for="sexo"><b>Sexo</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s1">
                  <input type="text" id="idade"></input>
                  <label for="idade"><b>Idade</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" id="raca"></input>
                  <label for="raca"><b>Raça</b></label>
               </div>     
            </div>

            <div class="row">
               <div class="col s2">
                  <b>Previsão de Secagem</b>
                  <input id="dataSecagem" type="date">
               </div>
               <div class="col s1"></div>
               <div class="col s2">
                  <b>Previsão de Parto</b>
                  <input id="dataParto" type="date">
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" id="del"></input>
                  <label for="del"><b>Dias em Lactação</b></label>
               </div>
            </div>

            <div class="row">
               <div class="col s12">
                  <hr>
               </div>
            </div>

            <div class="row">
               <div class="col s12">
                  <p><b style="color: green">Exibir Listagem:</b></p> 
                  <p>
                     <input type="checkbox" id="reproducao"/>
                     <label for="reproducao"><b> Reprodução </b></label>
                  </p>
                  <p>
                     <input type="checkbox" id="producao"/>
                     <label for="producao"><b> Produção </b></label>
                  </p>
                  <p>
                     <input type="checkbox" id="sanidade"/>
                     <label for="sanidade"><b> Sanidade </b></label>
                  </p>
                  <hr>
               </div>
            </div>

            <div class="row">
               <div class="col s12">
                  <table class="striped">
                     <thead>
                        <tr>
                           <th>Tipo</th>
                           <th>Data</th>
                           <th>Descrição</th>
                        </tr>
                     </thead>
                     <tbody>
                        <tr>
                           <td>Controle Leiteiro</td>
                           <td>30/09/2017</td>
                           <td> 2.3; DEL:190</td>
                        </tr>
                        <tr>
                           <td>Controle Leiteiro</td>
                           <td>30/09/2017</td>
                           <td> 2.3; DEL:190</td>
                        </tr>
                        <tr>
                           <td>Controle Leiteiro</td>
                           <td>30/09/2017</td>
                           <td> 2.3; DEL:190</td>
                        </tr>
                     </tbody>
                  </table>
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
   <script src="js/VisExclAnimal.js"></script>
   <script src="js/menu.js"></script>
   <script src="js/linkMenu.js"></script>
</body>
</html>