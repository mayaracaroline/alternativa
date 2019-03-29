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