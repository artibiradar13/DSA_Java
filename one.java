
import java.util.Arrays;
import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        try ( //input size of array
                Scanner sc = new Scanner(System.in)) {
            System.out.println("enter size of array");
            int n= sc.nextInt();
            
            
            //input array
            int arr[]= new int[n];
            System.out.println("enter array");
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt(); 
            }
            
            //search array
            System.out.println("enter element");
            int search=sc.nextInt();
            
            
            countocuurence(arr, search);
            lastoccurence(arr,search);
            Issorted(arr);
            smallandlargeElement(arr);
        }
    }
        
    
    
    
    //ques-----count the number of occurence of a particular element x;
        static int countocuurence(int arr[],int search){
            int count=0;
            for (int i = 0; i < arr.length; i++) {
               if(arr[i]==search){
            count++;}
        } 
        return count;
    }



    //last occurence of an elelment x in a given arrray 
    static int lastoccurence(int arr[],int search){
       int  lastoccurence=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search){
                lastoccurence=i;
            }
            
        } return lastoccurence;
    }


    //check array is sorted or not 
    static boolean Issorted(int arr[]){
        boolean check=true;
        for (int i = 1; i < arr.length; i++){
           if(arr[i]<arr[i-1]){
            check=false;
            break;
           }
        }
        return check;
    }

    //small and largest element in array
    static int[] smallandlargeElement(int arr[]){
        Arrays.sort(arr);
        int ans[]={arr[0],arr[arr.length-1]};
        return ans;
    } 


    //








    
}