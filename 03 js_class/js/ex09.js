class Person{
    constructor(name, age){
        this.name =name;
        this.age = age;
    }

    static staticMethod(){
        console.log("정적 메서드");
    }

    showInfo(){
        console.log('name', this.name, 'age', this.age);
    }
}

Person.prototype.showInfo();
Person.staticMethod();