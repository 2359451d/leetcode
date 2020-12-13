/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 * 
 * Dynamic Programming
 * 
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer result = null;
        for (var num : nums) {
            if(count==0) result = num;
            count += (num==result) ? 1 : -1;
        }
        return result;
    }
}
// @lc code=end

