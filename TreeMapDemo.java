import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> color = new TreeMap<Integer, String>();
        color.put(1, "red");
        color.put(2, "rose");
        color.put(3, "violet");
        color.put(4, "yellow");
        color.put(5, "blue");
        System.out.println(color);
        color.remove(3);
        System.out.println(color.containsKey(1));
        System.out.println(color.containsValue("kiwi "));

        System.out.println(color.isEmpty());
        System.out.println(color.keySet());
        System.out.println(color.values());
        System.out.println(color.get(2));
        System.out.println(color);

    }
}
