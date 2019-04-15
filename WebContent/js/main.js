/**
 * 
 */
function toggleDisplayElement(target, className) {
  const element = document.querySelector("."+className);
  if(target.checked) {	  
	  element.style.display= 'none';  
  } else {
	  element.style.display= 'block'; 
  }  
}

function mascara(t, mask){
 const i = t.value.length;
 const saida = mask.substring(1,0);
 const texto = mask.substring(i);
 
 if (texto.substring(0,1) != saida){
	t.value += texto.substring(0,1);
 }
}


async function obterDados(id) {
	console.log('obterDados '+ id)
	const dados = await fetch('/livraria/Pages/lumino/ConsultaProduto?page=product&operacao=CONSULTAR&codigo='+id, {method: 'get'})
	console.log(dados)
	return dados;
}