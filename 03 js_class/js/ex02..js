function outer(callback){
    callback();
}

function inner(){
    console.log("inner");
}
outer(inner);