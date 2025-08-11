public class singlyLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        // Insert at end
        void insertAtEnd(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }else{
                tail.next=newNode;
            }
            tail=newNode;
        }

        // Insert at head
        void insertAtHead(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        //insert at position
        void insertAtPosition(int pos,int data){
            Node newnode=new Node(data);
            Node temp=head;
            if(pos==size()){
                insertAtEnd(data);
                return;
            }
            else if(pos==0){
                insertAtHead(data);
            }
            for (int i = 1;i < pos-1;i++){
                temp=temp.next;
                
            }
            newnode=temp.next;
            temp.next=newnode;

        }

        // Display the linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }return count;
        }
        //get element----
        int getAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;

            }return temp.data;
        }

        //delete function---
        void deleteAt(int pos){

        //if list is empty
            if(head==null){
              System.out.println("ll is empty");}

         //if first node----
            if(pos==0){
              head=head.next;return;}

         //delete at middle---
            Node temp=head;
            for (int i = 1;i <=pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
         //if last node deleted---
            if(temp.next==null){
                tail=temp;
            }
                
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        list.insertAtPosition(3,9);
        list.insertAtHead(4);
        list.deleteAt(4);

        list.display();  // ✅ Now it will print
    }
}

