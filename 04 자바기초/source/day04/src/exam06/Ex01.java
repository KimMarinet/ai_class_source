package exam06;

public class Ex01 {
    public static void main(String[] args) {
        Order o = new Order();
        o.buy();
        o.sell();

        Buyer b = o;
        b.buy();

        Seller s = o;
        s.sell();

        b.order();
    }
}