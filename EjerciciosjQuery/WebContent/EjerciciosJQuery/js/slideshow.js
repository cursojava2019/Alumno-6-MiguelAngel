$(document).ready(function() {
var bSlideShow="<input type='button' id='bSlideShow' value='Crear SlideShow'>";
$("#search").before(bSlideShow);
$("#bSlideShow").click(function(){
	var divSlide="<div id='slide'></div>";
	$("#search").after(divSlide);
	var img1="<img class='fSlide' src='img/naranjas.jpg'>";
	var img2="<img class='fSlide' src='img/pan.jpg'>";
	var img3="<img class='fSlide' src='img/zanahorias.jpg'>";
	var bSlideMenos=" <button id='bSlideMenos'>&#10094;</button>";
	var bSlideMas=" <button id='bSlideMas'>&#10095;</button>";
	 $("#slide").append(img1,img2,img3);
	 $('#slide').before(bSlideMenos,bSlideMas);
	 $('#slide').css('width','450px');
	 $('#slide').css('height','350px');
	 $('.fSlide').css('width','450px');
	 $('.fSlide').css('height','350px');
	 $('.fSlide').css('position','absolute').css('float','right');
	 $('.fSlide').css('display','none');
	 $('#bSlideMas').css('float','right');
	 var intervalAparece=setInterval(imagenAparece, 1000);
	 var intervalDesaparece=setInterval(imagenDesaparece, 7000);
	 
	 function imagenAparece(){
			$('#slide .fSlide:last').fadeIn("slow");
		}
	 function imagenDesaparece(){
		$('#slide .fSlide:last').fadeOut("slow");
		var primerImg=$('#slide .fSlide:last');
		$('#slide .fSlide:last').remove();
		$('#slide').prepend(primerImg);
	}
	 $('#bSlideMenos').click(lessImg);
	 $('#bSlideMas').click(plusImg);
	 function lessImg() {
		 var ultimaImg=$('#slide .fSlide:last');
		 $('#slide .fSlide:last').remove();
		 $('#slide').prepend(ultimaImg);
	 }
	 function plusImg() {
		 var primeraImg=$('#slide .fSlide:first');
		 $('#slide .fSlide:first').remove();
		 $('#slide').append(primeraImg);
	}	 
}); 
	
});