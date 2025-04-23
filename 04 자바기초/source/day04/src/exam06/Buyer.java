package exam06;

public interface Buyer {
    void buy();

    default void order(){ // public 고정
        System.out.println("Buyer_주문하기");
    };
}
