
import java.util.Arrays;
import java.util.HashMap;

public class two_sum {
    public static int[] twoSum(int[] nums,int target){
        int n=nums.length;
        int[] ans={-1};

        //value,index
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int partner =target-nums[i];
            if(mp.containsKey(partner)){
                ans =new int[]{i,mp.get(partner)};
               
                return ans;
            }
            mp.put(nums[i], i);
        }


        return ans;
    }
    public static void main(String[] args) {
       int[] nums={1,2,3,5,4,6};
        int target=3;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
