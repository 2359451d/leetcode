/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0],sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]>sum) sum=nums[i];
            if(sum>max) max = sum;
        }
        return max;
    }
    // or write based on the value of element, if sum>0 then add current value to the sum
    // else if sum<0 then omit previous value
    /* 
    public int maxSubArray(int[] nums) {
        int max = nums[0],sum=0;
        for(int i=0;i<nums.length;i++){
            if (sum>0){
                sum+=nums[i];
            }else{
                sum = nums[i];
            }
            if (sum>max) max=sum;
        }
        return max;
    }
    */
}
// @lc code=end

