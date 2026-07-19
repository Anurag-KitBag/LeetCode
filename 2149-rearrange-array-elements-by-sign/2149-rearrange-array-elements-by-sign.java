class Solution {
    public int[] rearrangeArray(int[] nums) {
        //We create the new answerarray of sized nums
        int[] ans = new int[nums.length];

        //now intizitlation of postiveindex and negativeindex
        int posindex = 0;
        int negindex = 1;

        //we traverse the original array 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                //store in postive index
                ans[posindex] = nums[i];
                //increment the positive index position
                posindex += 2;
            }else {
                ans[negindex] = nums[i];
                negindex += 2;
            }
        }
        return ans;
    }
}