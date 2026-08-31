class Solution {
    public int minimumDeletions(int[] nums) {
        int largest=nums[0];
        int smallest=nums[0];

        int minindex=0;
        int maxindex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
                maxindex=i;
            }
            if(nums[i]<smallest){
                smallest=nums[i];
                minindex=i;
            }
        }
     
     int left=Math.min(minindex,maxindex);
     int right=Math.max(minindex,maxindex);

        int r1=right+1;
        int r2=nums.length-left;
        int r3=left+1+nums.length-right;
        return Math.min(r1,Math.min(r2,r3));

    }
}