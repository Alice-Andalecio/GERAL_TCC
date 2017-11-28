<%-- 
    Document   : Dieta
    Created on : 16/10/2017, 11:56:00
    Author     : Alice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <div class="background center-align">
                            <img src="images/logoPreto.png">
                            <hr>
                        </div>
                        <li><a class="waves-effect" href="VisualizarExcluirAnimal.jsp">Animais</a></li> 
                        <li><a class="waves-effect" href="CadastroAnimal.jsp">Cadastro de Animais</a></li>
                        <li><a class="waves-effect" href="controleLeiteiro.jsp">Controle Leiteiro</a></li>
                        <li><a class="waves-effect" href="#">Controle Reprodutivo</a>
                            <ul>
                                <li><a class="waves-effect" href="RepInseminacao.jsp">Inseminação/Cobrição</a></li>
                                <li><a class="waves-effect" href="RepDiagnostico.jsp">Diagnóstico</a></li>
                                <li><a class="waves-effect" href="RepParto.jsp">Parto</a></li>
                            </ul>
                        </li>
                        <li><a class="waves-effect" href="Dieta.jsp">Dieta</a></li>
                        <li><a class="waves-effect" href="medicamentos.jsp">Prescrição de Medicamentos</a></li>     
                        <li><a class="waves-effect" href="Relatorio.jsp">Relatórios</a></li>
                        <li><a class="waves-effect" href="vendaLeite.jsp">Venda de Leite</a></li>
                        <li><a class="waves-effect" href="index.jsp" style="color: green">SAIR</a></li>
            </ul>
            <ul>
                <li>
                    <button style="top: 15px;" data-activates="slide-out" class="waves-effect waves-light btn-flat button-collapse white-text #FFFFFF"><b>Menu: <%= request.getAttribute("nome")%></b></button>
                </li>
            </ul>
        </header>

        <!-- Formulário para cadastro de Dietas -->

        <section id="process">  
            <div class="row">
                <form id="formDieta" action="" method="POST" class="col s12">

                    <input type='hidden' name='acao' id="acao" value='GerarDieta'>
                    <input type='hidden' name='num' id="num" value=''>

                    <div class="row section-intro">
                        <div class="col-twelve">
                            <br>
                            <h2 style="color: green">DIETA</h2>
                            <br>
                        </div>         
                    </div>

                    <div class="row">
                        <div class="col s3">
                            <p>Data</p>
                            <input type="date" name="dataDieta" id="dataDieta"/>
                        </div>
                    </div>

                    <div class="esconder" id="dietaOutrosLotes">
                        <!-- Espaço para inserir a dieta dos outros lotes -->
                    </div>

                    <div class="row " id="divBotoesAdReLotes">
                        <hr>
                        <br>
                        <div class="col s2">
                            <a class="waves-effect waves-light btn" id="adicionarLote" style="background: green">
                                <i class="material-icons right">add</i>Adicionar Lote</a>
                        </div>
                        <div class="col s2">
                            <a class="waves-effect waves-light btn" id="removerLote" style="background: green">
                                <i class="material-icons right">delete</i>Remover Lote</a>
                        </div>
                    </div>

                    <div class="row" style="color: green">
                        <hr><br>
                        <i class="material-icons">edit</i>
                        <b>Observações:</b>
                        <br><br>
                    </div>

                    <div class="row">
                        <div class="input-field col s12">
                            <textarea id="obs" name="obs"></textarea>
                        </div>
                    </div>

                    <div class="row " id="divBotaoGerarDieta">
                        <br>
                        <div class="col s12" align="right">
                            <a class="waves-effect waves-light btn" id="gerarDieta" style="background: green">
                                <i class="material-icons right">assignment</i>Gerar Dieta</a>
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
        <script src="js/menu.js"></script>
    </body>
</html>