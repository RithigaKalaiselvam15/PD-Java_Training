class DomesticAnimal {
    void eat() {
        System.out.println("this animal can eat");
    }
}

class Cat extends DomesticAnimal {
    void sound() {
        System.out.println("mew mew");
    }
}

class Dog extends DomesticAnimal {
    void bark() {
        System.out.println("wow wow");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        c.eat();
        c.sound();
        d.eat();
        d.bark();
    }

}
