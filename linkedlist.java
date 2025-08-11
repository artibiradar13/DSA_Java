public class linkedlist {
   static class node{
        int data;
        node next;

        public node(int val){
            data=val;
        }
        
    }
    public static class singlylinkedlist{
        node head=null;
        node tail=null;
        void insertAtEnd(int val){
            node list=new node(val);
            if(head==null){
                head=list;
            }else{
                tail.next=list;
            }
            tail=list;

        }
        void display() {
            node temp = head;
            while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
            }
        }

    }
    public static void main(String[] args) {
        singlylinkedlist ll=new singlylinkedlist();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.display();
        
    }
}
