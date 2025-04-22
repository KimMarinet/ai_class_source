package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        //s1.year = 2025;
        //s1.month = 4;
        //s1.day=22;

        s1.setYear(2025);
        s1.setMonth(2);
        s1.setDay(31);

        System.out.println(s1.getMonth());
        s1.showDate();
    }
}
