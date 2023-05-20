public class Day20
{
     public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length && j<=i+k;j++)
            {
                if(nums[j]==nums[i])
                    return true;
            }
        }
        return false;
    }
}