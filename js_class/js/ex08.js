//생성자 : 다른 함수와 구분하기 위해 첫자를 대문자로 사용하는 관례 있음
function Person () {
    this.name = "김문수";
    this.age = 40;
}
const p1 = new Person(); // 생성자로 신규 객체 생성
const p2 = new Person();

console.log(p1 === p2);
console.dir(Person);

function Person1(name, age){
    this.name = name;
    this.age = age;
    this.showInfo = function(){
        console.log("name", this.name, "age", age, this.age); // 함수 즉, 기능 수행은 동일하기 때문에 이렇게 정의하는 것은 쓸모 없는 메모리 필요를 유발함
    };
}
const p3 = new Person1("이이름", 30);

//console.log(p3);

function Person1(name, age){
    this.name = name;
    this.age = age;
}

Person.prototype.showInfo = function(){
    console.log("name", this.name, "age", age, this.age); // 그래서 이처럼 함수 자체는 상속을 받아 사용하도록 한다
}