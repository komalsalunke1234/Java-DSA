class Solution {
    // public int jump(int[] nums) {
    //     return function(0,0,nums);
    // }
    // public int function(int index,int jumps,int[]nums){
    //     if(index>=nums.length-1){
    //         return jumps;
    //     }
    //     int mini=Integer.MAX_VALUE;
    //     for(int i=1;i<=nums[index];i++){
    //         mini=Math.min(mini,function(index+i,jumps+1,nums));
    //     }
    //     return mini;

     public int jump(int[] nums) {

        int jump=0,left=0,right=0;
        int n=nums.length;
       
        while(right<n-1){
             int farthest=0;
        for(int i=left;i<=right;i++){
            farthest=Math.max(farthest,i + nums[i]);
        }
            left = right + 1;
            right = farthest;

            jump++;
        
        }
        return jump;
     }
}
    