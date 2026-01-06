class Father {
    int age = 50;

    Father(String name) {
        System.out.println(name);
    }

    public void eat() {
        System.out.println(" he is eating");
    }

}

class Daughter extends Father {
    int age = 21;

    Daughter() {
        super("kalai");
        System.out.println("daughter name is rithiga");
        System.out.println(age);
        System.out.println(super.age);

    }

    public void eat() {
        super.eat();
        System.out.println("she is eating");
    }
}

public class Keywords {
    public static void main(String[] args) {
        Daughter d1 = new Daughter();
        d1.eat();


    }
}