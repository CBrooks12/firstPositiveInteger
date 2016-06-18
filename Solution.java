public class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int prev = 0;
        int i = 0;
        if(nums.length == 0)
            return prev+1;
        for(; i < nums.length; i++)
        {
            if(nums[i]>0)
            {
                prev = nums[i];
                break;
            }
        }
        if(!(prev==0||prev==1))
            return 1;
        if(i>=nums.length)
            return prev+1;
        for(; i < nums.length; i++)
        {
            if(nums[i]!=prev)
            {
                if(nums[i]==prev+1)
                    prev++;
                else
                    return prev+1;
            }
        }
        return prev+1;
    }
}
