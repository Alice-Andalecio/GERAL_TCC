<%-- 
    Document   : RepDiagnostico
    Created on : 16/10/2017, 11:57:03
    Author     : jaops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8">
        <title>Diagnóstico</title>
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

        <!-- Formulário: Controle Reprodutivo - Diagnóstico -->
        
        <section id="process">  
            <br>

            <div class="row">
                <form id="formDiagnostico" class="col s12">

                    <div class="row section-intro">
                        <div class="col-twelve">
                            <br>
                            <h2 style="color: green">REPRODUÇÃO - DIAGNÓSTICO</h2>
                            <br>
                        </div>         
                    </div>

                    <div class="row">
                        <div class="input-field col s3">
                            <input type="text" id="pesquisarAnimal"></input>
                            <label for="pesquisarAnimal"><b>Pesquisar Animal</b></label>
                        </div>
                        <div class="col s1">
                            <a id="pesquisar" class="btn-floating waves-effect waves-light" style="background: green"><i class="material-icons">search</i></a>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col s12">
                            <hr>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s3">
                            <input type="text" id="numAnimal"></input>
                            <label for="numAnimal"><b>Nº do Animal</b></label>
                        </div>
                        <div class="col s1"></div>
                        <div class="input-field col s3">
                            <input type="text" id="nomAnimal"></input>
                            <label for="nomAnimal"><b>Nome do Animal</b></label>
                        </div>
                    </div>

                    <div class="row">
                        <hr>
                    </div>

                    <div class="row">
                        <div class="col s3">
                            <b>Fêmeas:</b>
                            <br>
                            <input type="checkbox" id="inseminadasCobertas"></input>
                            <label for="inseminadasCobertas"><b>Inseminadas/Cobertas</b></label>
                            <br>
                            <input type="checkbox" id="vazias"></input>
                            <label for="vazias"><b>Vazias</b></label>
                            <br>
                            <input type="checkbox" id="gestantes"></input>
                            <label for="gestantes"><b>Gestantes</b></label>
                            <br>
                            <input type="checkbox" id="emCrescimento"></input>
                            <label for="emCrescimento"><b>Em Crescimento</b></label>
                        </div>
                        <div class="col s1"></div>
                        <div class="col s2">
                            <b>Tipo:</b>
                            <br>
                            <input type="checkbox" id="padrao"></input>
                            <label for="padrao"><b>Padrão</b></label>
                            <br>
                            <input type="checkbox" id="doadora"></input>
                            <label for="doadora"><b>Doadora</b></label>
                            <br>
                            <input type="checkbox" id="receptora"></input>
                            <label for="receptora"><b>Receptora</b></label>
                            <br>
                            <input type="checkbox" id="descarte"></input>
                            <label for="descarte"><b>Descarte</b></label>
                        </div>
                    </div>

                    <div class="row" style="color: green">
                        <hr><br>
                        <i class="material-icons">edit</i>
                        <b>Preencha os campos referentes ao diagnóstico de gestação:</b>
                        <br><br>
                    </div>

                    <div class="row">
                        <div class=" input-field col s2">
                            <p>Data do Diagnóstico:</p>
                            <input type="date" id="dataDiagnostico" name="dataDiagnostico">
                        </div>
                        <div class="col s1"></div>
                        <div class=" input-field col s2">
                            <p>Hora do Diagnóstico:</p>
                            <input type="time" id="horaDiagnostico" name="horaDiagnostico">
                        </div>
                    </div>

                    <div class="row">
                        <br>
                        <div class="col s2">
                            <select id="diagnostico" name="diagnostico" class="browser-default">
                                <option value="" disabled selected>Diagnóstico</option>
                                <option value="1">Positivo</option>
                                <option value="2">Negativo</option>
                            </select>
                        </div>
                        <div class="col s1"></div>
                        <div class="col s2">
                            <select id="sexo" name="sexo" class="browser-default">
                                <option value="" disabled selected>Sexo</option>
                                <option value="1">Fêmea</option>
                                <option value="2">Macho</option>
                            </select>
                        </div>
                        <div class="col s1"></div>
                        <div class="input-field col s1">
                            <input type="number" id="numDias"></input>
                            <label for="numDias"><b>Nº Dias</b></label>
                        </div>
                        <div class="col s1"></div>
                        <div class="input-field col s2">
                            <input type="text" id="reprodutor"></input>
                            <label for="reprodutor"><b>Redrodutor</b></label>
                        </div>
                        <div class="col s1"></div>
                        <div class="input-field col s1">
                            <input type="text" id="raca"></input>
                            <label for="raca"><b>Raça</b></label>
                        </div>
                    </div>

                    <div class="row" style="color: green">
                        <hr><br>
                        <i class="material-icons">edit</i>
                        <b>Preencha os campos referentes ao cio da vaca:</b>
                        <br><br>
                    </div>

                    <div class="row">
                        <div class=" input-field col s2">
                            <p>Data do cio:</p>
                            <input type="date" id="dataCio" name="dataCio">
                        </div>
                        <div class="col s1"></div>
                        <div class=" input-field col s2">
                            <p>Hora do cio:</p>
                            <input type="time" id="horaCio" name="horaCio">
                        </div>
                    </div>

                    <div class="row">
                        <br>
                        <div class="col s2">
                            <select id="cio" name="cio" class="browser-default">
                                <option value="" disabled selected>Cio</option>
                                <option value="1">Sim</option>
                                <option value="2">Não</option>
                            </select>
                        </div>
                        <div class="col s1"></div>
                        <div class="col s2">
                            <select id="muco" name="muco" class="browser-default">
                                <option value="" disabled selected>Muco</option>
                                <option value="1">Sim</option>
                                <option value="2">Não</option>
                            </select>
                        </div>
                        <div class="col s1"></div>
                        <div class="col s2">
                            <select id="te" name="te" class="browser-default">
                                <option value="" disabled selected>TE</option>
                                <option value="1">Sim</option>
                                <option value="2">Não</option>
                            </select>
                        </div>
                    </div>

                    <div class="row" style="color: green">
                        <hr><br>
                        <i class="material-icons">edit</i>
                        <b>Preencha os campos referentes ao Exame Ginecológico:</b>
                        <br><br>
                    </div>

                    <div class="row">
                        <div class="input-field col s2">
                            <input type="text" id="utero"></input>
                            <label for="utero"><b>Útero</b></label>
                        </div>
                        <div class="col s1"></div>
                        <div class="input-field col s2">
                            <input type="text" id="ovD"></input>
                            <label for="ovD"><b>Ovário Direito</b></label>
                        </div>
                        <div class="col s1"></div>
                        <div class="input-field col s2">
                            <input type="text" id="ovE"></input>
                            <label for="ovE"><b>Ovário Esquerdo</b></label>
                        </div>
                        <div class="col s1"></div>
                        <div class="input-field col s2">
                            <input type="text" id="base"></input>
                            <label for="base"><b>Base Recom.</b></label>
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

                    <div class="row">
                        <br>
                        <div class="col s3">
                            <a class="waves-effect waves-light btn" id="salvarDiag" style="background: green">
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
        <script src="js/menu.js"></script>
    </body>
</html>