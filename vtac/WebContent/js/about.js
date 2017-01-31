$(document).ready(function(){
	setInvertedStyle();
	$(".timeline li[year]").hide();
	$(".timeline .yearHeader[yearGroup]").on('click',function(evt){
		var year = $(this).attr("yearGroup");
		$(".timeline li[year="+year+"]").slideToggle( "fast" );
	});
});


function toggleEvents(){
	$(".timeline .hiddenEvent[yeargroup]").each(function(index,data){
		var event = $(this);
		event.slideToggle("fast");
		
	})
}

function setInvertedStyle(){
	$("li[year]:odd").addClass("timeline-inverted");
	
	$("img.img-circle.img-responsive.img-default:odd").attr("src","img/about/default_green.png");
	$("img.img-circle.img-responsive.img-default:even").attr("src","img/about/default_blue.png");
	
}