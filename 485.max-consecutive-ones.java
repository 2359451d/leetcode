/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        var old_sum=0;
        var new_sum=0;
        for(var each: nums){
            if (each==1) new_sum++;
            else{
                new_sum=0;
            }

            if(new_sum>old_sum) old_sum = new_sum;
        }
        return old_sum;
    }
}
// @lc code=end

