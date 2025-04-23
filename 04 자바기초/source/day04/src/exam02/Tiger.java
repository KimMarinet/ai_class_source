package exam02;

public class Tiger extends Animal{
    @Override
    public void move() {
        //super.move();
        System.out.println("네발로 뛰어~");
    }
    public void hunting(){
        System.out.println("오늘 밤 사냥을 나선다");
    }
}
