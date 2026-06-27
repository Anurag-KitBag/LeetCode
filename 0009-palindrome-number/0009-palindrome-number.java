class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
         int reverse = 0;
        int extractLastDigit = 0;
        for (; temp > 0; temp /= 10) {
            extractLastDigit = temp % 10;
            reverse = reverse * 10 + extractLastDigit;
        }

        if (reverse == x) {
            return true;
        }
        return false;
    }    
}