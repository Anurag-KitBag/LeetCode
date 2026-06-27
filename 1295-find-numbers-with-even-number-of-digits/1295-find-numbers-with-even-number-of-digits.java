class Solution {
    public int findNumbers(int[] nums) {
        int answerCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = countDigits(nums[i]);

            if (digit % 2 == 0) {
                answerCount++;
            }
        }
        return answerCount;
    }

    //step 1 find count digits 
    public static int countDigits(int num) {

        int digits = 0;

        while (num > 0) {
            digits++;
            num /= 10;
        }

        return digits;
    }
}