$(document).ready(function() {
	$("#blog h3 a").removeAttr("href");
	$("#blog li").click(function(){
	    var $this = $(this).children("p");
	    $("#blog li p").not($this).hide("slow");
	    $this.toggle("slow");
	});
});