
import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq =new LinkedList<>();
//add
        dq.addFirst(2);
        dq.add(3);
        dq.add(3);
        System.err.println(dq);
    }
}
