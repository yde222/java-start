package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[3];


        for(int i = 0; i < orders.length; i++){
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명 :  " );
            String ProductName = sc.nextLine();

            System.out.print("가격 : " );
            int Price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();


            orders[i] = createOrder(ProductName, Price, quantity);
        }



//        orders[0] = createOrder("두부",2000,2);
//        orders[1] = createOrder("김치",5000,1);
//        orders[2] = createOrder("콜라",1500,2);

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){

        ProductOrder order1= new ProductOrder();
        order1.productName = productName;
        order1.price = price;
        order1.quantity = quantity;

        return order1;

    }

    static void printOrders(ProductOrder[] orders){

        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);

        }

    }

    static int getTotalAmount(ProductOrder[] orders){

        int totalAmount = 0;

        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }


        return totalAmount;

    }

}
