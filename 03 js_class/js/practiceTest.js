function test1(){
    for(i = 1; i <= 40; i++){
        var roomNum = i % 10;
        console.log("학생 : ", i, "방 번호 : ", roomNum);
    }
}

function test2(){
    for(i = 2; i < 10; i++){
        if(i % 2 === 0) continue;
        for(j = 1; j < 10; j++){            
            console.log(i, "X", j, "=", i*j);
        }
    }
}

function test3(){
    /*for(i = 2; i < 10; i++){
        for(j = 1; j < 10; j++){
            if(j >= i)
                console.log(i, "X", j, "=", i*j);
        }
    }*/
    for(i = 2; i < 10; i++){
        for(j = 1; j < 10; j++){
            if(j < i) continue;
            console.log(i, "X", j, "=", i*j);
        }
    }
}

test3();