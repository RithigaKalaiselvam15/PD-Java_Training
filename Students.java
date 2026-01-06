import java.util.ArrayList;
import java.util.List;

class Student {
    public int rollNo;
    public String name;
    public int score;
}

public class Students {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "rithi";
        s1.score = 75;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "gomathy";
        s2.score = 80;

        students.add(s1);
        students.add(s2);


        for (Student s : students) {
            System.out.println("{rollNo=" + s.rollNo + ", name='" + s.name + "', score=" + s.score + "}");
        }
    }
}
