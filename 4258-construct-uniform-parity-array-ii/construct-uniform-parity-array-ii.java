class Solution {
    public boolean uniformArray(int[] nums) {

        int min = nums[0];
        int minOdd = Integer.MAX_VALUE;

        for (int x : nums) {
            min = Math.min(min, x);

            if (x % 2 != 0) {
                minOdd = Math.min(minOdd, x);
            }
        }

        if (min % 2 != 0) {
            return true;
        }

        for (int x : nums) {
            if (x % 2 != 0 && minOdd >= x) {
                return false;
            }
        }

        return true;
    }
}