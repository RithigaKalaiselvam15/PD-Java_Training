import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "apple");
        hm.put(2, "kiwi");
        hm.put(3, "grape");
        hm.put(4, "orange");
        hm.put(5, "banana");
        System.out.println(hm);
        hm.remove(3);
        System.out.println(hm.containsKey(4));
        System.out.println(hm.containsValue("kiwi "));

        System.out.println(hm.isEmpty());
        System.out.println(hm.keySet());//return key alone
        System.out.println(hm.values());
        System.out.println(hm.get(5));// return value alone
        System.out.println(hm);
    }
}
