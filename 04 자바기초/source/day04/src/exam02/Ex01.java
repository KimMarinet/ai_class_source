package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Human human = new Human();

        Tiger tiger = new Tiger();

        Bird bird = new Bird();

        Animal[] animals = new Animal[3];
        animals[0] = human;
        animals[1] = tiger;
        animals[2] = bird;

        for(Animal animal : animals){
            animal.move();
        }
    }
}
