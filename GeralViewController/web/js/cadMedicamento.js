window.onload = function(){
    document.querySelector('#adicionarMed').addEventListener('click', function(e){ AdicionarMedicamento(e.target.id) });
    document.querySelector('#removerMed').addEventListener('click', function(e){ ExcluirMedicamento(e.target.id) });
}

//Função criada para adicionar medicamentos dinamicamente.

numMed = 0;

function AdicionarMedicamento(){
	numMed++;

	var divPrincipal = document.createElement('div'),
		br1 = document.createElement('br'),
		br2 = document.createElement('br'),
		br3 = document.createElement('br'),
		div1 = document.createElement('div'),
		div2 = document.createElement('div'),
		div3 = document.createElement('div'),
		div4 = document.createElement('div'),
		div5 = document.createElement('div'),
		div6 = document.createElement('div'),
		div7 = document.createElement('div'),
		div8 = document.createElement('div'),
		div9 = document.createElement('div'),
		input = document.createElement('input'),
		label = document.createElement('label'),
		b1 = document.createElement('b'),
		b2 = document.createElement('b'),
		i = document.createElement('i'),
		textarea = document.createElement('textarea');

	div1.classList.add('row');

	div2.classList.add('col');
	div2.classList.add('s1');

	div3.classList.add('input-field');
	div3.classList.add('col');
	div3.classList.add('s10');

	div4.classList.add('row');

	div5.classList.add('col');
	div5.classList.add('s1');

	div6.classList.add('col');
	div6.classList.add('s10');

	div7.classList.add('row');

	div8.classList.add('col');
	div8.classList.add('s1');

	div9.classList.add('col');
	div9.classList.add('s10');

	i.classList.add('material-icons');

	divPrincipal.setAttribute('id', 'divPrincipal' + numMed);

	div6.setAttribute('style', 'color: green');

	input.setAttribute('type', 'text');
	input.setAttribute('id', 'nomMed' + numMed); //nomMed1

	label.setAttribute('for', 'nomMed' +numMed);

	textarea.setAttribute('id', 'prescricaoMed' + numMed); //prescricaoMed1
	textarea.setAttribute('placeholder', 'Insira a prescrição e observações necessárias');

	b1.innerHTML = "Insira o nome do medicamento";
	i.innerHTML = "edit";
	b2.innerHTML = "Prescrição:";

	divPrincipal.appendChild(br1);
	divPrincipal.appendChild(br2);
	divPrincipal.appendChild(br3);

	div3.appendChild(input);
	label.appendChild(b1);
	div3.appendChild(label);
	div1.appendChild(div2);
	div1.appendChild(div3);
	divPrincipal.appendChild(div1);

	div6.appendChild(i);
	div6.appendChild(b2);
	div4.appendChild(div5);
	div4.appendChild(div6);
	divPrincipal.appendChild(div4);

	div9.appendChild(textarea);
	div7.appendChild(div8);
	div7.appendChild(div9);
	divPrincipal.appendChild(div7);

	document.querySelector('#novoMedicamento').appendChild(divPrincipal);
	document.querySelector('#novoMedicamento').classList.remove('esconder');
}

//Funcção criada para excluir o último medicamento cadastrado.

function ExcluirMedicamento(){
	var div = document.querySelector('#novoMedicamento');
	div.removeChild(div.lastChild);
	numMed--;
}