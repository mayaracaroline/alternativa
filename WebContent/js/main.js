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

/*price range*/

if ($.fn.slider) {
    $('#sl2').slider();
}

var RGBChange = function () {
    $('#RGB').css('background', 'rgb(' + r.getValue() + ',' + g.getValue() + ',' + b.getValue() + ')')
};

/*scroll to top*/

$(document).ready(function () {
    $(function () {
        $.scrollUp({
            scrollName: 'scrollUp', // Element ID
            scrollDistance: 300, // Distance from top/bottom before showing element (px)
            scrollFrom: 'top', // 'top' or 'bottom'
            scrollSpeed: 300, // Speed back to top (ms)
            easingType: 'linear', // Scroll to top easing (see http://easings.net/)
            animation: 'fade', // Fade, slide, none
            animationSpeed: 200, // Animation in speed (ms)
            scrollTrigger: false, // Set a custom triggering element. Can be an HTML string or jQuery object
            //scrollTarget: false, // Set a custom target element for scrolling to the top
            scrollText: '<i class="fa fa-angle-up"></i>', // Text for element, can contain HTML
            scrollTitle: false, // Set a custom <a> title if required.
            scrollImg: false, // Set true to use image
            activeOverlay: false, // Set CSS color to display scrollUp active point, e.g '#00FFFF'
            zIndex: 2147483647 // Z-Index for the overlay
        });
    });
});

function showAlert(ids) {
    const alerts = ids.split(",");
    alerts.forEach((item) => {
        document.getElementById(item).style.display="block";
    })
}

function hideElement(ids) {
    const alerts = ids.split(",");
    alerts.forEach((item) => {
        document.getElementById(item).style.display="none";
    })
}

function salvarAlteracoesEndereco() {
    hideElement('enderecoAlterado')
    showAlert('enderecoSalvo');
    setInterval(() => {
        hideElement('enderecoSalvo,salvarAlteracaoEndereco')
    }, 2000);

}


async function obterDados(id) {
	console.log('obterDados '+ id)
	const dados = await fetch('/livraria/Pages/lumino/ConsultaProduto?page=product&operacao=CONSULTAR&codigo='+id, {method: 'get'})
	console.log(dados)
	return dados;
}