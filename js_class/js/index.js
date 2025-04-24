var num = 10;

function checkAge(age){
    if(age < 8){
        console.log("유치원")
    }
    else if(age < 14){
        console.log("초등학생")
    }
    else{
        console.log("error")
    }
}

var total = 0 , num = 1;

function testLoop(){
    do{
        total += num;
        num++;
    }while(num<=100);

    /*for(num = 1; num <= 100; num++){
        total += num;
    }*/
    return total;
}

console.log(testLoop());