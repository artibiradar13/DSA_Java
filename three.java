import java.util.Arrays;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
         try (//input size
    Scanner sc = new Scanner(System.in)){
        System.out.println("enter size of array");
        int size= sc.nextInt();
        
        //input array
        int arr[]=new int[size];
        System.out.println("enter array");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

        //input k rotation------
        System.out.println("enter k for rotation");
        int k=sc.nextInt();

        int[] reversed = ReverseArray(arr, size);
        System.out.println("Reverse of array using new array: " + Arrays.toString(reversed));

        ReverseWithoutnewArray(arr);
        System.out.println("Reverse of array using swap: " + Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("rotate by k"+Arrays.toString(arr));
        rotateinplace(arr, k);
        System.out.println("rotate inplace" +Arrays.toString(arr));
    }
    }
    
    //swap array---------1 method
    static void SwapElement(int[] arr,int i,int j){ 
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    
    //ReverseArraay--------1 method(new array)
    static int[] ReverseArray(int arr[],int size){
        int []ans= new int[size];
        int j=0;
        for(int i=size-1;i>=0;i--){
         ans[j++]=arr[i];  
        }

        return ans; 

    }


    //REverseArray-------2 method(in-place)
    static void ReverseWithoutnewArray(int arr[]){
        int i=0;int j=arr.length-1;
        while(i<j){
            SwapElement(arr,i,j);
            i++;
            j--;

        }
      

    }


    // rotate array by k 
    static int[] rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int [] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
    
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }

    //rotate by k ---inplace
    static int[] rotateinplace(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
        Reverse(arr,0,n-1);//entire array

        return arr;

    } 
    static void Reverse(int[] arr,int i, int j){
        while(i<j){
            SwapElement(arr, i, j);
            i++;
            j--;
        }
    }
}
