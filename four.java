import java.util.Arrays;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array:");
            int size = sc.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter array elements (0s and 1s):");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            Sortzeors(arr);
            System.out.println("After counting method: " + Arrays.toString(arr));

      
            sortzerosandones(arr);
            System.out.println("After two-pointer method: " + Arrays.toString(arr));
            PrefixQueries(arr);
            PrefixSum(arr);
            PREfixSum(arr);
        }
    
    
    
      }

    static void Sortzeors(int[] arr) {
        int zeros = 0;
        for (int num : arr) {
            if (num == 0) zeros++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i < zeros) ? 0 : 1;
        }
    }

    static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int [] sortzerosandones(int []arr){
      int left=0;int right=arr.length-1;
      while(left<right){
         if(arr[left]==1&&arr[right]==0){
            Swap(arr,left,right);
            left++;
            right--; 
         }
        

   }return arr;


   }
   //PrefixSum-------new array
   static int[] PrefixSum(int []arr){
      int n=arr.length;
      int [] pref=new int[n];
      pref[0]=arr[0];
      for (int i = 1; i < n; i++) {
          pref[i]=pref[i-1]+arr[i];

      }
      return pref;

   }
   //without new array-------
   static int[] PREfixSum(int[]arr){
      int n=arr.length;
      
      for (int i = 1; i < n; i++) {
          arr[i]=arr[i-1]+arr[i];
      }
      return arr;
   }
   //with queries q----
   static void PrefixQueries(int []arr){
      int[] pref=PREfixSum(arr);
      try (Scanner sc = new Scanner(System.in)) {
        int q= sc.nextInt();
          while(q-->0){
             System.out.println("enter range");
             int l=sc.nextInt();
             int r=sc.nextInt();

             int sum;
             if (l == 0) {
                 sum = pref[r];  // From start
             } else {
                 sum = pref[r] - pref[l - 1];  // Normal case
             }
 
             System.out.println("Sum = " + sum);
          }
    } 
   }



}


