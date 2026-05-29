class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
    String s=Integer.toString(nums[i]);
        int sum=0;
      
        for(char ch: s.toCharArray()){
            int digit = ch - '0';
            sum+=digit;
           
        }
         min = Math.min(min, sum);
        }
        return min;
    }
}