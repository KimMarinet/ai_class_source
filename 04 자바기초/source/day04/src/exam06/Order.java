package exam06;

public class Order implements Seller, Buyer{
    @Override
    public void buy() {
        System.out.println("구매");
    }

    @Override
    public void sell() {
        System.out.println("판매");
    }

    public void order(){
        //System.out.println("재정의 해버리기");
        //Buyer.super.order();
        Seller.super.order();
    }
}
