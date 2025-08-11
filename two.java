import java.util.Scanner;
public class two {

public static void main(String[] args) {
    try (//input size
    Scanner sc = new Scanner(System.in)) {
        System.out.println("enter size of array");
        int size= sc.nextInt();
        
        //input array
        int arr[]=new int[size];
        System.out.println("enter array");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }

        //input targetsum------
        System.out.println("enter target sum");
        int sum=sc.nextInt();


        System.out.println("Two Sum Pair Count = " + twosum(arr, sum));
        System.out.println("Triplets Count = " + triplets(arr, sum));
        System.out.println("Unique Element = " + unique(arr.clone()));  // Use clone to avoid mutation
        System.out.println("Max Element = " + max(arr));
        System.out.println("Second Max Element = " + secondmax(arr.clone()));  // clone to avoid modifying array
        System.out.println("First Repeating Element = " + firstrepeating(arr));

    }
}



//count the pair of two numbers sum. 
 static int twosum(int arr[],int sum){
    int ans=0;
    for (int i = 0; i < arr.length; i++) {
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==sum){
                ans++;
            }
        }
        
    } return ans;

 }
 //count the number of triplets of sum =x
 static int triplets(int arr[],int sum){
    int ans=0;
    for (int i = 0; i < arr.length; i++) {
        for(int j=i+1;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==sum){
                    ans++;    
                }
            }
        }
    } return ans;       

 }



//find unique element
 static int unique(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;

            }
        }
    }
    int ans =-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<0){
            ans=arr[i];
        }
    }return ans;
 }



 // find max value in array
 static int max(int []arr){
    int max=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
        
    }return max;
 }
 //find second max value in array
 static int secondmax(int arr[]){
    int max=max(arr);
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==max){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    int secondMax=max(arr);
    return secondMax;
 }




 //find first repeating in array
 static int firstrepeating(int arr[]){
    
    for (int i = 0; i < arr.length; i++) {
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                return arr[i];
                
            }
            
        }
        
    }
    return -1;
 }


 
}
