import java.util.ArrayDeque;
import java.util.Queue;
public class queue{
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        int top = q.peek();
        int remove = q.poll();
        boolean empty = q.isEmpty();
        int size = q.size();

        System.out.println(top);
        System.out.println(remove);
        System.out.println(empty);
        System.out.println(size);
        System.out.println(q);
    }
}
