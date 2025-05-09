//원시 래퍼 객체

const str1 = 'ABC';

str1.concat("DEF", "GHI"); // new String(str1) -> 객체.concat(...) -> 원시 타입 변환

/*const str2 = new String(str1);*/

console.log(str1);
console.log(str1.concat("DEF", "GHI"));

const num1 = 10.123456;

console.log(num1.toFixed(2)); // new Number(num1) -> 객체.toFixed(2) -> 문자열(원시값)

console.log(str1.startsWith("A"));