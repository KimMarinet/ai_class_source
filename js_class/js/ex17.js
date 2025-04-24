// Number
const num1 = 1000000000000000;
console.log(num1.toLocaleString());

// Date

const date = new Date();
console.log(date);

const year = date.getFullYear(); // 4자리 연도 표기
const month = date.getMonth();
const d = date.getDate();
const day = date.getDay();

const test = function(day){
    let ena = 'none';
    switch (day){
        case 0 : ena = '일요일';
            break;
        case 4 : ena = "목요일";
            break;
        default :
            console.log("xx");
    }
    return ena;
};

console.log(year, month + 1, d, test(day));