public class LLImplementation {
    
    public static class node{
        int val;
        node next=null;

        node(int data) {
            val=data;
        }
    }
    static class LLStack{
        node head=null;
        int size=0;


        void push(int x){
            node temp=new node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayrec(node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
        }
        void displayRev(){
            node temp=head;
            System.out.print("stack in reversed order :");
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
        int pop(){
            if(head==null){
                System.out.println("stack empty");
                return -1;
            }
            int popped=head.val;
            head=head.next;
            size--;
            return popped;
        }
        int peek(){
             if(head==null){
                System.out.println("stack empty");
                return -1;
            }
            return head.val;

        }

    }
    public static void main(String[] args) {
        LLStack st=new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.displayRev();
        System.out.println("\npopped element: "+st.pop());
        st.displayRev();
        System.out.println("\npeeked value: "+st.peek());
        st.display();

    }
}
