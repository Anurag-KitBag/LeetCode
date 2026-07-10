class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //Step 1 : total sum 
        int totalsum = 0;
        for(int ele : nums) {
            totalsum += ele;
        }
        
        int kadane = maximumSubarraysum(nums);
        //Case2:- 
        int circularsubarray = totalsum - minimumSubarraysum(nums);
        //step 2 : find answer
        //Edge case:-
        if(kadane > 0) {
            return Math.max(circularsubarray, kadane);
        }else {
            return kadane;
        }
    }

        //*kadane Algorithum */
    public static int maximumSubarraysum(int[] nums) {
        int bestEnding = nums[0];
        int answer = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int choice1 = nums[i];
            int choice2 = bestEnding + nums[i];

            bestEnding = Math.max(choice1, choice2);

            answer = Math.max(answer, bestEnding);
        }

        return answer;
    }
    
    //*kadane algorithum */
    public static int minimumSubarraysum(int[] nums) {
        int bestEnding = nums[0];
        int answer = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int choice1 = nums[i];
            int choice2 = bestEnding + nums[i];

            bestEnding = Math.min(choice1, choice2);

            answer = Math.min(answer, bestEnding);
        }

        return answer;
    }
}