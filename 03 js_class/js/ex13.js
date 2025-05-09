const person = {
    name : "이름",
    age : 40,
    showInfo(){
        console.log(this.name, this.age);
    }
};
/*
// 변경 불가
Object.defineProperty(person, 'name', {writable: false});

person.name = "변경 불가";
console.log(person.name);

// 삭제 불가
Object.defineProperty(person, "age", { configurable:false });
delete person.age;

console.log(person.age);

// 정의되어 있는 속성명
console.log(Object.keys(person));
*/
Object.freeze(person);

console.log(Object.getOwnPropertyDescriptors(person), Object.isExtensible(person));