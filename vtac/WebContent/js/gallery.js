var imageSetting = {
		imageRange : {
			start : 1,
			end : 10,
			exclude:[10]
		} 
}

$(document).ready(function(){
	loadImages();
	
	var w = window.innerWidth;
	var slidesShow = 1;
	if(w>1250){
		slidesShow = 5;
	}else if(w>1000){
		slidesShow = 4;
	}else if(w>630){
		slidesShow = 3;
	}else if(w>300){
		slidesShow = 2;
	}
	
	$(".slick-carousel").slick({ 
				 slidesToShow: 1,
				  slidesToScroll: 1,
				  arrows: false,
				  //fade: true,
				  asNavFor: '.slick-carousel-nav'
			});
	$('.slick-carousel-nav').slick({
		  slidesToShow: slidesShow,
		  slidesToScroll: 1,
		  asNavFor: '.slick-carousel',
		  // dots: true,
		  centerMode: true,
		  focusOnSelect: true
		});
			
});

function loadImages(){
	var imageRange = imageSetting.imageRange;
	
	for(var i=imageRange.start;i<=imageRange.end;i++){
		if(isNotExclude(i)){
		var div = document.createElement("div");
		var img = document.createElement("img");
		img.src = "img/gallery/"+i+".JPG";
		$(div).append(img);
		$(".slick-carousel-nav,.slick-carousel").append(div);
		}
	}
	
}

function isNotExclude(indexToExclude){
	var isNotExclude = true;
	var excludeList = imageSetting.imageRange.exclude;
	$.each(excludeList,function(index,value){
		if(value == indexToExclude){
			isNotExclude =  false;
		}
	});
	return isNotExclude;
}