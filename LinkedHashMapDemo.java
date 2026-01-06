import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(1, "jasmine");
        lhm.put(2, "rose");
        lhm.put(3, "hibiscus");
        System.out.println(lhm);
        lhm.remove(3);
        System.out.println(lhm.containsKey(1));
        System.out.println(lhm.containsValue("kiwi "));

        System.out.println(lhm.isEmpty());
        System.out.println(lhm.keySet());
        System.out.println(lhm.values());
        System.out.println(lhm.get(2));
        System.out.println(lhm);
    }
}