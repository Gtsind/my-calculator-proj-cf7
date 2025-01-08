package gr.aueb.cf.ch3;

public class MulCalculator {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int result = 0;

        result = multiply(num1,num2);

        System.out.println("Multiply : " + result);
    }

    public static int multiply(int a ,int b) {
        return a * b;
    }
}
