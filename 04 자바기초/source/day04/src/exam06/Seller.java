package exam06;

public interface Seller {
    void sell();

    default void order(){
        System.out.println("Seller_주문하기");
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("privateMethod");
    }

    public  static void staticMethod(){
        System.out.println("staticMethod");
    }
}
