

public class arrayimplementation {
    public static class Stacks{
        private int[] st=new int[5];
        private int idx=0;


        //push elements---
        void push(int x){
            if(isfull()){
                System.out.println("stack is full");
            }
            st[idx]=x;
            idx++;
        }

        //pop elements------
        int pop(){
           if(idx==0){
                System.out.println("stack empty");
                return -1;
            }
            int top=st[idx-1];
            System.err.println(st[idx-1]);
            st[idx-1]=0;
            idx--;
            return top;

        }
        //peek top element----
        int peek(){
            if(idx-1==0){
                System.out.println("stack empty");
                return -1;
            }
            return st[idx-1];
        }
        //display----
        void display(){
            System.out.print("stack is ");
            for(int i=0;i<idx;i++){
                System.out.print(st[i]+" ");
            }       
        }

        //size of array----
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }
        boolean isfull(){
            if(idx==st.length){
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {
        Stacks stack=new Stacks();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("popped element"+stack.pop());
        System.out.println("top element: "+stack.peek());
        stack.display();
        System.out.println("\nstack is empty?"+stack.isEmpty());
        System.out.println("Stack size is " +stack.size());
        System.out.println(stack.isfull());

    }
}
