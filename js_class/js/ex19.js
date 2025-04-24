let str ='abc';

try{
    str.toUpperCase();
    console.log(str.toUpperCase(), "실행!");
}catch(err){ //throw new Error(...);
    console.log("에러에 대한 대안적인 처리...");
}

const success = false;

try{
    if(!success){
        throw new Error("작업에 대한 실패 메시지...");
    }

    console.log("성공 시 처리되는 로직");
}catch(err){
    console.error(err);
    console.log('message:', err.message);
    console.log("에러 처리...");
}