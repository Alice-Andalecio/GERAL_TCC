window.onload = function () {
    document.querySelector('#aplicar').addEventListener('click', function (e) {
        CriarTabela(e.target.id)
    });
};

var numDias = 0;
var theadInserirLinha = document.querySelector('#theadInserirLinha');
var tbodyInserirLinhas = document.querySelector('#tbodyInserirLinhas');

function geraDadosLeite() {
    var form = document.getElementById("formVendaLeite");
    var mesVenda = document.getElementById("mesVenda").value;
    var anoVenda = document.getElementById("anoVenda").value;
    if (mesVenda === null || mesVenda < 1 || mesVenda > 12) {
        alert("Mês Inválido!");
        document.getElementById("mesVenda").focus();
        return false;
    }
    if (anoVenda === null || anoVenda < 1) {
        alert("Ano Inválido!");
        document.getElementById("mesVenda").focus();
        return false;
    }


}

function CriarTabela() {
    theadInserirLinha.removeChild(theadInserirLinha.lastChild);

    for (var i = 1; i <= numDias; i++) {
        tbodyInserirLinhas.removeChild(tbodyInserirLinhas.lastChild);
    }
    
    document.querySelector('#divTabela').classList.remove('esconder');

    var mes = document.querySelector('#mesVenda').value;
    var ano = document.querySelector('#anoVenda').value;

    var trHead = document.createElement('tr'),
            thHead1 = document.createElement('th'),
            thHead2 = document.createElement('th'),
            thHead3 = document.createElement('th'),
            thHead4 = document.createElement('th'),
            thHead5 = document.createElement('th'),
            thHead6 = document.createElement('th'),
            thHead7 = document.createElement('th'),
            thHead8 = document.createElement('th'),
            thHead9 = document.createElement('th'),
            thHead10 = document.createElement('th');

    thHead1.innerHTML = 'Dia';
    thHead2.innerHTML = 'Func';
    thHead3.innerHTML = 'Sede';
    thHead4.innerHTML = 'Bezerras';
    thHead5.innerHTML = 'Indústria';
    thHead6.innerHTML = 'UFC';
    thHead7.innerHTML = 'CCS';
    thHead8.innerHTML = 'Vc c/ mastite';
    thHead9.innerHTML = 'Nº Vacas';
    thHead10.innerHTML = 'Total';

    trHead.appendChild(thHead1);
    trHead.appendChild(thHead2);
    trHead.appendChild(thHead3);
    trHead.appendChild(thHead4);
    trHead.appendChild(thHead5);
    trHead.appendChild(thHead6);
    trHead.appendChild(thHead7);
    trHead.appendChild(thHead8);
    trHead.appendChild(thHead9);
    trHead.appendChild(thHead10);

    theadInserirLinha.appendChild(trHead);

    switch (mes) {
        case '1':
            numDias = 31;
            break;
        case '2':
            if ((ano % 4 === 0) && (ano % 100 !== 0)) {
                numDias = 29;
            } else {
                numDias = 28;
            }
            break;
        case '3':
            numDias = 31;
            break;
        case '4':
            numDias = 30;
            break;
        case '5':
            numDias = 31;
            break;
        case '6':
            numDias = 30;
            break;
        case '7':
            numDias = 31;
            break;
        case '8':
            numDias = 31;
            break;
        case '9':
            numDias = 30;
            break;
        case '10':
            numDias = 31;
            break;
        case '11':
            numDias = 30;
            break;
        case '12':
            numDias = 31;
            break;
    }

    for (var i = 1; i <= numDias; i++) {
        var tr = document.createElement('tr'),
                td1 = document.createElement('td'),
                td2 = document.createElement('td'),
                td3 = document.createElement('td'),
                td4 = document.createElement('td'),
                td5 = document.createElement('td'),
                td6 = document.createElement('td'),
                td7 = document.createElement('td'),
                td8 = document.createElement('td'),
                td9 = document.createElement('td'),
                td10 = document.createElement('td'),
                input1 = document.createElement('input'),
                input2 = document.createElement('input'),
                input3 = document.createElement('input'),
                input4 = document.createElement('input'),
                input5 = document.createElement('input'),
                input6 = document.createElement('input'),
                input7 = document.createElement('input'),
                input8 = document.createElement('input'),
                input9 = document.createElement('input'),
                input10 = document.createElement('input');

        input1.setAttribute('type', 'text');
        input1.setAttribute('id', 'data' + i);
        input1.setAttribute('value', "\t\t" + i);
        input1.setAttribute('style', 'color: black');

        input2.setAttribute('type', 'text');
        input2.setAttribute('id', 'func' + i);

        input3.setAttribute('type', 'text');
        input3.setAttribute('id', 'sede' + i);

        input4.setAttribute('type', 'text');
        input4.setAttribute('id', 'bezerras' + i);

        input5.setAttribute('type', 'text');
        input5.setAttribute('id', 'industria' + i);

        input6.setAttribute('type', 'text');
        input6.setAttribute('id', 'ufc' + i);

        input7.setAttribute('type', 'text');
        input7.setAttribute('id', 'ccs' + i);

        input8.setAttribute('type', 'text');
        input8.setAttribute('id', 'vcMastite' + i);

        input9.setAttribute('type', 'text');
        input9.setAttribute('id', 'numVacas' + i);

        input10.setAttribute('type', 'text');
        input10.setAttribute('id', 'total' + i);



        td1.appendChild(input1);
        td2.appendChild(input2);
        td3.appendChild(input3);
        td4.appendChild(input4);
        td5.appendChild(input5);
        td6.appendChild(input6);
        td7.appendChild(input7);
        td8.appendChild(input8);
        td9.appendChild(input9);
        td10.appendChild(input10);

        tr.appendChild(td1);
        tr.appendChild(td2);
        tr.appendChild(td3);
        tr.appendChild(td4);
        tr.appendChild(td5);
        tr.appendChild(td6);
        tr.appendChild(td7);
        tr.appendChild(td8);
        tr.appendChild(td9);
        tr.appendChild(td10);

        tbodyInserirLinhas.appendChild(tr);
    }
}