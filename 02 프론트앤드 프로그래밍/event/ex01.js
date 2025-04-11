window.addEventListener("DOMContentLoaded", function(){
    const el = document.getElementById("button");
    el.addEventListener("click", function(){
        alert("확인1");
    });

    el.addEventListener("click", function(){
        alert("확인2");
    });
});