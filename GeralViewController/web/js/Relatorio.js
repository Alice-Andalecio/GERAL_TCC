window.onload = function () {
    document.querySelector('#RelTodos').addEventListener('click', function (e) {
        AcionarTodosCheck(e.target.id);
    });
};
function gerarRelatorio(){
     var codigo = "";
     var frm = document.getElementById("formRelatorio");
        if(document.querySelector('#RelContrLeiteiro').checked){
           codigo+=1;
        }
        if(document.querySelector('#RelResumoAnimal').checked){
           codigo+=2;
        }
        if(document.querySelector('#RelVendaLeite').checked){
           codigo+=3;
        }
        if(document.querySelector('#RelMedicamento').checked){
           codigo+=4;
        }
        if(document.querySelector('#RelDieta').checked){
           codigo+=5;
        }
        
        caminhourl = "Servlet?acao=GerarRelatorio&cod="+codigo;
        frm.action = caminhourl;
        frm.submit();
        return true;
}
function AcionarTodosCheck() {
    var todos = document.querySelector('#RelTodos');

    if (todos.checked === true) {
        document.querySelector('#RelContrLeiteiro').checked = true;
        document.querySelector('#RelMedicamento').checked = true;
        document.querySelector('#RelResumoAnimal').checked = true;
        document.querySelector('#RelDieta').checked = true;
        document.querySelector('#RelVendaLeite').checked = true;
    } else {
        document.querySelector('#RelContrLeiteiro').checked = false;
        document.querySelector('#RelMedicamento').checked = false;
        document.querySelector('#RelResumoAnimal').checked = false;
        document.querySelector('#RelDieta').checked = false;
        document.querySelector('#RelVendaLeite').checked = false;
    }
}
