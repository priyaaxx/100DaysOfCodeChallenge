public class Day21
{
     public int missingNumber(int[] nums) 
     {
        int n = nums.length;
        int x = n;
        for(int i=0;i<n;i++){
            x^=i;
            x^=nums[i];
        }
        return x;
    }
}