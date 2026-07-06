class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length <= 1) {
            return nums[0];
        }
        int bestEnding = nums[0];
        int answer = nums[0];
        for(int i = 1; i < nums.length; i++){
            //choice
            int choice1 = nums[i];
            int choice2 = bestEnding + nums[i];

            //update for desired result
            if(choice1 > choice2) {
                bestEnding = choice1;
            }else{
                bestEnding = choice2;
            }

            //Checking is previousanswer stored is maximum than bestending? if yes then update the answer if no than also update the answer by  bestEnding;
            if(answer > bestEnding) {
                answer = answer;
            }else {
                answer = bestEnding;
            }
        }
        return answer;
        
    }
}