<%-- 
    Document   : login
    Created on : 16/10/2017, 11:56:37
    Author     : jaops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
   <meta charset="utf-8">
   <title>Login</title>
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
      nav {
         color: transparent;
         background-color: transparent;
         width: auto;
         height: auto;
         line-height: auto;
         border: none;
      }
   </style>

</head>

<body id="top">

   <!-- Header -->
   <header>
      <div class="row">
         <div class="logo">
            <a href="index.jsp"></a>
         </div>

         <nav id="main-nav-wrap">
            <ul class="main-navigation">
               <li><a href="index.jsp" title="">Início</a></li>
               <li class="highlight with-sep"><a href="cadastro.jsp" title="" style="color: green">Cadastre-se</a></li>                             
            </ul>
         </nav>
         <a class="menu-toggle" href="#"><span>Menu</span></a>   
      </div>        
   </header>

   <!-- Formulário para realizar login no sistema -->
   <form id="process" name="formLogin" method="POST">  
      <div class="row">
         <center>
            <div class="col s12"> 
               <br><br>        
               <h5><b>Login</b></h5>
               <br>
               <div class="row">
                  <div class="col s3"></div>
                  <div class="input-field col s6 center-block">
                     <input id="email" name="email" type="email" class="validate">
                     <label for="email"><b>Email</b></label>
                  </div>
               </div>
               <div class="row">
                  <div class="col s3"></div>
                  <div class="input-field col s6 center-block">
                     <input id="senha" name="password" type="password" class="validate">
                     <label for="senha"><b>Senha</b></label>
                  </div>
               </div>
               <br>
               <h6><a href="esqueceuSenha.jsp" style="color: green">Esqueceu a senha? Clique aqui!</a></h6>
               <br>
               <a class="waves-effect waves-light btn" onclick="logarRedirect()" style="background: green">Entrar</a>
        </center>
      </div>
   </form>   

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
   <script src="js/login.js"></script>
</body>
</html>