package exam02;

public final class Human extends Animal{
    @Override
    public void move() {
        //super.move();
        System.out.println("직립 무빙");
    }

    public final void reading(){
        System.out.println("독서");
    }
}
