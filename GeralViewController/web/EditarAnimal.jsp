<%-- 
    Document   : EditarAnimal
    Created on : 16/10/2017, 11:56:13
    Author     : jaops
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <li><a class="waves-effect" href="#">Relatórios</a>
                            <ul>
                                <li><a class="waves-effect" href="#">Controle Leiteiro</a></li>
                                <li><a class="waves-effect" href="#">Resumo do Animal</a></li>
                            </ul>
                        </li>
                        <li><a class="waves-effect" href="vendaLeite.jsp">Venda de Leite</a></li>
                        <li><a class="waves-effect" href="index.jsp" style="color: green">SAIR</a></li>
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

                    <!-- Todos os campos dentro da div "divCampAnimal" são específicos para cadastro de "Animal" -->

                    <div class="esconder" id="divCampAnimal">
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
                    </div>

                    <!-- Todos os campos dentro da div "divCampEmbriao" são específicos para cadastro de "Embrião" -->

                    <div class="esconder" id="divCampEmbriao">
                        <div class="row">
                            <div class="input-field col s3"> 
                                <b>Entrada</b>
                                <input type="date" name="entradaEmbriao" id="entradaEmbriao">
                            </div>
                        </div>

                        <div class="row">
                            <br>
                            <div class="input-field col s3">
                                <input type="text" id="numEmbriao"></input>
                                <label for="numEmbriao"><b>Nº do Embrião</b></label>
                            </div>
                            <div class="col s1"></div>
                            <div class="input-field col s3">
                                <select class="browser-default" name="tipoEmbriao" id="tipoEmbriao">
                                    <option value="" disabled selected>Tipo de Embrião</option>
                                    <option value="1">Fresco</option>
                                    <option value="2">Congelado</option>
                                </select>
                            </div> 
                            <div class="col s1"></div>
                            <div class="input-field col s3">
                                <select class="browser-default" name="classificacaoEmbriao" id="classificacaoEmbriao">
                                    <option value="" disabled selected>Classificação do Embrião</option>
                                    <option value="1">Blastocisto</option>
                                    <option value="2">Blastocisto Expandido</option>
                                    <option value="3">Mórula</option>
                                </select>
                            </div>
                            <br><br><br><hr>
                        </div>
                    </div>

                    <!-- Todos os campos dentro da div "divCampSemen" são específicos para cadastro de "Sêmen" -->

                    <div class="esconder" id="divCampSemen">
                        <div class="row">
                            <div class="input-field col s2">
                                <input type="text" id="numSemen"></input>
                                <label for="numSemen"><b>Nº do Sêmen</b></label>
                            </div>
                            <br><br><br><hr>
                        </div>
                    </div>

                    <div class="row">
                        <br>
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
                        <br><br>
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
                                <option value="29">DR - Dexter</option>
                                <option value="30">RW - Dinamarquês Vermelho</option>
                                <option value="31">DG - Draughtmaster</option>
                                <option value="32">FP - East Fleming Red Pied</option>
                                <option value="33">ER - Eringer</option>
                                <option value="34">FA - Flamenga</option>
                                <option value="35">FR - Fribourg</option>
                                <option value="36">GA - Galloway</option>
                                <option value="37">GS - Gascone</option>
                                <option value="38">GV - Gelbvieh</option>
                                <option value="39">GY - Gir</option>
                                <option value="40">GL - Gir Leiteiro</option>
                                <option value="41">GH - Gir Leiteiro Mocho</option>
                                <option value="42">GM - Gir Mocho</option>
                                <option value="43">GO - Girolando</option>
                                <option value="44">GI - Grauvieh</option>
                                <option value="45">GR - Groningen</option>
                                <option value="46">GU - Guernsey</option>
                                <option value="47">GZ - Guzerá</option>
                                <option value="48">GT - Guzerá Leiteiro</option>
                                <option value="49">GD - Guzolando</option>
                                <option value="50">HC - Hays Converter</option>
                                <option value="51">HH - Hereford</option>
                                <option value="52">HP - Hereford Mocho</option>
                                <option value="53">HI - Highland</option>
                                <option value="54">HO - Holandês</option>
                                <option value="55">WW - Holandês Vermelho</option>
                                <option value="56">IW - Illawarra</option>
                                <option value="57">IB - Indubrasil</option>
                                <option value="58">JA - Jafarabadi</option>
                                <option value="59">JE - Jersey</option>
                                <option value="60">CG - Kangaian</option>
                                <option value="61">KB - Kobe (Wagyu)</option>
                                <option value="62">LA - Lavinia</option>
                                <option value="63">LM - Limousin</option>
                                <option value="64">LR - Lincoln Red</option>
                                <option value="65">LU - Luing</option>
                                <option value="66">MA - Maine Anjou</option>
                                <option value="67">MR - Marchigiana</option>
                                <option value="68">ME - Maremmana</option>
                                <option value="69">MD - Mediterrâneo</option>
                                <option value="70">MI - Mueserhineissel</option>
                                <option value="71">UM - Murrah</option>
                                <option value="72">MG - Murray Gray</option>
                                <option value="73">NE - Nelore</option>
                                <option value="74">NM - Nelore Mocho</option>
                                <option value="75">NO - Normando</option>
                                <option value="76">NR - Norwegian Red</option>
                                <option value="77">PN - Pantaneiro</option>
                                <option value="78">SB - Pardo Suiço (Brown Swiss)</option>
                                <option value="79">BS - Pardo Suiço Leite</option>
                                <option value="80">PA - Parthenais</option>
                                <option value="81">PI - Piemontês</option>
                                <option value="82">PZ - Pinzgauer</option>
                                <option value="83">PR - Pirenaico</option>
                                <option value="84">PT - Pitangueiras</option>
                                <option value="85">RA - Ranger</option>
                                <option value="86">AR - Red Angus</option>
                                <option value="87">RB - Red Brangus</option>
                                <option value="88">RD - Red Dane</option>
                                <option value="89">RP - Red Poll</option>
                                <option value="90">RN - Romagnola</option>
                                <option value="91">RG - Rubia Galega</option>
                                <option value="92">SW - Sahiwal</option>
                                <option value="93">SL - Salers</option>
                                <option value="94">SG - Santa Gertrudis</option>
                                <option value="95">SN - Senangus</option>
                                <option value="96">SE - Senepol</option>
                                <option value="97">SS - Shortorn (Beef)</option>
                                <option value="98">SO - Siboney</option>
                                <option value="99">SI - Simbrasil</option>
                                <option value="100">SM - Simental</option>
                                <option value="101">SD - Sindi</option>
                                <option value="102">DS - South Devon</option>
                                <option value="103">SX - Sussex</option>
                                <option value="104">TB - Tabapuã</option>
                                <option value="105">TA - Tarentaise</option>
                                <option value="106">TG - Tasmanian Grey</option>
                                <option value="107">TL - Texas Longhorn</option>
                                <option value="108">TI - Tuli</option>
                                <option value="109">WB - Welsh Black</option>
                                <option value="110">WF - West Flemish Rer</option>
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
                                <option value="29">DR - Dexter</option>
                                <option value="30">RW - Dinamarquês Vermelho</option>
                                <option value="31">DG - Draughtmaster</option>
                                <option value="32">FP - East Fleming Red Pied</option>
                                <option value="33">ER - Eringer</option>
                                <option value="34">FA - Flamenga</option>
                                <option value="35">FR - Fribourg</option>
                                <option value="36">GA - Galloway</option>
                                <option value="37">GS - Gascone</option>
                                <option value="38">GV - Gelbvieh</option>
                                <option value="39">GY - Gir</option>
                                <option value="40">GL - Gir Leiteiro</option>
                                <option value="41">GH - Gir Leiteiro Mocho</option>
                                <option value="42">GM - Gir Mocho</option>
                                <option value="43">GO - Girolando</option>
                                <option value="44">GI - Grauvieh</option>
                                <option value="45">GR - Groningen</option>
                                <option value="46">GU - Guernsey</option>
                                <option value="47">GZ - Guzerá</option>
                                <option value="48">GT - Guzerá Leiteiro</option>
                                <option value="49">GD - Guzolando</option>
                                <option value="50">HC - Hays Converter</option>
                                <option value="51">HH - Hereford</option>
                                <option value="52">HP - Hereford Mocho</option>
                                <option value="53">HI - Highland</option>
                                <option value="54">HO - Holandês</option>
                                <option value="55">WW - Holandês Vermelho</option>
                                <option value="56">IW - Illawarra</option>
                                <option value="57">IB - Indubrasil</option>
                                <option value="58">JA - Jafarabadi</option>
                                <option value="59">JE - Jersey</option>
                                <option value="60">CG - Kangaian</option>
                                <option value="61">KB - Kobe (Wagyu)</option>
                                <option value="62">LA - Lavinia</option>
                                <option value="63">LM - Limousin</option>
                                <option value="64">LR - Lincoln Red</option>
                                <option value="65">LU - Luing</option>
                                <option value="66">MA - Maine Anjou</option>
                                <option value="67">MR - Marchigiana</option>
                                <option value="68">ME - Maremmana</option>
                                <option value="69">MD - Mediterrâneo</option>
                                <option value="70">MI - Mueserhineissel</option>
                                <option value="71">UM - Murrah</option>
                                <option value="72">MG - Murray Gray</option>
                                <option value="73">NE - Nelore</option>
                                <option value="74">NM - Nelore Mocho</option>
                                <option value="75">NO - Normando</option>
                                <option value="76">NR - Norwegian Red</option>
                                <option value="77">PN - Pantaneiro</option>
                                <option value="78">SB - Pardo Suiço (Brown Swiss)</option>
                                <option value="79">BS - Pardo Suiço Leite</option>
                                <option value="80">PA - Parthenais</option>
                                <option value="81">PI - Piemontês</option>
                                <option value="82">PZ - Pinzgauer</option>
                                <option value="83">PR - Pirenaico</option>
                                <option value="84">PT - Pitangueiras</option>
                                <option value="85">RA - Ranger</option>
                                <option value="86">AR - Red Angus</option>
                                <option value="87">RB - Red Brangus</option>
                                <option value="88">RD - Red Dane</option>
                                <option value="89">RP - Red Poll</option>
                                <option value="90">RN - Romagnola</option>
                                <option value="91">RG - Rubia Galega</option>
                                <option value="92">SW - Sahiwal</option>
                                <option value="93">SL - Salers</option>
                                <option value="94">SG - Santa Gertrudis</option>
                                <option value="95">SN - Senangus</option>
                                <option value="96">SE - Senepol</option>
                                <option value="97">SS - Shortorn (Beef)</option>
                                <option value="98">SO - Siboney</option>
                                <option value="99">SI - Simbrasil</option>
                                <option value="100">SM - Simental</option>
                                <option value="101">SD - Sindi</option>
                                <option value="102">DS - South Devon</option>
                                <option value="103">SX - Sussex</option>
                                <option value="104">TB - Tabapuã</option>
                                <option value="105">TA - Tarentaise</option>
                                <option value="106">TG - Tasmanian Grey</option>
                                <option value="107">TL - Texas Longhorn</option>
                                <option value="108">TI - Tuli</option>
                                <option value="109">WB - Welsh Black</option>
                                <option value="110">WF - West Flemish Rer</option>
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
                                <option value="29">DR - Dexter</option>
                                <option value="30">RW - Dinamarquês Vermelho</option>
                                <option value="31">DG - Draughtmaster</option>
                                <option value="32">FP - East Fleming Red Pied</option>
                                <option value="33">ER - Eringer</option>
                                <option value="34">FA - Flamenga</option>
                                <option value="35">FR - Fribourg</option>
                                <option value="36">GA - Galloway</option>
                                <option value="37">GS - Gascone</option>
                                <option value="38">GV - Gelbvieh</option>
                                <option value="39">GY - Gir</option>
                                <option value="40">GL - Gir Leiteiro</option>
                                <option value="41">GH - Gir Leiteiro Mocho</option>
                                <option value="42">GM - Gir Mocho</option>
                                <option value="43">GO - Girolando</option>
                                <option value="44">GI - Grauvieh</option>
                                <option value="45">GR - Groningen</option>
                                <option value="46">GU - Guernsey</option>
                                <option value="47">GZ - Guzerá</option>
                                <option value="48">GT - Guzerá Leiteiro</option>
                                <option value="49">GD - Guzolando</option>
                                <option value="50">HC - Hays Converter</option>
                                <option value="51">HH - Hereford</option>
                                <option value="52">HP - Hereford Mocho</option>
                                <option value="53">HI - Highland</option>
                                <option value="54">HO - Holandês</option>
                                <option value="55">WW - Holandês Vermelho</option>
                                <option value="56">IW - Illawarra</option>
                                <option value="57">IB - Indubrasil</option>
                                <option value="58">JA - Jafarabadi</option>
                                <option value="59">JE - Jersey</option>
                                <option value="60">CG - Kangaian</option>
                                <option value="61">KB - Kobe (Wagyu)</option>
                                <option value="62">LA - Lavinia</option>
                                <option value="63">LM - Limousin</option>
                                <option value="64">LR - Lincoln Red</option>
                                <option value="65">LU - Luing</option>
                                <option value="66">MA - Maine Anjou</option>
                                <option value="67">MR - Marchigiana</option>
                                <option value="68">ME - Maremmana</option>
                                <option value="69">MD - Mediterrâneo</option>
                                <option value="70">MI - Mueserhineissel</option>
                                <option value="71">UM - Murrah</option>
                                <option value="72">MG - Murray Gray</option>
                                <option value="73">NE - Nelore</option>
                                <option value="74">NM - Nelore Mocho</option>
                                <option value="75">NO - Normando</option>
                                <option value="76">NR - Norwegian Red</option>
                                <option value="77">PN - Pantaneiro</option>
                                <option value="78">SB - Pardo Suiço (Brown Swiss)</option>
                                <option value="79">BS - Pardo Suiço Leite</option>
                                <option value="80">PA - Parthenais</option>
                                <option value="81">PI - Piemontês</option>
                                <option value="82">PZ - Pinzgauer</option>
                                <option value="83">PR - Pirenaico</option>
                                <option value="84">PT - Pitangueiras</option>
                                <option value="85">RA - Ranger</option>
                                <option value="86">AR - Red Angus</option>
                                <option value="87">RB - Red Brangus</option>
                                <option value="88">RD - Red Dane</option>
                                <option value="89">RP - Red Poll</option>
                                <option value="90">RN - Romagnola</option>
                                <option value="91">RG - Rubia Galega</option>
                                <option value="92">SW - Sahiwal</option>
                                <option value="93">SL - Salers</option>
                                <option value="94">SG - Santa Gertrudis</option>
                                <option value="95">SN - Senangus</option>
                                <option value="96">SE - Senepol</option>
                                <option value="97">SS - Shortorn (Beef)</option>
                                <option value="98">SO - Siboney</option>
                                <option value="99">SI - Simbrasil</option>
                                <option value="100">SM - Simental</option>
                                <option value="101">SD - Sindi</option>
                                <option value="102">DS - South Devon</option>
                                <option value="103">SX - Sussex</option>
                                <option value="104">TB - Tabapuã</option>
                                <option value="105">TA - Tarentaise</option>
                                <option value="106">TG - Tasmanian Grey</option>
                                <option value="107">TL - Texas Longhorn</option>
                                <option value="108">TI - Tuli</option>
                                <option value="109">WB - Welsh Black</option>
                                <option value="110">WF - West Flemish Rer</option>
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