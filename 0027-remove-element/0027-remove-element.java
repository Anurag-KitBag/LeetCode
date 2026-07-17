class Solution {
    public int removeElement(int[] nums, int val) {
        //case 3 : one store + one scan (2 pointer)
        int pos = 0;
        for(int i = 0; i < nums.length; i++) {
            //i am checking the element which is not equal to val and store it in pos
            if(nums[i] != val) {
                nums[pos] = nums[i];
                pos++;
            } 
        }
        return pos;
    }
}