package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    // 변수값을 통제하여 대입
    public void setYear(int _year){
        year = _year;
    }
    public void setMonth(int _month){
        if(_month <= 12){
            month = _month;
        }else {
            month = 0;
            System.out.println("잘못된 달 표기입니다.");
        }
    }
    public void setDay(int _day){
        if(month == 2 && _day > 28){
            _day=28;
            System.out.println("잘못된 일 표기입니다.");
            System.out.println("28일로 강제 수정합니다.");
        }
        day = _day;
    }

    // 변수값 확인
    public  int getYear(){
        return year;
    }
    public  int getMonth(){
        return month;
    }
    public  int getDay(){
        return day;
    }

    void showDate(){
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }
}
