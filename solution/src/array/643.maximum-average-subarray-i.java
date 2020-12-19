/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, max_sum=0;
        for (int i = 0; i < k; i++) {
           sum += nums[i];
        }
        max_sum = sum;
        for (int i = k; i < nums.length; i++) {
           sum = sum - nums[i-k] + nums[i];
           max_sum = sum>max_sum ?sum: max_sum;
        }
        return max_sum/k;
    }
}
// @lc code=end

