import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       int a =Sum.sum(4,5);
        System.out.println(a);
        int b =Sum.multiply(3,5);
        System.out.println(b);
        int c =Sum.substract(6,2);
        System.out.println(c);
    }

    public static int multiply(int a, int b) {
        return a*b;

    }

    public static int substract(int a, int b) {
        return a - b;

    }
    public static int sum(int a, int b) {
        return a + b;
    }
}
