const schedule = {
    _year : 2025,
    _month : 4,
    _day : 10, //여기까지는 데이터 프로퍼티

    // 여기서부터 접근자 프로퍼티
    set year(year){
        this._year = year;
    },
    set month(month){
        this._month = month;
    },
    set day(day){
        if(this._month === 2 && day > 28){
            day = 28;
        }

        this._day = day;
    },
    get year(){
        return this._year;
    },
    get month(){
        return this._month;
    },
    get day(){
        return this._day;
    }
};

schedule.month = 2;
schedule.day = 31;

console.log("day", schedule.day);