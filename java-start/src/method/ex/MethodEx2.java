package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";

        print(message,3);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(message);
//        }
//
//        for (int i = 0; i < 7; i++) {
//            System.out.println(message);
//        }
    }

    public static void print(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

}