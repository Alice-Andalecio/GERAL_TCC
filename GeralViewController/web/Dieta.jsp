<%-- 
    Document   : Dieta
    Created on : 16/10/2017, 11:56:00
    Author     : jaops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html class="no-js" lang="en">
<head>
   <meta charset="utf-8">
   <title>Dieta</title>
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
      <div class="row">
      </div>        
   </header>

   <!-- Formulário: Controle Reprodutivo - Diagnóstico -->
   <section id="process">  
      <div class="row">
         <form id="formDieta" class="col s12">

            <div class="row section-intro">
               <div class="col-twelve">
                  <br>
                  <h2 style="color: green">Dieta</h2>
                  <br>
               </div>         
            </div>

            <div class="row">
               <div class="col s3">
                  <p>Data</p>
                  <input type="date" name="dataDieta" id="dataDieta"/>
               </div>
               <hr>
            </div>

            <div class="row" style="color: green">
               <hr><br>
               <i class="material-icons">edit</i>
               <b>Preencha os campos referentes à dieta de cada lote:</b>
               <br><br>
            </div>

            <div class="row">
               <div class="col s12">
                  <b><u>Número do Lote: 1<u></b>
               </div>
               <br><br>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <label><b>Silagem:<b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="silagemManha" id="silagemManha"/>
                  <label for="silagemManha"><b>Manhã:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="silagemTarde" id="silagemTarde"/>
                  <label for="silagemTarde"><b>Tarde:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="silagemTotal" id="silagemTotal"/>
                  <label for="silagemTotal"><b>Total:</b></label>
               </div>
               <div class="input-field col s1">
                  <label><b>(Kg)<b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <label><b>Ração:<b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="racaoManha" id="racaoManha"/>
                  <label for="racaoManha"><b>Manhã:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="racaoTarde" id="racaoTarde"/>
                  <label for="racaoTarde"><b>Tarde:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="racaoTotal" id="racaoTotal"/>
                  <label for="racaoTotal"><b>Total:</b></label>
               </div>
               <div class="input-field col s1">
                  <label><b>(Kg)<b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <label><b>Algodão:<b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="algodaoManha" id="algodaoManha"/>
                  <label for="algodaoManha"><b>Manhã:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="algodaoTarde" id="algodaoTarde"/>
                  <label for="algodaoTarde"><b>Tarde:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="algodaoTotal" id="algodaoTotal"/>
                  <label for="algodaoTotal"><b>Total:</b></label>
               </div>
               <div class="input-field col s1">
                  <label><b>(Kg)<b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <label><b>Soja:<b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="sojaManha" id="sojaManha"/>
                  <label for="sojaManha"><b>Manhã:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="sojaTarde" id="sojaTarde"/>
                  <label for="sojaTarde"><b>Tarde:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="sojaTotal" id="sojaTotal"/>
                  <label for="sojaTotal"><b>Total:</b></label>
               </div>
               <div class="input-field col s1">
                  <label><b>(Kg)<b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <label><b>Poupa Cítrica:<b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="poupaManha" id="poupaManha"/>
                  <label for="poupaManha"><b>Manhã:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="poupaTarde" id="poupaTarde"/>
                  <label for="poupaTarde"><b>Tarde:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="poupaTotal" id="poupaTotal"/>
                  <label for="poupaTotal"><b>Total:</b></label>
               </div>
               <div class="input-field col s1">
                  <label><b>(Kg)<b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <label><b>Fubá:<b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="fubaManha" id="fubaManha"/>
                  <label for="fubaManha"><b>Manhã:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="fubaTarde" id="fubaTarde"/>
                  <label for="fubaTarde"><b>Tarde:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="fubaTotal" id="fubaTotal"/>
                  <label for="fubaTotal"><b>Total:</b></label>
               </div>
               <div class="input-field col s1">
                  <label><b>(Kg)<b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <label><b>Bicarbonato:<b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="bicarbonatoManha" id="bicarbonatoManha"/>
                  <label for="bicarbonatoManha"><b>Manhã:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="bicarbonatoTarde" id="bicarbonatoTarde"/>
                  <label for="bicarbonatoTarde"><b>Tarde:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="bicarbonatoTotal" id="bicarbonatoTarde"/>
                  <label for="bicarbonatoTarde"><b>Total:</b></label>
               </div>
               <div class="input-field col s1">
                  <label><b>(Kg)<b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <label><b>Núcleo Vitaminado:<b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="nucleoManha" id="nucleoManha"/>
                  <label for="nucleoManha"><b>Manhã:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="nucleoTarde" id="nucleoTarde"/>
                  <label for="nucleoTarde"><b>Tarde:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="nucleoTotal" id="nucleoTotal"/>
                  <label for="nucleoTotal"><b>Total:</b></label>
               </div>
               <div class="input-field col s1">
                  <label><b>(Kg)<b></label>
               </div>
            </div>

            <div class="row">
               <div class="input-field col s2">
                  <input type="text" name="outraCom" id="outraCom"/>
                  <label for="outraCom"><b>Outra:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="silagemManha" id="silagemManha"/>
                  <label for="silagemManha"><b>Manhã:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="silagemTarde" id="silagemTarde"/>
                  <label for="silagemTarde"><b>Tarde:</b></label>
               </div>
               <div class="col s1"></div>
               <div class="input-field col s2">
                  <input type="text" name="silagemTotal" id="silagemTotal"/>
                  <label for="silagemTotal"><b>Total:</b></label>
               </div>
               <div class="input-field col s1">
                  <label><b>(Kg)<b></label>
               </div>
            </div>

            <div class="row" style="color: green">
               <hr><br>
               <i class="material-icons">edit</i>
               <b>Observações:</b>
               <br><br>
            </div>

            <div class="row">
               <div class="col s12">
                  <textarea id="obs"></textarea>
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
   <script src="js/dieta.js"></script>
</body>
</html>
