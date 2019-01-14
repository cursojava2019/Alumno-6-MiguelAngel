$(document).ready(function(){
	var botonAdd = "<button id='botonAdd'>Añadir items</button>";
	$("#myList").before(botonAdd);
	$("#botonAdd").click(function(){
		for(var i=0; i<5; i++){
			var l = "<li>List item "+(i+8)+"</li>";
			$("#myList li:last").after(l);
		}
	});

	var botonEliminarImpares = "<button id='botonEliminarImpares'>Borrar elementos impares</button>";
	$("#myList").before(botonEliminarImpares);
	$("#botonEliminarImpares").click(function(){
		$("#myList li:even").remove();
	});

	var botonElementos = "<button id='botonElementos'>Añadir elementos module</button>";
	$(".module:last").before(botonElementos);
	$("#botonElementos").click(function(){
		var h2Module = "<h2>h2 añadido</h2>";
		var pModule = "<p>párrafo añadido</p>";
		$(".module:last").after(h2Module,pModule);
	});

	var botonSelect = "<button id='botonSelect'>Añadir opción select</button>";
	$("#specials").before(botonSelect);
	$("#botonSelect").click(function(){
		var opcion = "<option value='wednesday'>Wednesday</option>";
		$("option[value='tuesday']").after(opcion);
	});

	var botonNuevoModule = "<button id='botonNuevoModule'>Añadir nuevo div Module</button>";
	$('.module:first').before(botonNuevoModule);
	$('#botonNuevoModule').click(function(){
		var nuevoDiv = "<div class='module'><p>Nuevo div module y nueva imagen</p><img src='images/bread.jpg'></div>";
		$(".module:last").after(nuevoDiv);
	});

});