import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(8);
        pq.add(5);
        pq.add(20);
        pq.add(3);
        System.out.println(pq);
        System.out.println("head is :" + pq.peek());
        System.out.println("head is removed:" + pq.remove());
        System.out.println("now  head is :" + pq.peek());
        System.out.println("size  :" + pq.size());

    }
}
