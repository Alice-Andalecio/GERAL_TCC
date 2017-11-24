function gravarInfoInseminacao() {
    var form = document.getElementById("formInseminacao");

    var numAnimal = document.getElementById("numAnimal").value;
    var nomAnimal = document.getElementById("nomAnimal").value;
    
    var inseminadasCobertas = document.getElementById("inseminadasCobertas").value;
    var vazias = document.getElementById("vazias").value;
    var gestantes = document.getElementById("gestantes").value;
    
    var inseminacao = document.getElementById("inseminacao").value;
    var cobricao = document.getElementById("cobricao").value;
    
    var somSetor = document.getElementById("somSetor").value;
    var todos = document.getElementById("todos").value;
    
    var padrao = document.getElementById("padrao").value;
    var doadora = document.getElementById("doadora").value;
    var receptora = document.getElementById("receptora").value;
    var descarte = document.getElementById("descarte").value;
    
    var dataInseminacao = document.getElementById("dataInseminacao").value;
    var horaInseminacao = document.getElementById("horaInseminacao").value;
    
    var reprodutor = document.getElementById("reprodutor").value;
    var raca = document.getElementById("raca").value;
    var inseminador = document.getElementById("inseminador").value;
    var numDoses = document.getElementById("numDoses").value;
    
    var dataCio = document.getElementById("dataCio").value;
    var horaCio = document.getElementById("horaCio").value;
    
    var cio = document.getElementById("cio").value;
    var muco = document.getElementById("muco").value;
    var te = document.getElementById("te").value;
    var ecc = document.getElementById("ecc").value;
    var proIATF = document.getElementById("proIATF").value;

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
    } else if (inseminacao === "") {
        alert("Campo obrigatório.");
        document.getElementById("inseminacao").focus;
        return false;
    } else if (cobricao === "") {
        alert("Campo obrigatório.");
        document.getElementById("cobricao").focus;
        return false;
    } else if (somSetor === "") {
        alert("Campo obrigatório.");
        document.getElementById("somSetor").focus;
        return false;
    } else if (todos === "") {
        alert("Campo obrigatório.");
        document.getElementById("todos").focus;
        return false;
    } else if (somSetor === "") {
        alert("Campo obrigatório.");
        document.getElementById("somSetor").focus;
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
    } else if (dataInseminacao === "") {
        alert("Campo obrigatório.");
        document.getElementById("dataInseminacao").focus;
        return false;
    } else if (horaInseminacao === "") {
        alert("Campo obrigatório.");
        document.getElementById("horaInseminacao").focus;
        return false;
    } else if (reprodutor === "") {
        alert("Campo obrigatório.");
        document.getElementById("reprodutor").focus;
        return false;
    } else if (raca === "") {
        alert("Campo obrigatório.");
        document.getElementById("raca").focus;
        return false;
    } else if (inseminador === "") {
        alert("Campo obrigatório.");
        document.getElementById("inseminador").focus;
        return false;
    } else if (numDoses === "") {
        alert("Campo obrigatório.");
        document.getElementById("numDoses").focus;
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
    } else if (ecc === "") {
        alert("Campo obrigatório.");
        document.getElementById("ecc").focus;
        return false;
    } else if (proIATF === "") {
        alert("Campo obrigatório.");
        document.getElementById("proIATF").focus;
        return false;
    } else if (document.getElementById("acao").value == "gravarInfoInseminacao") {
        caminhourl = "/GeralViewController/Servlet?acao=gravarInfoInseminacao";
        form.action = caminhourl;
        form.submit();
    }
}


