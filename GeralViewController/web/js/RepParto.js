window.onload = function () {
    document.querySelector('#numCrias').addEventListener('click', function (e) {
        MostrarCamposCrias(e.target.id);
    });
    document.querySelector('#salvarParto').addEventListener('click', function (e) {
        MostrarCamposCrias(e.target.id);
    });
};

function MostrarCamposCrias() {
    var num = document.querySelector('#numCrias').value;

    if (num == 1) {
        document.querySelector('#divCria1').classList.remove('esconder');
        document.querySelector('#divCria2').classList.add('esconder');
    } else if (num == 2) {
        document.querySelector('#divCria1').classList.remove('esconder');
        document.querySelector('#divCria2').classList.remove('esconder');
    }
}

function gravarInfoParto() {
    var form = document.getElementById("formParto");

    var numAnimal = document.getElementById("numAnimal").value;
    var nomAnimal = document.getElementById("nomAnimal").value;

    var padrao = document.getElementById("padrao").value;
    var doadora = document.getElementById("doadora").value;
    var receptora = document.getElementById("receptora").value;
    var descarte = document.getElementById("descarte").value;

    var perParto1 = document.getElementById("perParto1").value;
    var perParto2 = document.getElementById("perParto2").value;
    var diasGest = document.getElementById("diasGest").value;
    var tipo = document.getElementById("tipo").value;
    var retencao = document.getElementById("retencao").value;

    var dataParto = document.getElementById("dataParto").value;
    var horaParto = document.getElementById("horaParto").value;
    var tipoParto = document.getElementById("tipoParto").value;
    var grau = document.getElementById("grau").value;

    var numCrias = document.getElementById("numCrias").value;

    var numCria1 = document.getElementById("numCria1").value;
    var pelagem1 = document.getElementById("pelagem1").value;
    var peso1 = document.getElementById("peso1").value;
    var sexo1 = document.getElementById("sexo1").value;

    var numCria2 = document.getElementById("numCria2").value;
    var pelagem2 = document.getElementById("pelagem2").value;
    var peso2 = document.getElementById("peso2").value;
    var sexo2 = document.getElementById("sexo2").value;

    if (numAnimal === "") {
        alert("O número do animal é obrigatório.");
        document.getElementById("numAnimal").focus();
        return false;
    } else if (nomAnimal === "") {
        alert("O nome do animal é obrigatório.");
        document.getElementById("nomAnimal").focus;
        return false;
    } else if (padrao === "") {
        alert("Preencha o campo.");
        document.getElementById("padrao").focus;
        return false;
    } else if (doadora === "") {
        alert("Preencha o campo.");
        document.getElementById("doadora").focus;
        return false;
    } else if (receptora === "") {
        alert("Preencha o campo.");
        document.getElementById("receptora").focus;
        return false;
    } else if (descarte === "") {
        alert("Preencha o campo.");
        document.getElementById("descarte").focus;
        return false;
    } else if (perParto1 === "") {
        alert("A data é obrigatória.");
        document.getElementById("perParto1").focus;
        return false;
    } else if (perParto2 === "") {
        alert("A data é obrigatória.");
        document.getElementById("perParto2").focus;
        return false;
    } else if (diasGest === "") {
        alert("Insira quantos dias ficou em gestação.");
        document.getElementById("diasGest").focus;
        return false;
    } else if (tipo === "") {
        alert("O tipo de parto é obrigatório.");
        document.getElementById("tipo").focus;
        return false;
    } else if (retencao === 0) { //Retenção de Placenta (caixa de seleção).
        alert("Selecione se houve retenção de placenta.");
        document.getElementById("retencao").focus;
        return false;
    } else if (dataParto === "") {
        alert("A data do parto é obrigatória.");
        document.getElementById("dataParto").focus;
        return false;
    } else if (horaParto === "") {
        alert("A hora do parto é obrigatória.");
        document.getElementById("horaParto").focus;
        return false;
    } else if (tipoParto === "") {
        alert("O tipo do parto é obrigatório.");
        document.getElementById("tipoParto").focus;
        return false;
    } else if (grau === "") {
        alert("O campo Grau é obrigatório.");
        document.getElementById("grau").focus;
        return false;
    } else if (numCrias === 0) { //select de Crias.
        alert("Selecione o número de crias.");
        document.getElementById("numCrias").focus;
        return false;
    } else if (numCria1 === "") {
        alert("Insira o número da cria 1.");
        document.getElementById("numCria1").focus;
        return false;
    } else if (pelagem1 === "") {
        alert("Insira a pelagem da cria 1.");
        document.getElementById("pelagem1").focus;
        return false;
    } else if (peso1 === "") {
        alert("Insira o peso da cria 1.");
        document.getElementById("peso1").focus;
        return false;
    } else if (sexo1 === "") {
        alert("Insira o sexo da cria 1.");
        document.getElementById("sexo1").focus;
        return false;
    } else if (numCria2 === "") {
        alert("Insira o número da cria 2.");
        document.getElementById("numCria2").focus;
        return false;
    } else if (pelagem2 === "") {
        alert("Insira a pelagem da cria 2.");
        document.getElementById("pelagem2").focus;
        return false;
    } else if (peso2 === "") {
        alert("Insira o peso da cria 2.");
        document.getElementById("peso2").focus;
        return false;
    } else if (sexo2 === "") {
        alert("Insira o sexo da cria 2.");
        document.getElementById("sexo2").focus;
        return false;
    } else if (document.getElementById("acao").value === "gravarInfoParto") {
        caminhourl = "/GeralViewController/Servlet?acao=gravarInfoParto";
        form.action = caminhourl;
        form.submit();
    }
}
