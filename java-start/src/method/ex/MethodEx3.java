package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;


        balance = depositAmount(balance,10000);
        balance = withdrawAmount(balance,2000);



        // 입금 1000
//        int depositAmount = 1000;
//        balance += depositAmount;
//        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        // 출금 2000
//        if (balance >= withdrawAmount) {
//            balance -= withdrawAmount;
//            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
//        } else {
//            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
//        }
        
        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int depositAmount(int balance,int amount) {

        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdrawAmount(int balance,int amount) {

        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

}