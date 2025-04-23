package exam01;

public class Ex03 {
    public static void main(String[] args) {
        A ac = new C();
        A ad = new D();

        if (ad instanceof C) {
            C c1 = (C)ad;
        }
        if(ac instanceof C c2){
            System.out.println(c2.numC);
        }
    }
}
