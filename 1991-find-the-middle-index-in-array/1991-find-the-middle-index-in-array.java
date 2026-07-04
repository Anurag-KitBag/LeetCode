class Solution {
    public int findMiddleIndex(int[] nums) {
        //Step1 calculate total sum 
        int totalsum = 0;
        for(int j = 0; j < nums.length; j++) {
            totalsum += nums[j];
        }
        //Step 2: intialze
        int leftsum = 0;
        for(int i = 0; i < nums.length; i++){
            //Step 3 : Find right sum
            int rightsum = 0;
            rightsum = totalsum - leftsum - nums[i];
            
            //Step 4 : check condition
            if(leftsum == rightsum) {
                return i;
            }
            
            //Step 5 : update the leftsum
            leftsum += nums[i];
        }
        
        return -1;
    }
}