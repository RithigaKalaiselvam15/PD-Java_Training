package org.example;

class Polymorphism {
    void sum() {
        System.out.println("no parameter");
    }

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        p.sum();
        p.sum(10, 20);
        System.out.println(p.sum(10, 30, 40));
        System.out.println(p.sum(10.55, 12.60, 13.50, 20.13));
    }
}

