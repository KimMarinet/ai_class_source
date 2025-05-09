// 즉시 실행 함수
(function(){
    console.log("즉시 실행");
})();

(function (a,b){
    const result= a + b;
    console.log(result);
})(10, 20);

const val = (function (a,b){
    const result= a + b;
    return result;
})(10, 20);

console.log(val);