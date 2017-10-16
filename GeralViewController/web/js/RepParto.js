window.onload = function(){
	document.querySelector('#numCrias').addEventListener('click', function(e){ MostrarCamposCrias(e.target.id) });
}

function MostrarCamposCrias(){
	var num = document.querySelector('#numCrias').value;

	if(num==1){
		document.querySelector('#divCria1').classList.remove('esconder');
		document.querySelector('#divCria2').classList.add('esconder');
	}else if(num==2){
		document.querySelector('#divCria1').classList.remove('esconder');
		document.querySelector('#divCria2').classList.remove('esconder');	
	}
}