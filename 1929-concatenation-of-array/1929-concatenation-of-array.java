class Solution {
    public int[] getConcatenation(int[] nums) {
        //create the answer array which has 2 *n size;
        int[] ans = new int[2 * nums.length];

        for(int j = 0; j < 2; j++) {
        for(int i = 0; i < nums.length; i++) {
            ans[i + j * nums.length] =  nums[i]; 
        }
        } 

        return ans; 
    }
}