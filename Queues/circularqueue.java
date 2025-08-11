public class circularqueue {
    //linkedlist implementation-------
    class LLCQueue{
             
    }


    public static class CQueue{
        int size=0;
        int f=-1;
        int r=-1;

        int[] arr=new int[5];

        void add(int val){
            if(r==arr.length-1){
                r=0;
                arr[0]=val;
                
                return;
            }
            if(size==0) {
                f=r=0;
                arr[0]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }
        int remove(){
            
            if(size==0){
                System.out.println("queue is empty");
            }else if(f==arr.length-1){
                f=0;
            }
                int x=arr[f];
                f++;
            size--;
            System.out.println("size is :" +size);
            return x;
            

        }

        void display(){
            if(size==0){
                System.out.println("empty queue");
            }else if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
        
            }else{
                 for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=f;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        CQueue Q=new CQueue();

        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);

        Q.display();
        Q.remove();
        Q.add(6);
        Q.display();

    }



}
