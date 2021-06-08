package org.example;

public class Calculette {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static double avg(int[] a) throws ArithmeticException {
        if (a.length == 0) {
            throw new ArithmeticException();
        }

        double res = 0;
        for (double i : a) {
            res += i;
        }

        return res / a.length;
    }
}
