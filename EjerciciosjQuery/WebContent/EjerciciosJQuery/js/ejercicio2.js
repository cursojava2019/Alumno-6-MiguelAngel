$(document).ready(function(){
	var imagen = $("img");
	var botonMostrarAlt = "<button id='botonMostrarAlt'>Mostrar alt img por consola</button>";
	$("label").before(botonMostrarAlt);
	$("#botonMostrarAlt").click(function(){
		$(imagen).each(function(){
			console.log($(this).attr('alt'));	
		});
	});

	var botonGris = "<button id='botonGris'>Poner fondo gris</button>";
	$("form:last").before(botonGris);
	$("#botonGris").click(function(){
		$('form:last').addClass("fondoGris");
		$('.fondoGris').css("background-color","gray");
	});

	var botonCurrent = "<button id='botonCurrent'>Cambiar clase 'current'</button>";
	$("#myList").before(botonCurrent);
	$("#botonCurrent").click(function(){
		$("#myList .current").next().addClass("current");
		$("# .bar").removeClass("current");
	});
	
	var botonSpecials= "<button id='botonSpecials'>Valor submit por consola</button>";
	$("#specials").before(botonSpecials); 
	$("#botonSpecials").click(function(){
		console.log($('input[type="submit"]').attr('value'));
	});

	var botonSlide = "<button id='botonSlide'>Boton SlideShow</button>";
	$("#slideshow").before(botonSlide);
	$("#botonSlide").click(function(){
		$("#slideshow li:first").addClass("current");
		$("#slideshow li:first").siblings('li').addClass("disabled");
	});

});

