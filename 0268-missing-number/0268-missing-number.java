class Solution {
    public int missingNumber(int[] nums) {
        
        int arrsum = 0;
        for (int i = 0; i < nums.length; i++) {
            arrsum += nums[i];
        }

        int arrrange = 0;
        for (int i =0; i < nums.length + 1; i++) {
            arrrange += i;
        }

        return arrrange - arrsum;
        
    }
}