/*
 * @lc app=leetcode id=628 lang=java
 *
 * [628] Maximum Product of Three Numbers
 */

// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        var len = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[len-1] * nums[len-2] * nums[len-3], nums[0] * nums[1] * nums[len-1]);
    }
}
// @lc code=end

