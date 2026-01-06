package org.example;

class Developer {
    public void development() {
        System.out.println("A dveloper is dveloping the application");
    }
}

class BackendDeveloper extends Developer {
    public void development() {
        System.out.println("A developer is developing the seeburger's backend application");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.development();
        Developer d1 = new BackendDeveloper();
        d1.development();
    }
}
