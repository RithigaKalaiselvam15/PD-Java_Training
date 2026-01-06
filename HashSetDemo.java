import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("rithi");
        h.add("rithiga");
        h.add("rithigaKalaiselvam");
        h.add("rithiga.k");
        h.add(null);
        Iterator it = h.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(h);
    }
}
