class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(currentsum+nums[i]>nums[i])
            {
                currentsum+=nums[i];

            }
            else{
                currentsum=nums[i];
            }
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;
    }
}