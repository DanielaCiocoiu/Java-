import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {5,8,2,-11,4,1} to queue
        //for (int i = 0; i < 6; i++)
        q.add(5);
        q.add(8);
        q.add(2);
        q.add(-11);
        q.add(4);
        q.add(1);
        System.out.println("Elements of queue             -" + q);
        q.remove();
        q.remove();
        q.remove();
        System.out.println("Elements of queue after remove-" + q);
        q.add(6);
        q.add(5);
        q.add(5);
        // Display contents of the queue.
        System.out.println("Elements of queue after add new elements-" + q);

        // To remove the head of queue.
//        int removedele = q.remove();
//        System.out.println("removed element-" + removedele);

        //System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue-" + size);
    }
}