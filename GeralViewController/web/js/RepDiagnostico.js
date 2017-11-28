function gravarInfoDiagnostico() {
    var form = document.getElementById("formDiagnostico");

    var numAnimal = document.getElementById("numAnimal").value;
    var nomAnimal = document.getElementById("nomAnimal").value;

    var inseminadasCobertas = document.getElementById("inseminadasCobertas").value;
    var vazias = document.getElementById("vazias").value;
    var gestantes = document.getElementById("gestantes").value;
    var emCrescimento = document.getElementById("emCrescimento").value;

    var padrao = document.getElementById("padrao").value;
    var doadora = document.getElementById("doadora").value;
    var receptora = document.getElementById("receptora").value;
    var descarte = document.getElementById("descarte").value;

    var dataDiagnostico = document.getElementById("dataDiagnostico").value;
    var horaDiagnostico = document.getElementById("horaDiagnostico").value;

    var diagnostico = document.getElementById("diagnostico").value;
    var sexo = document.getElementById("sexo").value;

    var numDias = document.getElementById("numDias").value;
    var reprodutor = document.getElementById("reprodutor").value;
    var raca = document.getElementById("raca").value;

    var dataCio = document.getElementById("dataCio").value;
    var horaCio = document.getElementById("horaCio").value;

    var cio = document.getElementById("cio").value;
    var muco = document.getElementById("muco").value;
    var te = document.getElementById("te").value;

    var horaCio = document.getElementById("utero").value;
    var cio = document.getElementById("ovd").value;
    var muco = document.getElementById("ovE").value;
    var te = document.getElementById("base").value;

    if (numAnimal === "") {
        alert("O número do animal é obrigatório.");
        document.getElementById("numAnimal").focus();
        return false;
    } else if (nomAnimal === "") {
        alert("O nome do animal é obrigatório.");
        document.getElementById("nomAnimal").focus;
        return false;
    } else if (inseminadasCobertas === "") {
        alert("Campo obrigatório.");
        document.getElementById("inseminadasCobertas").focus;
        return false;
    } else if (vazias === "") {
        alert("Campo obrigatório.");
        document.getElementById("vazias").focus;
        return false;
    } else if (gestantes === "") {
        alert("Campo obrigatório.");
        document.getElementById("gestantes").focus;
        return false;
    } else if (emCrescimento === "") {
        alert("Campo obrigatório.");
        document.getElementById("emCrescimento").focus;
        return false;
    } else if (padrao === "") {
        alert("Campo obrigatório.");
        document.getElementById("padrao").focus;
        return false;
    } else if (doadora === "") {
        alert("Campo obrigatório.");
        document.getElementById("doadora").focus;
        return false;
    } else if (receptora === "") {
        alert("Campo obrigatório.");
        document.getElementById("receptora").focus;
        return false;
    } else if (descarte === "") {
        alert("Campo obrigatório.");
        document.getElementById("descarte").focus;
        return false;
    } else if (dataDiagnostico === "") {
        alert("Campo obrigatório.");
        document.getElementById("dataDiagnostico").focus;
        return false;
    } else if (horaDiagnostico === "") {
        alert("Campo obrigatório.");
        document.getElementById("horaDiagnostico").focus;
        return false;
    } else if (diagnostico === "") {
        alert("Campo obrigatório.");
        document.getElementById("diagnostico").focus;
        return false;
    } else if (sexo === "") {
        alert("Campo obrigatório.");
        document.getElementById("sexo").focus;
        return false;
    } else if (numDias === "") {
        alert("Campo obrigatório.");
        document.getElementById("numDias").focus;
        return false;
    } else if (reprodutor === "") {
        alert("Campo obrigatório.");
        document.getElementById("reprodutor").focus;
        return false;
    } else if (raca === "") {
        alert("Campo obrigatório.");
        document.getElementById("raca").focus;
        return false;
    } else if (dataCio === "") {
        alert("Campo obrigatório.");
        document.getElementById("dataCio").focus;
        return false;
    } else if (horaCio === "") {
        alert("Campo obrigatório.");
        document.getElementById("horaCio").focus;
        return false;
    } else if (cio === "") {
        alert("Campo obrigatório.");
        document.getElementById("cio").focus;
        return false;
    } else if (muco === "") {
        alert("Campo obrigatório.");
        document.getElementById("muco").focus;
        return false;
    } else if (te === "") {
        alert("Campo obrigatório.");
        document.getElementById("te").focus;
        return false;
    } else if (utero === "") {
        alert("Campo obrigatório.");
        document.getElementById("utero").focus;
        return false;
    } else if (ovD === "") {
        alert("Campo obrigatório.");
        document.getElementById("ovD").focus;
        return false;
    } else if (ovE === "") {
        alert("Campo obrigatório.");
        document.getElementById("ovE").focus;
        return false;
    } else if (base === "") {
        alert("Campo obrigatório.");
        document.getElementById("base").focus;
        return false;

    } else if (document.getElementById("acao").value === "gravarInfoInseminacao") {
        caminhourl = "/GeralViewController/Servlet?acao=gravarInfoInseminacao";
        form.action = caminhourl;
        form.submit();
    }
}

