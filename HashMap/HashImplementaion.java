
import java.util.Iterator;
import java.util.LinkedList;

public class HashImplementaion {
    static class MyHashMap<K,V>{
        public static int Capacity=4;
        public static final float Default_Load_factor=0.75f;
        private int size=0;
        private  class Node{
            K Key;
            V Value;

            public Node(K Key,V Value) {
                this.Key=Key;
                this.Value=Value;
            }
        }
        //array of LInkedList-----
        private LinkedList<Node>[] table;

        //hashfunction---
        private int hash(K key){
            return Math.abs(key.hashCode())%Capacity;
        }

        //put method-----
        public void put(K key,V value){
            int index=hash(key);

            //if key already exists
            for(Node node:table[index]){
                if(node.Key.equals(key)){
                    node.Value=value; //update value
                    return;
                }
            }

            //if dosent exits
            table[index].add(new Node(key,value));
            size++;

            //
            if((double)size/Capacity==Default_Load_factor){
                rehash();
            }
        }

        //get method-------
        public V get(K key){
            int index=hash(key);
            for(Node node: table[index]){
                if(node.Key.equals(key)){
                    return node.Value;
                }
            }
            return null;
        }


        //remove--------
        public void remove(K key){
            int index=hash(key);
            Iterator<Node> it =table[index].iterator();
            while(it.hasNext()){
                Node node=it.next();
                if(node.Key.equals(key)){
                    it.remove();
                    size--;
                    return;
                }
            }
        }

        //rehash
        private void rehash() {
            System.out.println("Rehashing...");
            LinkedList<Node>[] oldTable = table;  // Step 1: Save old table
            Capacity *= 2;                        // Step 2: Double capacity
            table = new LinkedList[Capacity];     // Step 3: Create new table
            for (int i = 0; i < Capacity; i++) {
                table[i] = new LinkedList<>();    // Initialize empty buckets
             }
             size = 0;                             // Reset size
            for (LinkedList<Node> bucket : oldTable) {   // Step 4: Reinsert all keys
                 for (Node node : bucket) {
                    put(node.Key, node.Value);
                 }
             }
        }
        //display elements---
        public void display() {
            for (int i = 0; i < Capacity; i++) {       // Step 1: Go through each bucket
                System.out.print(i + " -> ");          // Print bucket index
                for (Node node : table[i]) {           // Step 2: Traverse linked list
                    System.out.print("[" + node.Key + "=" + node.Value + "] ");
                }
                System.out.println();                  // Move to next line
            }
        }


    }
public static void main(String[] args) {
    MyHashMap<String, Integer> mp=new MyHashMap<>();
    
}
}
