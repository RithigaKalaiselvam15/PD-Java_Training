class Trainees {
    private String Name;
    private int Age;

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Trainees T = new Trainees();
        T.setName("rithiga");
        T.setAge(21);
        System.out.println("name : " + T.getName());
        System.out.println("age : " + T.getAge());
    }
}

