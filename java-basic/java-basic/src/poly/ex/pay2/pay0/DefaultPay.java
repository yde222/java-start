package poly.ex.pay2.pay0;



public class DefaultPay implements Pay2 {

    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
