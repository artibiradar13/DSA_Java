
import java.util.LinkedList;
import java.util.Queue;

public class Basics{
public static void main(String[] args) {
    Queue<Integer> qu=new LinkedList<>();
    qu.add(1);
    qu.add(2);
    qu.add(3);
    qu.add(4);
    qu.add(5);
    System.out.println(qu);
    qu.remove();//qu.poll()
    System.out.println(qu);
    System.out.println(qu.peek());//qu.element()
    System.out.println(qu.size());
    System.out.println(qu.isEmpty());

    //print the queue-----by making another queue -------
    Queue<Integer> q=new LinkedList<>();
    while(!qu.isEmpty()){
        System.out.print(qu.peek()+" ");

        q.add(qu.poll());
    }

    //back to original-----
    while(!qu.isEmpty()){
        qu.add(q.poll());
    }


    
}
}