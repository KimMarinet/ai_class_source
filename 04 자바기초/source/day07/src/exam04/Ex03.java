package exam04;

public class Ex03 {
    public static void main(String[] args) {
        Transportation trans = Transportation.SUBWAY;

        switch (trans){
            case BUS:
                System.out.println("버스");
                break;
            case SUBWAY:
                System.out.println("전철");
                break;
            case TAXI:
                System.out.println("택시");
                break;
            case AIRPLANE:
                System.out.println("비행기");
                break;
            default:
                System.out.println("해당 사항 없음");
                break;
        }
    }
}
