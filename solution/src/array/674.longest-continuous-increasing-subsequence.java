/*
 * @lc app=leetcode id=674 lang=java
 *
 * [674] Longest Continuous Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        var len = nums.length;
        if (len==0) return 0; 
        int count =1, ans=1;
        for (int i = 0; i < nums.length-1; i++) {
           if (nums[i] >= nums[i+1]){
               count=1;
           }else{
               count++;
           }
           ans = Math.max(count, ans);
        
        }
        return ans;
    }
}
// @lc code=end

