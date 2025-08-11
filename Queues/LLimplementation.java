public class LLimplementation {
     public static class Node{
        int val;
        Node next=null;

        public Node(int data) {
        this.val=data;}
        
     }
    public static class QueueLL{
        Node head=null;
        Node tail= null;
        int size=0;


        void push(int val){
            Node temp=new Node(val);
            if(size==0){
                head=tail=temp;
                size++;
                return;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        int remove(){
            if(head==null){
                System.out.println("empty  queue");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
            
        }

        int peek(){
            if(head==null){
                System.out.println("queue is empty ");
                return -1;
            }
            return head.val;

        }

        void display(){
            Node temp=head;
            if(head==null){
                System.out.println("empty queue");

            }
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }



     }
     public static void main(String[] args) {
        QueueLL q=new QueueLL();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);

        q.display();

        q.remove();

        q.display();
        System.out.println("peek value: "+q.peek());
     }
     
}
