
import java.util.Stack;

public class consecutiveSequence {

    public static int[] remove(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            if(st.isEmpty()||st.peek()!=arr[i]){
                st.push(arr[i]);
            }else if(arr[i]==st.peek()){
                if(i==n-1|| arr[i]!=arr[i+1]) st.pop();
            }
        }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr ={1,2,2,3,4,5,5,5,6,7,8,8,9,9,7,4};
        int [] ans =remove(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
