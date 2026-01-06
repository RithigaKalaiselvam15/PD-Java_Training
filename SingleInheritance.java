class Animal {
    void eat() {
        System.out.println("this animal can eat");
    }


}

class Lion extends Animal {
    void roar() {
        System.out.println("it roars");
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        Lion L = new Lion();
        L.roar();
        L.eat();
    }
}
