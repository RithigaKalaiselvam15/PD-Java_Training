import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lh = new LinkedHashSet<String>();
        lh.add("rithi");
        lh.add("rithiga");
        lh.add("rithigaKalaiselvam");
        lh.add("rithiga.k");
        System.out.println(lh);
    }
}