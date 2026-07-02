class Solution {
    public void rotate(int[] nums, int k) {
        //edge case 
        k %= nums.length;
        //Step 1 reverse the whole array.
        reverseLogic(nums, 0, nums.length - 1);

        //Step 2 : reverse the kth element
        reverseLogic(nums, 0, k - 1);

        //Step 3 : reverse the non k th element 
        reverseLogic(nums, k, nums.length - 1);
    }
        public static void reverseLogic(int[] nums, int start, int end) {
            //reverse logic
            int i = start;
            int j = end;

            while(i <= j) {
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;

            }
        }
    
}