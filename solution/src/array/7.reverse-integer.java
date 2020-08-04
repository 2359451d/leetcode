/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
// package solution.src.array
class Solution {
    public int reverse(int x) {
         /* 
        Notice: consider that the environment only support 32-bit num. Overflow check at the end would not satisfy it.
        */
        int result = 0;
        while (x != 0) {
            int temp = x % 10;// get the last num
            x /= 10;// wipe off the last num
            // check the overflow
            // OVERFLOW: the num next to last is bigger than that of the MAX or when the digits equate, the last digit is bigger than that of the MAX 
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            // OVERFLOW: the num next to last is smaller than that of the MIN or when the digits equate, the last digit is smaller than that of the MIN 
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            result = result * 10 + temp; // the last num of each iteration shifts left 1 digit(*10) + the last num of current iteration
        }
        return result;
    }
}
// @lc code=end

