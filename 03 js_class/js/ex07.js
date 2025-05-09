//상속

const objA = { num1: 10, num2: 20};
const objB = { num3: 30, num4: 40};

objB.__proto__ = objA; // objB가 objA를 상속

console.log(objB.num1);