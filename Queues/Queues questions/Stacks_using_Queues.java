
import java.util.LinkedList;
import java.util.Queue;

public class Stacks_using_Queues {
    Queue<Integer> q=new LinkedList<>();

    void push(int val){
        q.add(val);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
    }

    int pop(){
        if(q.isEmpty()){
            System.out.println("empty Stack");
        }
        return q.remove();
    }

    int top(){
        return q.peek();
    }

    boolean isEmpty(){
        return q.isEmpty();
    }

    void display(){
        if(!q.isEmpty()){
        System.out.print(q+" ");}
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Stacks_using_Queues s=new Stacks_using_Queues();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();

        s.pop();

        s.display();
        System.out.println("Top element :"+s.top());
        s.isEmpty();
    }


}
