var numLote = 0;

window.onload = function(){	
	document.querySelector('#adicionarLote').addEventListener('click', function(e){ AdicionarLote(e.target.id) });
	document.querySelector('#removerLote').addEventListener('click', function(e){ RemoverLote(e.target.id) });
}

//Função para adicionar a dieta dos lotes.

function AdicionarLote(){
	numLote++;

	// Variável criada para adicionar cada lote separadamente.
	var divPrincipal = document.createElement('div');
	
	divPrincipal.setAttribute('id', 'divPrincipal' + numLote);
	
	/* TÍTULO CHECK *********************************************************************************************************/
	
	var div1TituloCheck = document.createElement('div'),
		div2TituloCheck = document.createElement('div'),
		hrTituloCheck = document.createElement('hr'),
		br1TituloCheck = document.createElement('br'),
		iTituloCheck = document.createElement('i'),
    	bTituloCheck = document.createElement('b'),
    	br2TituloCheck = document.createElement('br'),
    	br3TituloCheck = document.createElement('br');

	div1TituloCheck.classList.add('row');
	
	div2TituloCheck.classList.add('col');
	div2TituloCheck.classList.add('s12');

	iTituloCheck.classList.add('material-icons');

	div1TituloCheck.setAttribute('style', 'color: green');

	iTituloCheck.innerHTML = "edit";
	bTituloCheck.innerHTML = "Selecione os alimentos que farão parte da composição da dieta do lote " + numLote + ":";

	div2TituloCheck.appendChild(iTituloCheck);
	div2TituloCheck.appendChild(bTituloCheck);
	div2TituloCheck.appendChild(br2TituloCheck);
	div2TituloCheck.appendChild(br3TituloCheck);
	div1TituloCheck.appendChild(hrTituloCheck);
	div1TituloCheck.appendChild(br1TituloCheck);
	div1TituloCheck.appendChild(div2TituloCheck);
	
	divPrincipal.appendChild(div1TituloCheck);

	/* CHECKBOXES ***********************************************************************************************************/

	var div1Checkbox = document.createElement('div'), //row
		div2Checkbox = document.createElement('div'),
		div3Checkbox = document.createElement('div'),
		div4Checkbox = document.createElement('div'),
		div5Checkbox = document.createElement('div'), //row
		div6Checkbox = document.createElement('div'),
		div7Checkbox = document.createElement('div'),
		div8Checkbox = document.createElement('div'),
		div9Checkbox = document.createElement('div'), //row
		div10Checkbox = document.createElement('div'),
		div11Checkbox = document.createElement('div'),
		div12Checkbox = document.createElement('div'),
		input1Checkbox = document.createElement('input'),
		input2Checkbox = document.createElement('input'),
		input3Checkbox = document.createElement('input'),
		input4Checkbox = document.createElement('input'),
		input5Checkbox = document.createElement('input'),
		input6Checkbox = document.createElement('input'),
		input7Checkbox = document.createElement('input'),
		input8Checkbox = document.createElement('input'),
		input9Checkbox = document.createElement('input'),
		b1Checkbox = document.createElement('b'),
		b2Checkbox = document.createElement('b'),
		b3Checkbox = document.createElement('b'),
		b4Checkbox = document.createElement('b'),
		b5Checkbox = document.createElement('b'),
		b6Checkbox = document.createElement('b'),
		b7Checkbox = document.createElement('b'),
		b8Checkbox = document.createElement('b'),
		b9Checkbox = document.createElement('b'),
		label1Checkbox = document.createElement('label'),
		label2Checkbox = document.createElement('label'),
		label3Checkbox = document.createElement('label'),
		label4Checkbox = document.createElement('label'),
		label5Checkbox = document.createElement('label'),
		label6Checkbox = document.createElement('label'),
		label7Checkbox = document.createElement('label'),
		label8Checkbox = document.createElement('label'),
		label9Checkbox = document.createElement('label');

	div1Checkbox.classList.add('row');

	div2Checkbox.classList.add('col'); 
	div2Checkbox.classList.add('s4');

	div3Checkbox.classList.add('col'); 
	div3Checkbox.classList.add('s4');

	div4Checkbox.classList.add('col'); 
	div4Checkbox.classList.add('s4');

	div5Checkbox.classList.add('row');

	div6Checkbox.classList.add('col'); 
	div6Checkbox.classList.add('s4');

	div7Checkbox.classList.add('col'); 
	div7Checkbox.classList.add('s4');

	div8Checkbox.classList.add('col'); 
	div8Checkbox.classList.add('s4');

	div9Checkbox.classList.add('row');

	div10Checkbox.classList.add('col'); 
	div10Checkbox.classList.add('s4');

	div11Checkbox.classList.add('col'); 
	div11Checkbox.classList.add('s4');

	div12Checkbox.classList.add('col'); 
	div12Checkbox.classList.add('s4');

	input1Checkbox.setAttribute('type', 'checkbox');
	input1Checkbox.setAttribute('id', 'checkSilagem' + numLote);
	label1Checkbox.setAttribute('for', 'checkSilagem' + numLote);

	input2Checkbox.setAttribute('type', 'checkbox');
	input2Checkbox.setAttribute('id', 'checkRacao' + numLote);
	label2Checkbox.setAttribute('for', 'checkRacao' + numLote);

	input3Checkbox.setAttribute('type', 'checkbox');
	input3Checkbox.setAttribute('id', 'checkAlgodao' + numLote);
	label3Checkbox.setAttribute('for', 'checkAlgodao' + numLote);

	input4Checkbox.setAttribute('type', 'checkbox');
	input4Checkbox.setAttribute('id', 'checkSoja' + numLote);
	label4Checkbox.setAttribute('for', 'checkSoja' + numLote);

	input5Checkbox.setAttribute('type', 'checkbox');
	input5Checkbox.setAttribute('id', 'checkPoupa' + numLote);
	label5Checkbox.setAttribute('for', 'checkPoupa' + numLote);

	input6Checkbox.setAttribute('type', 'checkbox');
	input6Checkbox.setAttribute('id', 'checkFuba' + numLote);
	label6Checkbox.setAttribute('for', 'checkFuba' + numLote);

	input7Checkbox.setAttribute('type', 'checkbox');
	input7Checkbox.setAttribute('id', 'checkBicarbonato' + numLote);
	label7Checkbox.setAttribute('for', 'checkBicarbonato' + numLote);

	input8Checkbox.setAttribute('type', 'checkbox');
	input8Checkbox.setAttribute('id', 'checkNucleo' + numLote);
	label8Checkbox.setAttribute('for', 'checkNucleo' + numLote);

	input9Checkbox.setAttribute('type', 'checkbox');
	input9Checkbox.setAttribute('id', 'checkOutra' + numLote);
	label9Checkbox.setAttribute('for', 'checkOutra' + numLote);

	b1Checkbox.innerHTML = 'Silagem';
	b2Checkbox.innerHTML = 'Ração';
	b3Checkbox.innerHTML = 'Algodão';
	b4Checkbox.innerHTML = 'Soja';
	b5Checkbox.innerHTML = 'Poupa Cítrica';
	b6Checkbox.innerHTML = 'Fubá';
	b7Checkbox.innerHTML = 'Bicarbonato';
	b8Checkbox.innerHTML = 'Núcleo Vitaminado';
	b9Checkbox.innerHTML = 'Outra';

	label1Checkbox.appendChild(b1Checkbox);
	div2Checkbox.appendChild(input1Checkbox);
	div2Checkbox.appendChild(label1Checkbox);

	label2Checkbox.appendChild(b2Checkbox);
	div3Checkbox.appendChild(input2Checkbox);
	div3Checkbox.appendChild(label2Checkbox);

	label3Checkbox.appendChild(b3Checkbox);
	div4Checkbox.appendChild(input3Checkbox);
	div4Checkbox.appendChild(label3Checkbox);

	label4Checkbox.appendChild(b4Checkbox);
	div6Checkbox.appendChild(input4Checkbox);
	div6Checkbox.appendChild(label4Checkbox);

	label5Checkbox.appendChild(b5Checkbox);
	div7Checkbox.appendChild(input5Checkbox);
	div7Checkbox.appendChild(label5Checkbox);

	label6Checkbox.appendChild(b6Checkbox);
	div8Checkbox.appendChild(input6Checkbox);
	div8Checkbox.appendChild(label6Checkbox);

	label7Checkbox.appendChild(b7Checkbox);
	div10Checkbox.appendChild(input7Checkbox);
	div10Checkbox.appendChild(label7Checkbox);

	label8Checkbox.appendChild(b8Checkbox);
	div11Checkbox.appendChild(input8Checkbox);
	div11Checkbox.appendChild(label8Checkbox);

	label9Checkbox.appendChild(b9Checkbox);
	div12Checkbox.appendChild(input9Checkbox);
	div12Checkbox.appendChild(label9Checkbox);

	div1Checkbox.appendChild(div2Checkbox);
	div1Checkbox.appendChild(div3Checkbox);
	div1Checkbox.appendChild(div4Checkbox);

	div5Checkbox.appendChild(div6Checkbox);
	div5Checkbox.appendChild(div7Checkbox);
	div5Checkbox.appendChild(div8Checkbox);

	div9Checkbox.appendChild(div10Checkbox);
	div9Checkbox.appendChild(div11Checkbox);
	div9Checkbox.appendChild(div12Checkbox);

	divPrincipal.appendChild(div1Checkbox);
	divPrincipal.appendChild(div5Checkbox);
	divPrincipal.appendChild(div9Checkbox);

	/* TÍTULO ***************************************************************************************************************/

	var div1Titulo = document.createElement('div'),
		div2Titulo = document.createElement('div'),
		br1Titulo = document.createElement('br'),
    	bTitulo = document.createElement('b'),
    	uTitulo = document.createElement('u'),
    	br2Titulo = document.createElement('br'),
    	br3Titulo = document.createElement('br');

	div1Titulo.classList.add('row');
	
	div2Titulo.classList.add('col');
	div2Titulo.classList.add('s12');

	uTitulo.innerHTML = "Número do Lote: " + numLote;

	bTitulo.appendChild(uTitulo);
	div2Titulo.appendChild(bTitulo);
	div2Titulo.appendChild(br2Titulo);
	div2Titulo.appendChild(br3Titulo);
	div1Titulo.appendChild(br1Titulo);
	div1Titulo.appendChild(div2Titulo);
	
	divPrincipal.appendChild(div1Titulo);

	/* SILAGEM **************************************************************************************************************/

	var div1Silagem = document.createElement('div'),
		div2Silagem = document.createElement('div'),
		div3Silagem = document.createElement('div'),
		div4Silagem = document.createElement('div'),
		div5Silagem = document.createElement('div'),
		div6Silagem = document.createElement('div'),
		div7Silagem = document.createElement('div'),
		div8Silagem = document.createElement('div'),
		div9Silagem = document.createElement('div'),
		label1Silagem = document.createElement('label'),
		label2Silagem = document.createElement('label'),
		label3Silagem = document.createElement('label'),
		label4Silagem = document.createElement('label'),
		label5Silagem = document.createElement('label'),
		b1Silagem = document.createElement('b'),
		b2Silagem = document.createElement('b'),
		b3Silagem = document.createElement('b'),
		b4Silagem = document.createElement('b'),
		b5Silagem = document.createElement('b'),
		input1Silagem = document.createElement('input'),
		input2Silagem = document.createElement('input'),
		input3Silagem = document.createElement('input');

	div1Silagem.classList.add('row');
	div1Silagem.classList.add('esconder');
	
	div2Silagem.classList.add('input-field');
	div2Silagem.classList.add('col');
	div2Silagem.classList.add('s2');

	div3Silagem.classList.add('col');
	div3Silagem.classList.add('s1');

	div4Silagem.classList.add('input-field');
	div4Silagem.classList.add('col');
	div4Silagem.classList.add('s2');

	div5Silagem.classList.add('col');
	div5Silagem.classList.add('s1');

	div6Silagem.classList.add('input-field');
	div6Silagem.classList.add('col');
	div6Silagem.classList.add('s2');

	div7Silagem.classList.add('col');
	div7Silagem.classList.add('s1');

	div8Silagem.classList.add('input-field');
	div8Silagem.classList.add('col');
	div8Silagem.classList.add('s2');

	div9Silagem.classList.add('input-field');
	div9Silagem.classList.add('col');
	div9Silagem.classList.add('s1');

	div1Silagem.setAttribute('id', 'divSilagem' + numLote);

	input1Silagem.setAttribute('type', 'text');
	input1Silagem.setAttribute('name', 'silagemManha' + numLote); //silagemManha1
	input1Silagem.setAttribute('id', 'silagemManha' + numLote);
	label2Silagem.setAttribute('for', 'silagemManha' + numLote);

	input2Silagem.setAttribute('type', 'text');
	input2Silagem.setAttribute('name', 'silagemTarde' + numLote); //silagemTarde1
	input2Silagem.setAttribute('id', 'silagemTarde' + numLote);
	label3Silagem.setAttribute('for', 'silagemTarde' + numLote);

	input3Silagem.setAttribute('type', 'text');
	input3Silagem.setAttribute('name', 'silagemTotal' + numLote); //silagemTotal1
	input3Silagem.setAttribute('id', 'silagemTotal' + numLote);
	label4Silagem.setAttribute('for', 'silagemTotal' + numLote);

	b1Silagem.innerHTML = "Silagem:";
	b2Silagem.innerHTML = "Manhã:";
	b3Silagem.innerHTML = "Tarde:";
	b4Silagem.innerHTML = "Total:";
	b5Silagem.innerHTML = "(Kg)";

	label1Silagem.appendChild(b1Silagem);
	div2Silagem.appendChild(label1Silagem);

	label2Silagem.appendChild(b2Silagem);
	div4Silagem.appendChild(input1Silagem);
	div4Silagem.appendChild(label2Silagem);

	label3Silagem.appendChild(b3Silagem);
	div6Silagem.appendChild(input2Silagem);
	div6Silagem.appendChild(label3Silagem);

	label4Silagem.appendChild(b4Silagem);
	div8Silagem.appendChild(input3Silagem);
	div8Silagem.appendChild(label4Silagem);

	label5Silagem.appendChild(b5Silagem);
	div9Silagem.appendChild(label5Silagem);

	div1Silagem.appendChild(div2Silagem);
	div1Silagem.appendChild(div3Silagem);
	div1Silagem.appendChild(div4Silagem);
	div1Silagem.appendChild(div5Silagem);
	div1Silagem.appendChild(div6Silagem);
	div1Silagem.appendChild(div7Silagem);
	div1Silagem.appendChild(div8Silagem);
	div1Silagem.appendChild(div9Silagem);

	divPrincipal.appendChild(div1Silagem);

	/* RAÇÃO ****************************************************************************************************************/

	var div1Racao = document.createElement('div'),
		div2Racao = document.createElement('div'),
		div3Racao = document.createElement('div'),
		div4Racao = document.createElement('div'),
		div5Racao = document.createElement('div'),
		div6Racao = document.createElement('div'),
		div7Racao = document.createElement('div'),
		div8Racao = document.createElement('div'),
		div9Racao = document.createElement('div'),
		label1Racao = document.createElement('label'),
		label2Racao = document.createElement('label'),
		label3Racao = document.createElement('label'),
		label4Racao = document.createElement('label'),
		label5Racao = document.createElement('label'),
		b1Racao = document.createElement('b'),
		b2Racao = document.createElement('b'),
		b3Racao = document.createElement('b'),
		b4Racao = document.createElement('b'),
		b5Racao = document.createElement('b'),
		input1Racao = document.createElement('input'),
		input2Racao = document.createElement('input'),
		input3Racao = document.createElement('input');

	div1Racao.classList.add('row');
	div1Racao.classList.add('esconder');
	
	div2Racao.classList.add('input-field');
	div2Racao.classList.add('col');
	div2Racao.classList.add('s2');

	div3Racao.classList.add('col');
	div3Racao.classList.add('s1');

	div4Racao.classList.add('input-field');
	div4Racao.classList.add('col');
	div4Racao.classList.add('s2');

	div5Racao.classList.add('col');
	div5Racao.classList.add('s1');

	div6Racao.classList.add('input-field');
	div6Racao.classList.add('col');
	div6Racao.classList.add('s2');

	div7Racao.classList.add('col');
	div7Racao.classList.add('s1');

	div8Racao.classList.add('input-field');
	div8Racao.classList.add('col');
	div8Racao.classList.add('s2');

	div9Racao.classList.add('input-field');
	div9Racao.classList.add('col');
	div9Racao.classList.add('s1');

	div1Racao.setAttribute('id', 'divRacao' + numLote);

	input1Racao.setAttribute('type', 'text');
	input1Racao.setAttribute('name', 'racaoManha' + numLote); //racaoManha1
	input1Racao.setAttribute('id', 'racaoManha' + numLote);
	label2Racao.setAttribute('for', 'racaoManha' + numLote);

	input2Racao.setAttribute('type', 'text');
	input2Racao.setAttribute('name', 'racaoTarde' + numLote); //racaoTarde1
	input2Racao.setAttribute('id', 'racaoTarde' + numLote);
	label3Racao.setAttribute('for', 'racaoTarde' + numLote);

	input3Racao.setAttribute('type', 'text');
	input3Racao.setAttribute('name', 'racaoTotal' + numLote); //racaoTotal1
	input3Racao.setAttribute('id', 'racaoTotal' + numLote);
	label4Racao.setAttribute('for', 'racaoTotal' + numLote);

	b1Racao.innerHTML = "Ração:";
	b2Racao.innerHTML = "Manhã:";
	b3Racao.innerHTML = "Tarde:";
	b4Racao.innerHTML = "Total:";
	b5Racao.innerHTML = "(Kg)";

	label1Racao.appendChild(b1Racao);
	div2Racao.appendChild(label1Racao);

	label2Racao.appendChild(b2Racao);
	div4Racao.appendChild(input1Racao);
	div4Racao.appendChild(label2Racao);

	label3Racao.appendChild(b3Racao);
	div6Racao.appendChild(input2Racao);
	div6Racao.appendChild(label3Racao);

	label4Racao.appendChild(b4Racao);
	div8Racao.appendChild(input3Racao);
	div8Racao.appendChild(label4Racao);

	label5Racao.appendChild(b5Racao);
	div9Racao.appendChild(label5Racao);

	div1Racao.appendChild(div2Racao);
	div1Racao.appendChild(div3Racao);
	div1Racao.appendChild(div4Racao);
	div1Racao.appendChild(div5Racao);
	div1Racao.appendChild(div6Racao);
	div1Racao.appendChild(div7Racao);
	div1Racao.appendChild(div8Racao);
	div1Racao.appendChild(div9Racao);

	divPrincipal.appendChild(div1Racao);

    /* ALGODÃO **************************************************************************************************************/

    var div1Algodao = document.createElement('div'),
		div2Algodao = document.createElement('div'),
		div3Algodao = document.createElement('div'),
		div4Algodao = document.createElement('div'),
		div5Algodao = document.createElement('div'),
		div6Algodao = document.createElement('div'),
		div7Algodao = document.createElement('div'),
		div8Algodao = document.createElement('div'),
		div9Algodao = document.createElement('div'),
		label1Algodao = document.createElement('label'),
		label2Algodao = document.createElement('label'),
		label3Algodao = document.createElement('label'),
		label4Algodao = document.createElement('label'),
		label5Algodao = document.createElement('label'),
		b1Algodao = document.createElement('b'),
		b2Algodao = document.createElement('b'),
		b3Algodao = document.createElement('b'),
		b4Algodao = document.createElement('b'),
		b5Algodao = document.createElement('b'),
		input1Algodao = document.createElement('input'),
		input2Algodao = document.createElement('input'),
		input3Algodao = document.createElement('input');

	div1Algodao.classList.add('row');
	div1Algodao.classList.add('esconder');
	
	div2Algodao.classList.add('input-field');
	div2Algodao.classList.add('col');
	div2Algodao.classList.add('s2');

	div3Algodao.classList.add('col');
	div3Algodao.classList.add('s1');

	div4Algodao.classList.add('input-field');
	div4Algodao.classList.add('col');
	div4Algodao.classList.add('s2');

	div5Algodao.classList.add('col');
	div5Algodao.classList.add('s1');

	div6Algodao.classList.add('input-field');
	div6Algodao.classList.add('col');
	div6Algodao.classList.add('s2');

	div7Algodao.classList.add('col');
	div7Algodao.classList.add('s1');

	div8Algodao.classList.add('input-field');
	div8Algodao.classList.add('col');
	div8Algodao.classList.add('s2');

	div9Algodao.classList.add('input-field');
	div9Algodao.classList.add('col');
	div9Algodao.classList.add('s1');

	div1Algodao.setAttribute('id', 'divAlgodao' + numLote);

	input1Algodao.setAttribute('type', 'text');
	input1Algodao.setAttribute('name', 'algodaoManha' + numLote); //algodaoManha1
	input1Algodao.setAttribute('id', 'algodaoManha' + numLote);
	label2Algodao.setAttribute('for', 'algodaoManha' + numLote);

	input2Algodao.setAttribute('type', 'text');
	input2Algodao.setAttribute('name', 'algodaoTarde' + numLote); //algodaoTarde1
	input2Algodao.setAttribute('id', 'algodaoTarde' + numLote);
	label3Algodao.setAttribute('for', 'algodaoTarde' + numLote);

	input3Algodao.setAttribute('type', 'text');
	input3Algodao.setAttribute('name', 'algodaoTotal' + numLote); //algodaoTotal1
	input3Algodao.setAttribute('id', 'algodaoTotal' + numLote);
	label4Algodao.setAttribute('for', 'algodaoTotal' + numLote);

	b1Algodao.innerHTML = "Algodão:";
	b2Algodao.innerHTML = "Manhã:";
	b3Algodao.innerHTML = "Tarde:";
	b4Algodao.innerHTML = "Total:";
	b5Algodao.innerHTML = "(Kg)";

	label1Algodao.appendChild(b1Algodao);
	div2Algodao.appendChild(label1Algodao);

	label2Algodao.appendChild(b2Algodao);
	div4Algodao.appendChild(input1Algodao);
	div4Algodao.appendChild(label2Algodao);

	label3Algodao.appendChild(b3Algodao);
	div6Algodao.appendChild(input2Algodao);
	div6Algodao.appendChild(label3Algodao);

	label4Algodao.appendChild(b4Algodao);
	div8Algodao.appendChild(input3Algodao);
	div8Algodao.appendChild(label4Algodao);

	label5Algodao.appendChild(b5Algodao);
	div9Algodao.appendChild(label5Algodao);

	div1Algodao.appendChild(div2Algodao);
	div1Algodao.appendChild(div3Algodao);
	div1Algodao.appendChild(div4Algodao);
	div1Algodao.appendChild(div5Algodao);
	div1Algodao.appendChild(div6Algodao);
	div1Algodao.appendChild(div7Algodao);
	div1Algodao.appendChild(div8Algodao);
	div1Algodao.appendChild(div9Algodao);

	divPrincipal.appendChild(div1Algodao);

	/* SOJA *****************************************************************************************************************/

	var div1Soja = document.createElement('div'),
		div2Soja = document.createElement('div'),
		div3Soja = document.createElement('div'),
		div4Soja = document.createElement('div'),
		div5Soja = document.createElement('div'),
		div6Soja = document.createElement('div'),
		div7Soja = document.createElement('div'),
		div8Soja = document.createElement('div'),
		div9Soja = document.createElement('div'),
		label1Soja = document.createElement('label'),
		label2Soja = document.createElement('label'),
		label3Soja = document.createElement('label'),
		label4Soja = document.createElement('label'),
		label5Soja = document.createElement('label'),
		b1Soja = document.createElement('b'),
		b2Soja = document.createElement('b'),
		b3Soja = document.createElement('b'),
		b4Soja = document.createElement('b'),
		b5Soja = document.createElement('b'),
		input1Soja = document.createElement('input'),
		input2Soja = document.createElement('input'),
		input3Soja = document.createElement('input');

	div1Soja.classList.add('row');
	div1Soja.classList.add('esconder');
	
	div2Soja.classList.add('input-field');
	div2Soja.classList.add('col');
	div2Soja.classList.add('s2');

	div3Soja.classList.add('col');
	div3Soja.classList.add('s1');

	div4Soja.classList.add('input-field');
	div4Soja.classList.add('col');
	div4Soja.classList.add('s2');

	div5Soja.classList.add('col');
	div5Soja.classList.add('s1');

	div6Soja.classList.add('input-field');
	div6Soja.classList.add('col');
	div6Soja.classList.add('s2');

	div7Soja.classList.add('col');
	div7Soja.classList.add('s1');

	div8Soja.classList.add('input-field');
	div8Soja.classList.add('col');
	div8Soja.classList.add('s2');

	div9Soja.classList.add('input-field');
	div9Soja.classList.add('col');
	div9Soja.classList.add('s1');

	div1Soja.setAttribute('id', 'divSoja' + numLote);

	input1Soja.setAttribute('type', 'text');
	input1Soja.setAttribute('name', 'sojaManha' + numLote); //sojaManha1
	input1Soja.setAttribute('id', 'sojaManha' + numLote);
	label2Soja.setAttribute('for', 'sojaManha' + numLote);

	input2Soja.setAttribute('type', 'text');
	input2Soja.setAttribute('name', 'sojaTarde' + numLote); //sojaTarde1
	input2Soja.setAttribute('id', 'sojaTarde' + numLote);
	label3Soja.setAttribute('for', 'sojaTarde' + numLote);

	input3Soja.setAttribute('type', 'text');
	input3Soja.setAttribute('name', 'sojaTotal' + numLote); //sojaTotal1
	input3Soja.setAttribute('id', 'sojaTotal' + numLote);
	label4Soja.setAttribute('for', 'sojaTotal' + numLote);

	b1Soja.innerHTML = "Soja:";
	b2Soja.innerHTML = "Manhã:";
	b3Soja.innerHTML = "Tarde:";
	b4Soja.innerHTML = "Total:";
	b5Soja.innerHTML = "(Kg)";

	label1Soja.appendChild(b1Soja);
	div2Soja.appendChild(label1Soja);

	label2Soja.appendChild(b2Soja);
	div4Soja.appendChild(input1Soja);
	div4Soja.appendChild(label2Soja);

	label3Soja.appendChild(b3Soja);
	div6Soja.appendChild(input2Soja);
	div6Soja.appendChild(label3Soja);

	label4Soja.appendChild(b4Soja);
	div8Soja.appendChild(input3Soja);
	div8Soja.appendChild(label4Soja);

	label5Soja.appendChild(b5Soja);
	div9Soja.appendChild(label5Soja);

	div1Soja.appendChild(div2Soja);
	div1Soja.appendChild(div3Soja);
	div1Soja.appendChild(div4Soja);
	div1Soja.appendChild(div5Soja);
	div1Soja.appendChild(div6Soja);
	div1Soja.appendChild(div7Soja);
	div1Soja.appendChild(div8Soja);
	div1Soja.appendChild(div9Soja);

	divPrincipal.appendChild(div1Soja);

	/* POUPA ****************************************************************************************************************/

	var div1Poupa = document.createElement('div'),
		div2Poupa = document.createElement('div'),
		div3Poupa = document.createElement('div'),
		div4Poupa = document.createElement('div'),
		div5Poupa = document.createElement('div'),
		div6Poupa = document.createElement('div'),
		div7Poupa = document.createElement('div'),
		div8Poupa = document.createElement('div'),
		div9Poupa = document.createElement('div'),
		label1Poupa = document.createElement('label'),
		label2Poupa = document.createElement('label'),
		label3Poupa = document.createElement('label'),
		label4Poupa = document.createElement('label'),
		label5Poupa = document.createElement('label'),
		b1Poupa = document.createElement('b'),
		b2Poupa = document.createElement('b'),
		b3Poupa = document.createElement('b'),
		b4Poupa = document.createElement('b'),
		b5Poupa = document.createElement('b'),
		input1Poupa = document.createElement('input'),
		input2Poupa = document.createElement('input'),
		input3Poupa = document.createElement('input');

	div1Poupa.classList.add('row');
	div1Poupa.classList.add('esconder');
	
	div2Poupa.classList.add('input-field');
	div2Poupa.classList.add('col');
	div2Poupa.classList.add('s2');

	div3Poupa.classList.add('col');
	div3Poupa.classList.add('s1');

	div4Poupa.classList.add('input-field');
	div4Poupa.classList.add('col');
	div4Poupa.classList.add('s2');

	div5Poupa.classList.add('col');
	div5Poupa.classList.add('s1');

	div6Poupa.classList.add('input-field');
	div6Poupa.classList.add('col');
	div6Poupa.classList.add('s2');

	div7Poupa.classList.add('col');
	div7Poupa.classList.add('s1');

	div8Poupa.classList.add('input-field');
	div8Poupa.classList.add('col');
	div8Poupa.classList.add('s2');

	div9Poupa.classList.add('input-field');
	div9Poupa.classList.add('col');
	div9Poupa.classList.add('s1');

	div1Poupa.setAttribute('id', 'divPoupa' + numLote);

	input1Poupa.setAttribute('type', 'text');
	input1Poupa.setAttribute('name', 'poupaManha' + numLote); //poupaManha1
	input1Poupa.setAttribute('id', 'poupaManha' + numLote);
	label2Poupa.setAttribute('for', 'poupaManha' + numLote);

	input2Poupa.setAttribute('type', 'text');
	input2Poupa.setAttribute('name', 'poupaTarde' + numLote); //poupaTarde1
	input2Poupa.setAttribute('id', 'poupaTarde' + numLote);
	label3Poupa.setAttribute('for', 'poupaTarde' + numLote);

	input3Poupa.setAttribute('type', 'text');
	input3Poupa.setAttribute('name', 'poupaTotal' + numLote); //poupaTotal1
	input3Poupa.setAttribute('id', 'poupaTotal' + numLote);
	label4Poupa.setAttribute('for', 'poupaTotal' + numLote);

	b1Poupa.innerHTML = "Poupa:";
	b2Poupa.innerHTML = "Manhã:";
	b3Poupa.innerHTML = "Tarde:";
	b4Poupa.innerHTML = "Total:";
	b5Poupa.innerHTML = "(Kg)";

	label1Poupa.appendChild(b1Poupa);
	div2Poupa.appendChild(label1Poupa);

	label2Poupa.appendChild(b2Poupa);
	div4Poupa.appendChild(input1Poupa);
	div4Poupa.appendChild(label2Poupa);

	label3Poupa.appendChild(b3Poupa);
	div6Poupa.appendChild(input2Poupa);
	div6Poupa.appendChild(label3Poupa);

	label4Poupa.appendChild(b4Poupa);
	div8Poupa.appendChild(input3Poupa);
	div8Poupa.appendChild(label4Poupa);

	label5Poupa.appendChild(b5Poupa);
	div9Poupa.appendChild(label5Poupa);

	div1Poupa.appendChild(div2Poupa);
	div1Poupa.appendChild(div3Poupa);
	div1Poupa.appendChild(div4Poupa);
	div1Poupa.appendChild(div5Poupa);
	div1Poupa.appendChild(div6Poupa);
	div1Poupa.appendChild(div7Poupa);
	div1Poupa.appendChild(div8Poupa);
	div1Poupa.appendChild(div9Poupa);

	divPrincipal.appendChild(div1Poupa);

	/* FUBA *****************************************************************************************************************/

	var div1Fuba = document.createElement('div'),
		div2Fuba = document.createElement('div'),
		div3Fuba = document.createElement('div'),
		div4Fuba = document.createElement('div'),
		div5Fuba = document.createElement('div'),
		div6Fuba = document.createElement('div'),
		div7Fuba = document.createElement('div'),
		div8Fuba = document.createElement('div'),
		div9Fuba = document.createElement('div'),
		label1Fuba = document.createElement('label'),
		label2Fuba = document.createElement('label'),
		label3Fuba = document.createElement('label'),
		label4Fuba = document.createElement('label'),
		label5Fuba = document.createElement('label'),
		b1Fuba = document.createElement('b'),
		b2Fuba = document.createElement('b'),
		b3Fuba = document.createElement('b'),
		b4Fuba = document.createElement('b'),
		b5Fuba = document.createElement('b'),
		input1Fuba = document.createElement('input'),
		input2Fuba = document.createElement('input'),
		input3Fuba = document.createElement('input');

	div1Fuba.classList.add('row');
	div1Fuba.classList.add('esconder');
	
	div2Fuba.classList.add('input-field');
	div2Fuba.classList.add('col');
	div2Fuba.classList.add('s2');

	div3Fuba.classList.add('col');
	div3Fuba.classList.add('s1');

	div4Fuba.classList.add('input-field');
	div4Fuba.classList.add('col');
	div4Fuba.classList.add('s2');

	div5Fuba.classList.add('col');
	div5Fuba.classList.add('s1');

	div6Fuba.classList.add('input-field');
	div6Fuba.classList.add('col');
	div6Fuba.classList.add('s2');

	div7Fuba.classList.add('col');
	div7Fuba.classList.add('s1');

	div8Fuba.classList.add('input-field');
	div8Fuba.classList.add('col');
	div8Fuba.classList.add('s2');

	div9Fuba.classList.add('input-field');
	div9Fuba.classList.add('col');
	div9Fuba.classList.add('s1');

	div1Fuba.setAttribute('id', 'divFuba' + numLote);

	input1Fuba.setAttribute('type', 'text');
	input1Fuba.setAttribute('name', 'fubaManha' + numLote); //fubaManha1
	input1Fuba.setAttribute('id', 'fubaManha' + numLote);
	label2Fuba.setAttribute('for', 'fubaManha' + numLote);

	input2Fuba.setAttribute('type', 'text');
	input2Fuba.setAttribute('name', 'fubaTarde' + numLote); //fubaTarde1
	input2Fuba.setAttribute('id', 'fubaTarde' + numLote);
	label3Fuba.setAttribute('for', 'fubaTarde' + numLote);

	input3Fuba.setAttribute('type', 'text');
	input3Fuba.setAttribute('name', 'fubaTotal' + numLote); //fubaTotal1
	input3Fuba.setAttribute('id', 'fubaTotal' + numLote);
	label4Fuba.setAttribute('for', 'fubaTotal' + numLote);

	b1Fuba.innerHTML = "Fubá:";
	b2Fuba.innerHTML = "Manhã:";
	b3Fuba.innerHTML = "Tarde:";
	b4Fuba.innerHTML = "Total:";
	b5Fuba.innerHTML = "(Kg)";

	label1Fuba.appendChild(b1Fuba);
	div2Fuba.appendChild(label1Fuba);

	label2Fuba.appendChild(b2Fuba);
	div4Fuba.appendChild(input1Fuba);
	div4Fuba.appendChild(label2Fuba);

	label3Fuba.appendChild(b3Fuba);
	div6Fuba.appendChild(input2Fuba);
	div6Fuba.appendChild(label3Fuba);

	label4Fuba.appendChild(b4Fuba);
	div8Fuba.appendChild(input3Fuba);
	div8Fuba.appendChild(label4Fuba);

	label5Fuba.appendChild(b5Fuba);
	div9Fuba.appendChild(label5Fuba);

	div1Fuba.appendChild(div2Fuba);
	div1Fuba.appendChild(div3Fuba);
	div1Fuba.appendChild(div4Fuba);
	div1Fuba.appendChild(div5Fuba);
	div1Fuba.appendChild(div6Fuba);
	div1Fuba.appendChild(div7Fuba);
	div1Fuba.appendChild(div8Fuba);
	div1Fuba.appendChild(div9Fuba);

	divPrincipal.appendChild(div1Fuba);

	/* BICARBONATO **********************************************************************************************************/

	var div1Bicarbonato = document.createElement('div'),
		div2Bicarbonato = document.createElement('div'),
		div3Bicarbonato = document.createElement('div'),
		div4Bicarbonato = document.createElement('div'),
		div5Bicarbonato = document.createElement('div'),
		div6Bicarbonato = document.createElement('div'),
		div7Bicarbonato = document.createElement('div'),
		div8Bicarbonato = document.createElement('div'),
		div9Bicarbonato = document.createElement('div'),
		label1Bicarbonato = document.createElement('label'),
		label2Bicarbonato = document.createElement('label'),
		label3Bicarbonato = document.createElement('label'),
		label4Bicarbonato = document.createElement('label'),
		label5Bicarbonato = document.createElement('label'),
		b1Bicarbonato = document.createElement('b'),
		b2Bicarbonato = document.createElement('b'),
		b3Bicarbonato = document.createElement('b'),
		b4Bicarbonato = document.createElement('b'),
		b5Bicarbonato = document.createElement('b'),
		input1Bicarbonato = document.createElement('input'),
		input2Bicarbonato = document.createElement('input'),
		input3Bicarbonato = document.createElement('input');

	div1Bicarbonato.classList.add('row');
	div1Bicarbonato.classList.add('esconder');
	
	div2Bicarbonato.classList.add('input-field');
	div2Bicarbonato.classList.add('col');
	div2Bicarbonato.classList.add('s2');

	div3Bicarbonato.classList.add('col');
	div3Bicarbonato.classList.add('s1');

	div4Bicarbonato.classList.add('input-field');
	div4Bicarbonato.classList.add('col');
	div4Bicarbonato.classList.add('s2');

	div5Bicarbonato.classList.add('col');
	div5Bicarbonato.classList.add('s1');

	div6Bicarbonato.classList.add('input-field');
	div6Bicarbonato.classList.add('col');
	div6Bicarbonato.classList.add('s2');

	div7Bicarbonato.classList.add('col');
	div7Bicarbonato.classList.add('s1');

	div8Bicarbonato.classList.add('input-field');
	div8Bicarbonato.classList.add('col');
	div8Bicarbonato.classList.add('s2');

	div9Bicarbonato.classList.add('input-field');
	div9Bicarbonato.classList.add('col');
	div9Bicarbonato.classList.add('s1');

	div1Bicarbonato.setAttribute('id', 'divBicarbonato' + numLote);

	input1Bicarbonato.setAttribute('type', 'text');
	input1Bicarbonato.setAttribute('name', 'bicarbonatoManha' + numLote); //bicarbonatoManha1
	input1Bicarbonato.setAttribute('id', 'bicarbonatoManha' + numLote);
	label2Bicarbonato.setAttribute('for', 'bicarbonatoManha' + numLote);

	input2Bicarbonato.setAttribute('type', 'text');
	input2Bicarbonato.setAttribute('name', 'bicarbonatoTarde' + numLote); //bicarbonatoTarde1
	input2Bicarbonato.setAttribute('id', 'bicarbonatoTarde' + numLote);
	label3Bicarbonato.setAttribute('for', 'bicarbonatoTarde' + numLote);

	input3Bicarbonato.setAttribute('type', 'text');
	input3Bicarbonato.setAttribute('name', 'bicarbonatoTotal' + numLote); //bicarbonatoTotal1
	input3Bicarbonato.setAttribute('id', 'bicarbonatoTotal' + numLote);
	label4Bicarbonato.setAttribute('for', 'bicarbonatoTotal' + numLote);

	b1Bicarbonato.innerHTML = "Bicarbonato:";
	b2Bicarbonato.innerHTML = "Manhã:";
	b3Bicarbonato.innerHTML = "Tarde:";
	b4Bicarbonato.innerHTML = "Total:";
	b5Bicarbonato.innerHTML = "(Kg)";

	label1Bicarbonato.appendChild(b1Bicarbonato);
	div2Bicarbonato.appendChild(label1Bicarbonato);

	label2Bicarbonato.appendChild(b2Bicarbonato);
	div4Bicarbonato.appendChild(input1Bicarbonato);
	div4Bicarbonato.appendChild(label2Bicarbonato);

	label3Bicarbonato.appendChild(b3Bicarbonato);
	div6Bicarbonato.appendChild(input2Bicarbonato);
	div6Bicarbonato.appendChild(label3Bicarbonato);

	label4Bicarbonato.appendChild(b4Bicarbonato);
	div8Bicarbonato.appendChild(input3Bicarbonato);
	div8Bicarbonato.appendChild(label4Bicarbonato);

	label5Bicarbonato.appendChild(b5Bicarbonato);
	div9Bicarbonato.appendChild(label5Bicarbonato);

	div1Bicarbonato.appendChild(div2Bicarbonato);
	div1Bicarbonato.appendChild(div3Bicarbonato);
	div1Bicarbonato.appendChild(div4Bicarbonato);
	div1Bicarbonato.appendChild(div5Bicarbonato);
	div1Bicarbonato.appendChild(div6Bicarbonato);
	div1Bicarbonato.appendChild(div7Bicarbonato);
	div1Bicarbonato.appendChild(div8Bicarbonato);
	div1Bicarbonato.appendChild(div9Bicarbonato);

	divPrincipal.appendChild(div1Bicarbonato);

	/* NÚCLEO ***************************************************************************************************************/

	var div1Nucleo = document.createElement('div'),
		div2Nucleo = document.createElement('div'),
		div3Nucleo = document.createElement('div'),
		div4Nucleo = document.createElement('div'),
		div5Nucleo = document.createElement('div'),
		div6Nucleo = document.createElement('div'),
		div7Nucleo = document.createElement('div'),
		div8Nucleo = document.createElement('div'),
		div9Nucleo = document.createElement('div'),
		label1Nucleo = document.createElement('label'),
		label2Nucleo = document.createElement('label'),
		label3Nucleo = document.createElement('label'),
		label4Nucleo = document.createElement('label'),
		label5Nucleo = document.createElement('label'),
		b1Nucleo = document.createElement('b'),
		b2Nucleo = document.createElement('b'),
		b3Nucleo = document.createElement('b'),
		b4Nucleo = document.createElement('b'),
		b5Nucleo = document.createElement('b'),
		input1Nucleo = document.createElement('input'),
		input2Nucleo = document.createElement('input'),
		input3Nucleo = document.createElement('input');

	div1Nucleo.classList.add('row');
	div1Nucleo.classList.add('esconder');
	
	div2Nucleo.classList.add('input-field');
	div2Nucleo.classList.add('col');
	div2Nucleo.classList.add('s2');

	div3Nucleo.classList.add('col');
	div3Nucleo.classList.add('s1');

	div4Nucleo.classList.add('input-field');
	div4Nucleo.classList.add('col');
	div4Nucleo.classList.add('s2');

	div5Nucleo.classList.add('col');
	div5Nucleo.classList.add('s1');

	div6Nucleo.classList.add('input-field');
	div6Nucleo.classList.add('col');
	div6Nucleo.classList.add('s2');

	div7Nucleo.classList.add('col');
	div7Nucleo.classList.add('s1');

	div8Nucleo.classList.add('input-field');
	div8Nucleo.classList.add('col');
	div8Nucleo.classList.add('s2');

	div9Nucleo.classList.add('input-field');
	div9Nucleo.classList.add('col');
	div9Nucleo.classList.add('s1');

	div1Nucleo.setAttribute('id', 'divNucleo' + numLote);

	input1Nucleo.setAttribute('type', 'text');
	input1Nucleo.setAttribute('name', 'nucleoManha' + numLote); //nucleoManha1
	input1Nucleo.setAttribute('id', 'nucleoManha' + numLote);
	label2Nucleo.setAttribute('for', 'nucleoManha' + numLote);

	input2Nucleo.setAttribute('type', 'text');
	input2Nucleo.setAttribute('name', 'nucleoTarde' + numLote); //nucleoTarde1
	input2Nucleo.setAttribute('id', 'nucleoTarde' + numLote);
	label3Nucleo.setAttribute('for', 'nucleoTarde' + numLote);

	input3Nucleo.setAttribute('type', 'text');
	input3Nucleo.setAttribute('name', 'nucleoTotal' + numLote); //nucleoTotal1
	input3Nucleo.setAttribute('id', 'nucleoTotal' + numLote);
	label4Nucleo.setAttribute('for', 'nucleoTotal' + numLote);

	b1Nucleo.innerHTML = "Núcleo Vitaminado:";
	b2Nucleo.innerHTML = "Manhã:";
	b3Nucleo.innerHTML = "Tarde:";
	b4Nucleo.innerHTML = "Total:";
	b5Nucleo.innerHTML = "(Kg)";

	label1Nucleo.appendChild(b1Nucleo);
	div2Nucleo.appendChild(label1Nucleo);

	label2Nucleo.appendChild(b2Nucleo);
	div4Nucleo.appendChild(input1Nucleo);
	div4Nucleo.appendChild(label2Nucleo);

	label3Nucleo.appendChild(b3Nucleo);
	div6Nucleo.appendChild(input2Nucleo);
	div6Nucleo.appendChild(label3Nucleo);

	label4Nucleo.appendChild(b4Nucleo);
	div8Nucleo.appendChild(input3Nucleo);
	div8Nucleo.appendChild(label4Nucleo);

	label5Nucleo.appendChild(b5Nucleo);
	div9Nucleo.appendChild(label5Nucleo);

	div1Nucleo.appendChild(div2Nucleo);
	div1Nucleo.appendChild(div3Nucleo);
	div1Nucleo.appendChild(div4Nucleo);
	div1Nucleo.appendChild(div5Nucleo);
	div1Nucleo.appendChild(div6Nucleo);
	div1Nucleo.appendChild(div7Nucleo);
	div1Nucleo.appendChild(div8Nucleo);
	div1Nucleo.appendChild(div9Nucleo);

	divPrincipal.appendChild(div1Nucleo);

	/* OUTRA ****************************************************************************************************************/

	var div1Outra = document.createElement('div'),
		div2Outra = document.createElement('div'),
		div3Outra = document.createElement('div'),
		div4Outra = document.createElement('div'),
		div5Outra = document.createElement('div'),
		div6Outra = document.createElement('div'),
		div7Outra = document.createElement('div'),
		div8Outra = document.createElement('div'),
		div9Outra = document.createElement('div'),
		label1Outra = document.createElement('label'),
		label2Outra = document.createElement('label'),
		label3Outra = document.createElement('label'),
		label4Outra = document.createElement('label'),
		label5Outra = document.createElement('label'),
		b1Outra = document.createElement('b'),
		b2Outra = document.createElement('b'),
		b3Outra = document.createElement('b'),
		b4Outra = document.createElement('b'),
		b5Outra = document.createElement('b'),
		input1Outra = document.createElement('input'),
		input2Outra = document.createElement('input'),
		input3Outra = document.createElement('input');

	div1Outra.classList.add('row');
	div1Outra.classList.add('esconder');
	
	div2Outra.classList.add('input-field');
	div2Outra.classList.add('col');
	div2Outra.classList.add('s2');

	div3Outra.classList.add('col');
	div3Outra.classList.add('s1');

	div4Outra.classList.add('input-field');
	div4Outra.classList.add('col');
	div4Outra.classList.add('s2');

	div5Outra.classList.add('col');
	div5Outra.classList.add('s1');

	div6Outra.classList.add('input-field');
	div6Outra.classList.add('col');
	div6Outra.classList.add('s2');

	div7Outra.classList.add('col');
	div7Outra.classList.add('s1');

	div8Outra.classList.add('input-field');
	div8Outra.classList.add('col');
	div8Outra.classList.add('s2');

	div9Outra.classList.add('input-field');
	div9Outra.classList.add('col');
	div9Outra.classList.add('s1');

	div1Outra.setAttribute('id', 'divOutra' + numLote);

	input1Outra.setAttribute('type', 'text');
	input1Outra.setAttribute('name', 'outraManha' + numLote); //outraManha1
	input1Outra.setAttribute('id', 'outraManha' + numLote);
	label2Outra.setAttribute('for', 'outraManha' + numLote);

	input2Outra.setAttribute('type', 'text');
	input2Outra.setAttribute('name', 'outraTarde' + numLote); //outraTarde1
	input2Outra.setAttribute('id', 'outraTarde' + numLote);
	label3Outra.setAttribute('for', 'outraTarde' + numLote);

	input3Outra.setAttribute('type', 'text');
	input3Outra.setAttribute('name', 'outraTotal' + numLote); //outraTotal1
	input3Outra.setAttribute('id', 'outraTotal' + numLote);
	label4Outra.setAttribute('for', 'outraTotal' + numLote);

	b1Outra.innerHTML = "Outra:";
	b2Outra.innerHTML = "Manhã:";
	b3Outra.innerHTML = "Tarde:";
	b4Outra.innerHTML = "Total:";
	b5Outra.innerHTML = "(Kg)";

	label1Outra.appendChild(b1Outra);
	div2Outra.appendChild(label1Outra);

	label2Outra.appendChild(b2Outra);
	div4Outra.appendChild(input1Outra);
	div4Outra.appendChild(label2Outra);

	label3Outra.appendChild(b3Outra);
	div6Outra.appendChild(input2Outra);
	div6Outra.appendChild(label3Outra);

	label4Outra.appendChild(b4Outra);
	div8Outra.appendChild(input3Outra);
	div8Outra.appendChild(label4Outra);

	label5Outra.appendChild(b5Outra);
	div9Outra.appendChild(label5Outra);

	div1Outra.appendChild(div2Outra);
	div1Outra.appendChild(div3Outra);
	div1Outra.appendChild(div4Outra);
	div1Outra.appendChild(div5Outra);
	div1Outra.appendChild(div6Outra);
	div1Outra.appendChild(div7Outra);
	div1Outra.appendChild(div8Outra);
	div1Outra.appendChild(div9Outra);

	divPrincipal.appendChild(div1Outra);

	document.querySelector('#dietaOutrosLotes').appendChild(divPrincipal);
    
    document.querySelector('#dietaOutrosLotes').classList.remove('esconder');

    /* CHAMANDO AS FUNÇÕES QUE EXIBEM OS CAMPOS EXPECÍFICOS DA DIETA DE CADA LOTE DE ACORDO COM OS ITENS SELECIONADOS */

    document.querySelector('#checkSilagem' + numLote).addEventListener('click', function(e){ ExibirSilagem(e.target.id) });
	document.querySelector('#checkRacao' + numLote).addEventListener('click', function(e){ ExibirRacao(e.target.id) });
	document.querySelector('#checkAlgodao' + numLote).addEventListener('click', function(e){ ExibirAlgodao(e.target.id) });
	document.querySelector('#checkSoja' + numLote).addEventListener('click', function(e){ ExibirSoja(e.target.id) });
	document.querySelector('#checkPoupa' + numLote).addEventListener('click', function(e){ ExibirPoupa(e.target.id) });
	document.querySelector('#checkFuba' + numLote).addEventListener('click', function(e){ ExibirFuba(e.target.id) });
	document.querySelector('#checkBicarbonato' + numLote).addEventListener('click', function(e){ ExibirBicarbonato(e.target.id) });
	document.querySelector('#checkNucleo' + numLote).addEventListener('click', function(e){ ExibirNucleo(e.target.id) });
	document.querySelector('#checkOutra' + numLote).addEventListener('click', function(e){ ExibirOutra(e.target.id) });

	/* CHAMANDO AS FUNÇÕES QUE CALCULAM O TOTAL DE KG DE CADA ALIMENTO QUE COMPÕE A DIETA (MANHÃ + TARDE) */

	document.querySelector('#silagemTotal' + numLote).addEventListener('click', function(e){ CalcTotalSilagem(e.target.id) });
	document.querySelector('#racaoTotal' + numLote).addEventListener('click', function(e){ CalcTotalRacao(e.target.id) });
	document.querySelector('#algodaoTotal' + numLote).addEventListener('click', function(e){ CalcTotalAlgodao(e.target.id) });
	document.querySelector('#sojaTotal' + numLote).addEventListener('click', function(e){ CalcTotalSoja(e.target.id) });
	document.querySelector('#poupaTotal' + numLote).addEventListener('click', function(e){ CalcTotalPoupa(e.target.id) });
	document.querySelector('#fubaTotal' + numLote).addEventListener('click', function(e){ CalcTotalFuba(e.target.id) });
	document.querySelector('#bicarbonatoTotal' + numLote).addEventListener('click', function(e){ CalcTotalBicarbonato(e.target.id) });
	document.querySelector('#nucleoTotal' + numLote).addEventListener('click', function(e){ CalcTotalNucleo(e.target.id) });
	document.querySelector('#outraTotal' + numLote).addEventListener('click', function(e){ CalcTotalOutra(e.target.id) });
}

