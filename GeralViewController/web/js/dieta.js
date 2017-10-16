window.onload = function(){
	document.querySelector('#silagemTotal').addEventListener('click', function(e){ CalcularTotalSilagem(e.target.id) });
}

function CalcularTotalSilagem(){
	sm = document.querySelector('#silagemManha').value;
	st = document.querySelector('#silagemTarde').value;
	stt = document.querySelector('silagemTotal');
	
	soma = sm + st;
	
	stt.setAttribute('value', soma);
	stt.innerHTML = soma;
}