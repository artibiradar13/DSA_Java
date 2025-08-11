
import java.util.HashMap;
import java.util.Map;

public class Basics {
//---unordered but unique pairs(no duplicate keys but values can be)
    static void HashMApmethods(){
        //syntax--------
        Map<String,Integer> mp=new HashMap<>();

        //add elements----
        mp.put("Akash", 21);
        mp.put("kritika", 24);
        mp.put("Ansh", 26);
        mp.put("madhav", 21);
        mp.put("Arti", 22);

        //get value of a key------
        System.out.println("value :"+mp.get("Akash"));

        //changing /updating value of key----
        mp.put("Akash", 21);

        //removing pair pf a key in a hashmap----
        System.out.println(mp.remove("Akash"));

        //chaecking if a key is in hashmap
        System.out.println(mp.containsKey("kritika"));

        // adding a new entry only if new key doesn't exist
        mp.putIfAbsent("yash", 43);
        //get all key in the hashmap-----
        System.out.println(mp.keySet());
        //get all vaalues---
        System.out.println(mp.values());
        //get all entries---
        System.out.println(mp.entrySet());
        //traversing all entries of hashmap---multiple methods
        for(String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }    
    }

    static void MaxFreq(int[] arr){
        Map<Integer,Integer> freq=new HashMap<>();
        for(int e:arr){
            if(!freq.containsKey(e)){
                freq.put(e, 1);
            }else{
                freq.put(e,freq.get(e)+1 );
            }
        }
        int maxfreq=0;
        int maxelement=0;
        for(int key:freq.keySet()){
            if(freq.get(key)>maxfreq){
                maxfreq=freq.get(key);
                maxelement=key;
            }
        }
        System.out.println(maxfreq+" max freq");
        System.out.println(maxelement);

    }
    public static void main(String[] args) {
      //  HashMApmethods();
        int[] arr={1,2,1,1,2,3,4,5};
        MaxFreq(arr);

        
    }

}
