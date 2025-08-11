

public class arrayImplementation {
     public static class QueueA{
        int f=-1;
        int r=-1;
        int size=0;
        int [] arr=new int[100];

        //add element------
        void add(int val){
            if(r==arr.length-1){
                System.out.println("size full");
                return;
            }
            if(f==-1) {
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }

        int remove(){
            if(size==0){return -1;}
            f++;
            size--;
            return arr[f-1];

        }

        int peek(){
            return arr[f];
        }

        void display(){
            if(size==0){System.out.println("queue is empty");}
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return size;
        }

     }
     public static void main(String[] args) {
        QueueA q=new QueueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println("peek element"+q.peek());
        System.out.println("size of queue:"+q.size());
     }
}
