window.onload = function () {
    document.querySelector('#RelTodos').addEventListener('click', function (e) {
        AcionarTodosCheck(e.target.id);
    });
};

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