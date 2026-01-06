import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("viji");
        names.add("pradee");
        names.add("rithiga");
        names.add("xavier");
        System.out.println(names);

        System.out.println(names.headSet("rithiga"));
        System.out.println(names.tailSet("viji"));
    }
}