import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("queue content:"+queue);
        System.out.println("queue first element:"+queue.element());
        System.out.println("queue content:"+queue);
        System.out.println("queue peek:"+queue.peek());
        System.out.println("queue content:"+queue);
        System.out.println("poll:"+queue.poll());
        System.out.println("queue content:"+queue);
    }
    
}
