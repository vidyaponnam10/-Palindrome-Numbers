public class Solution {
    public boolean isPalindrome(int x) {
    // Step 1: Negative numbers are not palindromes
    // Also, numbers like 10, 100 are not palindromes because their reverse has leading zeros
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10; // Get the last digit
            reversed = reversed * 10 + digit;// Append digit to reversed
            x = x / 10;// Remove last digit from x
        }
        //Check if original x == reversed
    

        return (x == reversed || x == reversed / 10);
    }
}

