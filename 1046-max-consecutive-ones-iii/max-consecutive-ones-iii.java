class Solution {
    public int longestOnes(int[] nums, int k) {

        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            int zeroCount = 0;

            for (int j = i; j < nums.length; j++) {

                if (nums[j] == 0) {
                    zeroCount++;
                }

                // More than k zeros cannot be converted
                if (zeroCount > k) {
                    break;
                }

                int currentLen = j - i + 1;

                maxLen = Math.max(maxLen, currentLen);
            }
        }

        return maxLen;
    }
}