//EJERCICIO 1
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

//EJERCICIO 2
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

//EJERCICIO 3
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