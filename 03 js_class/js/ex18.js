function showInfo(){
    console.log(this.name, this.age);
}

const person = {
    name: '이름',
    age: 40,
};

const showInfo2 = showInfo.bind(person);

function add(num1, num2){
    return num1 + num2;
}

const add10 = add.bind(this, 10);