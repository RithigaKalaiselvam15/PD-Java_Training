interface Developers {
    abstract void develop();
}

interface Tester {
    abstract void test();
}

class Employee1 implements Developers, Tester {
    public void develop() {
        System.out.println("developing the seeburger applications");
    }

    public void test() {
        System.out.println("Testing the developed applications");
    }
}


public class Interface {
    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.develop();
        Employee1 e1 = new Employee1();
        e1.test();
    }
}
