package recursion;
public class RecursionOnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int idx=0;
       printarray(arr, idx);
       System.out.println(max(arr, idx));
        System.out.println(SumOfArray(arr, idx));
        System.out.println(Search(arr, idx, 3));
    }
    //printarray------
    static void printarray(int[]arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(" "+arr[idx]);
        printarray(arr, idx+1);
    }
    //find max of arary-----
    static int  max(int []arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int samllans=max(arr, idx+1);
        return Math.max(arr[idx],samllans);
    }
    //sumof array
    static int SumOfArray(int[]arr,int idx){
    if(idx==arr.length-1){
    return arr[idx];}
    return arr[idx]+SumOfArray(arr, idx+1);
    }
    //search x in a array
    static int Search(int[]arr,int idx,int x){
       
        if(idx==arr.length){
            return -1;}
        if(arr[idx]==x){
                System.out.println(idx);}
       
        return Search(arr, idx+1,x);
    }  
    //findallindices---
    




}
