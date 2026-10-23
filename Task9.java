import static java.lang.Math.*;

public class Task9 {
    public static int add(int a, int b) {
        return addExact(a, b);
    }    

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }  

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;

        System.out.println("Math Operation Demo");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("-----------------------");

        System.out.println("Addition Result: " + add(num1, num2));
        System.out.println("Subtraction Result: " + subtract(num1, num2));
        System.out.println("Multiplication Result: " + multiply(num1, num2));
        System.out.println("Division Result: " + divide(num1, num2));
    }
}