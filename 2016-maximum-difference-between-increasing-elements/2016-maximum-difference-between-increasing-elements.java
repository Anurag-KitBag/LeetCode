class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int currentmin = 0;
        int maxdiffrences = -1;

        for(int i = 1; i < nums.length; i++) {
            if (nums[i] <= min) {
                min = nums[i];
            }

            currentmin = nums[i] - min;

            if (currentmin >= maxdiffrences) {
                maxdiffrences = currentmin;
            }
        }
        if (maxdiffrences > 0) {
            return maxdiffrences;
        } else {
            return -1;
        }
    }
}