// 가변 길이 인수 목록

function sum(){
    let total = 0;
    for(const num of arguments){
        total += num;
    }
    console.log(total);
    return total;
}

sum(1, 2, 3);

function sum1(...args){
    let total = 0;
    for(const num of args){
        total += num;
    }
    console.log(total);
    return total;
}

sum1(10, 20, 30);

function sum2(num1, num2, ...params){
    console.log("num1", num1, "num2", num2);
    console.log("params", params);
}

sum2(10, 20, 30, 40, 50);