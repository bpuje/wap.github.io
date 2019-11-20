function swapImage() {

    var image1 = document.getElementById("img1");
    var tempsrc = image1.src;
    var image2 = tempsrc.indexOf("happy");

    // image1.src = image2.src;
    // image2.src = tempsrc.src;


    // if(image1.src.indexOf('happy.jpg') > -1){
    //     image1.src = 'sad.jpg';
    // }else{
    //     image1.src = 'happy.jpg';
    // }
    if(image2 > -1){
        image1.src = "sad.jpg";
    }else{
        image1.src = "happy.jpg";
    }

}