window.onload = function () {

        CriaId();

};

function CriaId() {
    var numAnimal = document.querySelector('#tdNumAnimal').innerHTML;
    
    var input = document.createElement('input');
    var label = document.createElement('label');

    input.setAttribute('type', 'radio');
    input.setAttribute('name', 'select' + numAnimal);
    input.setAttribute('id', 'select' + numAnimal);
    input.classList.add('with-gap');
    
    label.setAttribute('for', 'select' + numAnimal);
    
    document.querySelector('#tdSelect').appendChild(input);
    document.querySelector('#tdSelect').appendChild(label);
}

function MostrarFichaAnimal() {
    document.querySelector('#pesq_tabela').classList.add('esconder');
    document.querySelector('#divFormFichaAnimal').classList.add('mostrar');
}


