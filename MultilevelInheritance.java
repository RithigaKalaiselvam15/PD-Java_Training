class Employee {
    void Work() {
        System.out.println("Employees Working");
    }
}

class Developer extends Employee {
    void Develop() {
        System.out.println("Developing the application");
    }
}

class FrontendDeveloper extends Developer {
    void WebDevelop() {
        System.out.println(" Developing the frontend web application");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        FrontendDeveloper w = new FrontendDeveloper();
        w.Work();
        w.Develop();
        w.WebDevelop();

    }
}

