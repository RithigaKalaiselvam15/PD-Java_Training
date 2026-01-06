import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list);
        for (int i = 100; i <= 110; i++) {
            list.add(i);
        }
        list.add(300);
        list.add(750);

        list.remove(3);

        list.set(2, 20);

        System.out.println(list);
        System.out.println(list.get(0));

        LinkedList<String> strlist = new LinkedList<>();
        strlist.add("iniya");
        strlist.add("hema");
        strlist.add("gomathy");
        strlist.add("rithiga");
        strlist.add("rithiga");
        strlist.addFirst("jaya");
        strlist.addLast("kalai");
        System.out.println(strlist);
        System.out.println(strlist.get(2));
        System.out.println(strlist.peekFirst());
        System.out.println(strlist.peekLast());


        LinkedList allList = new LinkedList();
        allList.add('k');
        allList.add("sneka");
        allList.add(25);
        System.out.println(allList.pollFirst());
        System.out.println(allList);


    }
}
