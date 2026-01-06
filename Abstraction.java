package org.example;

abstract class Employee {
    abstract void Training();
}

class Trainee extends Employee {
    public void Training() {
        System.out.println("They are under Training in Seeburger");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Trainee t1 = new Trainee();
        t1.Training();
    }
}