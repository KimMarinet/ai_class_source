const person = {
    name: '이름',
    age: 40,
};

const {name, age} = person; // 비구조화 할당

console.log(name, age);

const nums = [100, 200, 300, 400, 500];

const [num1, , num2] = nums;
console.log(num1, num2);