//Funções quem exibem os campos específicos dos alimentos selecionados para as dietas.

function ExibirSilagem(){
	if(document.querySelector('#checkSilagem' + numLote).checked == true){
		document.querySelector('#divSilagem' + numLote).classList.remove('esconder');
	}else{
		document.querySelector('#divSilagem' + numLote).classList.add('esconder');
	}
}

function ExibirRacao(){
	if(document.querySelector('#checkRacao' + numLote).checked == true){
		document.querySelector('#divRacao'  + numLote).classList.remove('esconder');	
	}else{
		document.querySelector('#divRacao' + numLote).classList.add('esconder');
	}
}

function ExibirAlgodao(){
	if(document.querySelector('#checkAlgodao' + numLote).checked == true){
		document.querySelector('#divAlgodao'  + numLote).classList.remove('esconder');	
	}else{
		document.querySelector('#divAlgodao' + numLote).classList.add('esconder');
	}
}

function ExibirSoja(){
if(document.querySelector('#checkSoja' + numLote).checked == true){
		document.querySelector('#divSoja'  + numLote).classList.remove('esconder');	
	}else{
		document.querySelector('#divSoja' + numLote).classList.add('esconder');
	}
}

function ExibirPoupa(){
if(document.querySelector('#checkPoupa' + numLote).checked == true){
		document.querySelector('#divPoupa'  + numLote).classList.remove('esconder');	
	}else{
		document.querySelector('#divPoupa' + numLote).classList.add('esconder');
	}
}

