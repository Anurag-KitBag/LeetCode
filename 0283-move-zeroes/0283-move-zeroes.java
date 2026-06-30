class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0 || nums.length == 1) {
            return;
        }

        //two pointer case 3 (one Scan + one Store)
        int pos = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                //swap
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;

                pos++;
            }
        }
    }
}