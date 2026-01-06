import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(9);
        q.add(20);
        q.add(40);
        System.out.println("head is :" + q.peek());
        System.out.println("head is removed:" + q.remove());
        System.out.println("now  head is :" + q.peek());
        System.out.println("size  :" + q.size());
        System.out.println(" ");
    }
}