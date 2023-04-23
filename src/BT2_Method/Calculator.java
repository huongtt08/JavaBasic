package BT2_Method;

public class Calculator {
    public static int tonghaiso(int a, int b) {

        return a + b;
    }

    public static double tichhaiso(double num1, double num2) {
        return num1 * num2;
    }


    public static void main(String[] args) {
        int sum = tonghaiso(2, 5);
        System.out.println(sum);

        double tich = tichhaiso(3.2, 2.2);
        System.out.println(tich);
    }
}