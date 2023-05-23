let mainNav = document.getElementById('js-menu');
let navBarToggle = document.getElementById('js-navbar-toggle');
navBarToggle.addEventListener('click', function () {
    mainNav.classList.toggle('active');
    var element = document.getElementById('main-logo'),
    style = window.getComputedStyle(element),
    top = style.getPropertyValue('visibility');
    cssValue = top == 'visible' ? 'hidden' : 'visible';
    element.style.visibility = cssValue;
});

$(window).scroll(function() {
    if ($(document).scrollTop() > 150) {
        const newLocal = 'affix';
        $('.navbar').addClass(newLocal);
        if ($(document).scrollTop() > 370) {
            document.getElementById("progress-container").style.visibility= "visible";
                myFunction();    
        }     
                                                
    } else {
        document.getElementById("progress-container").style.visibility= "hidden";
        $('.navbar').removeClass('affix');
    }
});


$(document).ready(function(){
    if ($(document).scrollTop() > 150) {
        $('.navbar').addClass('affix');
            if ($(document).scrollTop() > 350) {
                document.getElementById("progress-container").style.visibility= "visible";
                myFunction();    
            }     
                                                
    } else {
        document.getElementById("progress-container").style.visibility= "hidden";
        $('.navbar').removeClass('affix');
    }
});

function myFunction() {
    var winScroll = document.body.scrollTop || document.documentElement.scrollTop;
    var height = document.documentElement.scrollHeight - document.documentElement.clientHeight;
    var scrolled = (winScroll / height) * 100;
    document.getElementById("myBar").style.width = scrolled + "%";
}
                            

window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    document.getElementById("myBtn").style.display = "block";
  } else {
    document.getElementById("myBtn").style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}


// image slider js
let slideIndex = 1;
showSlides(slideIndex);

// Next/previous controls
function plusSlides(n) {
  showSlides(slideIndex += n);
}

// Thumbnail image controls
function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  let i;
  let slides = document.getElementsByClassName("mySlides");
  let dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";
  dots[slideIndex-1].className += " active";
}
