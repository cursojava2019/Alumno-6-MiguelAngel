$(document).ready(function(){
	var botonMod = "<button id='backVerde'>Cambiar fondo verde Module</button>";
	$(".module:first").before(botonMod);
	var divMod = $('.module');

	$("#backVerde").click(function(){
		divMod.css("background-color","green");
	});

	var botonLabel = "<button id='backAzul'>Cambiar fondo azul</button>";
	$("label").before(botonLabel);
	var labelInput = $('label');

	$("#backAzul").click(function(){
		labelInput.css("background-color","blue");
	});

	var elementOculto =  $("*:hidden").length;
	var botonOculto = "<button id='botonOculto'>Mostrar nº de elementos ocultos</button>";
	var imagenAlt = $("img[alt]").length;
	var botonImagenAlt = "<button id='botonImagenAlt'>Mostrar nº de imagenes con Alt</button>";
	$("label").before(botonOculto, botonImagenAlt);

	$("#botonOculto").click(function(){
		alert(elementOculto);
	});
	$("#botonImagenAlt").click(function(){
		alert(imagenAlt);
	});

	$("tbody tr:even").css("background-color","yellow");

});