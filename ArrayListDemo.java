import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }

        list.add(45);
        list.add(60);
        list.add(75);
        list.remove(3);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(45));

        list.set(0, 20);

        System.out.println(list);
        System.out.println(list.get(0));

        ArrayList num = new ArrayList();
        num.add(30);
        num.add(40);
        System.out.println(num);

        List num1 = new ArrayList();
        num1.add(5000);
        num1.addAll(num);
        System.out.println(num1);

        ArrayList<String> strlist = new ArrayList<String>();
        strlist.add("rithi");
        strlist.add("thowfic");
        strlist.add("vishva");
        strlist.add("rithi");
        strlist.add("rithi");
        strlist.add("rithi");
        System.out.println(strlist);
        System.out.println(strlist.get(0));
        System.out.println(strlist.indexOf("rithiga"));
        System.out.println(strlist.lastIndexOf("rithi"));


        ArrayList allList = new ArrayList();
        allList.add('k');
        allList.add("rithiga");
        allList.add(21);
        System.out.println(allList);


    }
}
