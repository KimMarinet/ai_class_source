package exam02;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals ={
                new Human(),
                new Tiger(),
                new Bird()
        };

        for(Animal a : animals){
            a.move();
            /*if(a instanceof Human){
                Human h1 = (Human) a;
                h1.reading();
            }*/
        }
    }
}
