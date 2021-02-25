
const emptyDot = '<i class="icon-circle-empty"></i>';
const fullDot = '<i class="icon-circle"></i>';

const pictures = ['img/winter1.png','img/winter2.png', 'img/winter3.png', 'img/winter4.png', 'img/winter5.png'];
var displayedSlide = pictures.length;


function pictureTimer(){
    changePicture();
    let nextPic = function(){
        pictureTimer();
    }
    setTimeout(nextPic, 5000);
}

function changePicture(index){
    if(index == undefined) ++displayedSlide;
    else displayedSlide = index;

    if (displayedSlide >= pictures.length) displayedSlide = 0;
    let dotSetup = generateDots();
    $('#slide-dots').html(dotSetup);
    $('#slider').css('background-image', 'url("' + pictures[displayedSlide] + '")');
}

function generateDots(){
    dotsHtml = '';
    for(let i=0; i<pictures.length; i++){
        if(displayedSlide == i) dotsHtml += fullDot;
        else dotsHtml += emptyDot;
    }
    return dotsHtml;
}

const onbuild = function(){
    pictureTimer();
}
$(document).ready(onbuild);