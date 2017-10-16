<%-- 
    Document   : vendaLeite
    Created on : 16/10/2017, 11:57:42
    Author     : jaops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8">
        <title>Venda de Leite</title>
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

            table, th {
                border: 1px solid black;
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

        <!-- Formulário para realizar login no sistema -->
        <section id="process">  
            <div class="row">
                <center>
                    <div class="col s12"> 
                        <br><br>        
                        <h5><b>Venda de Leite</b></h5>
                </center>
                <br>
            </div>

            <div class="row">
                <div class="input-field col s2">
                    <input type="text" id="ano"></input>
                    <label for="ano"><b>Ano</b></label>
                </div>
                <div class="col s1"></div>
                <div class="input-field col s2">
                    <input type="text" id="mes"></input>
                    <label for="mes"><b>Mês</b></label>
                </div>
            </div>

            <div class="row">
                <div class="col s2"></div>
                <div class="col s12">
                    <table class="striped" style="width:100%">
                        <thead>
                            <tr>
                                <th>Dia</th>
                                <th>Func</th> 
                                <th>SEDE</th>
                                <th>Bezerras</th>
                                <th>Indústria</th>
                                <th>UFC</th>
                                <th>CCS</th>
                                <th>Vc MASTITE</th>
                                <th>Nº Vacas</th>
                                <th>Total</th>
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <input type = "date">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                                <td>
                                    <input type="text" name="">
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>

            <div class="row">
                <div class="col s4"></div>
                <div class="col s2">
                    <a class="waves-effect waves-light btn" id="Atualizar">
                        <i class="material-icons right">update</i>Atualizar</a>
                </div>

                <div class="col s6"></div>
                <div class="col s2">
                    <a class="waves-effect waves-light btn" id="salvar">
                        <i class="material-icons right">done</i>Aplicar</a>
                </div>
            </div>

            <br>

            <div class="row">
                <div class="input-field col s3">
                    <input type="text" id="numVacasLactacao"></input>
                    <label for="numVacasLactacao"><b>Nº de Vacas em Lactação/Médio: </b></label>
                </div>
                <div class="col s1"></div>
                <div class="input-field col s3">
                    <input type="text" id="producaoMedia"></input>
                    <label for="producaoMedia"><b>Produção Média/Vaca/Dia: </b></label>
                </div>
                <div class="col s1"></div>
                <div class="input-field col s3">
                    <input type="text" id="producaoMediaLeite"></input>
                    <label for="producaoMediaLeite"><b>Produção Média/Leite/Dia: </b></label>
                </div>
            </div>

            <div class="row">
                <div class="input-field col s3">
                    <input type="text" id="racaotot"></input>
                    <label for="racaotot"><b>Consumo de Ração Total/Mês: </b></label>
                </div>
                <div class="col s1"></div>
                <div class="input-field col s3">
                    <input type="text" id="producaoMedia"></input>
                    <label for="producaoMedia"><b>Relação Leite/Ração: </b></label>
                </div>
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
                            <a class="smoothscroll" title="Back to Top" href="#top"><i class="icon ion-android-arrow-up"></i></a>
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
    </body>
</html>
