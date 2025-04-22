package exam01;

public class Student {
    static int id; // 학번
    String name;
    String major;

    public Student(){

    }

    public Student(int id, String name, String major){
        this.id = id;
        this.name = name;
        this.major = major;
    }

    void study(){
        System.out.printf("id = %d, name = %s, major = %s%n", id, name, major);
    }
    // 정적 메서드로 객체 생성과는 아무런 상관X
    static void staticMethod(){
        System.out.println("staticMethod()!");
    }
}