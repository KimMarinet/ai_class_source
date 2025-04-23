package exam02;

public class Human extends Animal{
    @Override
    public void move() {
        super.move();
        System.out.println("직립 무빙");
    }

    public void reading(){
        System.out.println("독서");
    }
}
