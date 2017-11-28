window.onload = function () {

        CriaId();

};

function CriaId() {
    var x = document.querySelectorAll('#tdSelect');
        var numAnimal = document.querySelectorAll('#tdNumAnimal');
    for (var i = 0; i < x.length; i++) {
        var input = document.createElement('input');
        var label = document.createElement('label');
        input.setAttribute('type', 'radio');
        input.setAttribute('name', 'select' + numAnimal[i].innerHTML);
        input.setAttribute('id', 'select' + numAnimal[i].innerHTML);
        input.classList.add('with-gap');
        label.setAttribute('for', 'select' + numAnimal[i].innerHTML);
        
        x[i].appendChild(input);
        x[i].appendChild(label);
    }
}

function MostrarFichaAnimal() {
    document.querySelector('#pesq_tabela').classList.add('esconder');
    document.querySelector('#divFormFichaAnimal').classList.add('mostrar');
}
