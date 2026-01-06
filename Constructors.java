class Employees {
    String department;
    int experience;


    Employees() {
        this("Consulting",1);
        System.out.println("constructor");

    }

    Employees(String department, int experience) {
        this.department = department;
        this.experience = experience;
        System.out.println("Department:"+department+" "+"Experience:"+experience);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employees e1 = new Employees();
        Employees e2 = new Employees("Development", 5);//passing values to the constructors
        System.out.println(e1.department);
        System.out.println(e1.experience);
        System.out.println(e2.department);
        System.out.println(e2.experience);

    }

}