function ExibirFuba(){
if(document.querySelector('#checkFuba' + numLote).checked == true){
		document.querySelector('#divFuba'  + numLote).classList.remove('esconder');	
	}else{
		document.querySelector('#divFuba' + numLote).classList.add('esconder');
	}
}

function ExibirBicarbonato(){
if(document.querySelector('#checkBicarbonato' + numLote).checked == true){
		document.querySelector('#divBicarbonato'  + numLote).classList.remove('esconder');	
	}else{
		document.querySelector('#divBicarbonato' + numLote).classList.add('esconder');
	}
}

function ExibirNucleo(){
if(document.querySelector('#checkNucleo' + numLote).checked == true){
		document.querySelector('#divNucleo'  + numLote).classList.remove('esconder');	
	}else{
		document.querySelector('#divNucleo' + numLote).classList.add('esconder');
	}
}

function ExibirOutra(){
if(document.querySelector('#checkOutra' + numLote).checked == true){
		document.querySelector('#divOutra'  + numLote).classList.remove('esconder');	
	}else{
		document.querySelector('#divOutra' + numLote).classList.add('esconder');
	}
}

// Funções para calcular o total da soma de alimentos de manhã e à tarde.

function CalcTotalSilagem(){
	var manha = document.querySelector('#silagemManha' + numLote).value;
	var tarde = document.querySelector('#silagemTarde' + numLote).value;
	var total = parseInt(manha) + parseInt(tarde);

	document.querySelector('#silagemTotal' + numLote).setAttribute('value', total);
}

