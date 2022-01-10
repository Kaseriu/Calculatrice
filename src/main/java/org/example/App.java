package org.example;

public class App {

    public static void main(String[] args) {

        int a = 4;
        int b = 3;
        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Calculette.add(a, b));
        System.out.println(Calculette.sub(a, b));
        System.out.println(Calculette.mul(a, b));
        System.out.println(Calculette.div(a, b));
        System.out.println(Calculette.avg(c));
        
    }
}
