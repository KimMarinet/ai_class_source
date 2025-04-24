package exam02;

public class Outer3 {
    void method(){
        class Inner{
            int add (int num1, int num2){
                return num1 + num2;
            }
        }
        Inner in = new Inner();
        int result = in.add(10,20);
        System.out.println(result);
    }
}