function CalcTotalRacao(){
	var manha = document.querySelector('#racaoManha').value;
	var tarde = document.querySelector('#racaoTarde').value;
	var total = parseInt(manha) + parseInt(tarde);

	document.querySelector('#racaoTotal').setAttribute('value', total);
}

function CalcTotalAlgodao(){
	var manha = document.querySelector('#algodaoManha').value;
	var tarde = document.querySelector('#algodaoTarde').value;
	var total = parseInt(manha) + parseInt(tarde);

	document.querySelector('#algodaoTotal').setAttribute('value', total);
}

function CalcTotalSoja(){
	var manha = document.querySelector('#sojaManha').value;
	var tarde = document.querySelector('#sojaTarde').value;
	var total = parseInt(manha) + parseInt(tarde);

	document.querySelector('#sojaTotal').setAttribute('value', total);
}

function CalcTotalPoupa(){
	var manha = document.querySelector('#poupaManha').value;
	var tarde = document.querySelector('#poupaTarde').value;
	var total = parseInt(manha) + parseInt(tarde);

	document.querySelector('#poupaTotal').setAttribute('value', total);
}

function CalcTotalFuba(){
	var manha = document.querySelector('#fubaManha').value;
	var tarde = document.querySelector('#fubaTarde').value;
	var total = parseInt(manha) + parseInt(tarde);

	document.querySelector('#fubaTotal').setAttribute('value', total);
}

function CalcTotalBicarbonato(){
	var manha = document.querySelector('#bicarbonatoManha').value;
	var tarde = document.querySelector('#bicarbonatoTarde').value;
	var total = parseInt(manha) + parseInt(tarde);

	document.querySelector('#bicarbonatoTotal').setAttribute('value', total);
}

function CalcTotalNucleo(){
	var manha = document.querySelector('#nucleoManha').value;
	var tarde = document.querySelector('#nucleoTarde').value;
	var total = parseInt(manha) + parseInt(tarde);

	document.querySelector('#nucleoTotal').setAttribute('value', total);
}

function CalcTotalOutra(){
	var manha = document.querySelector('#outraManha').value;
	var tarde = document.querySelector('#outraTarde').value;
	var total = parseInt(manha) + parseInt(tarde);

	document.querySelector('#outraTotal').setAttribute('value', total);
}

//Função para remover o último lote inserido.

function RemoverLote(){
	var div = document.querySelector('#dietaOutrosLotes');
	div.removeChild(div.lastChild);
	numLote--;
}