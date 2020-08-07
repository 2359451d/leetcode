/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    /* 
    runtime: 100% beats
    memory usage(39.2MB): 31.64% beats    
    */
    public int searchInsert(int[] nums, int target) {
        int mid=0,l=0,r=nums.length-1;
        // binary search
        while (l<=r){
            mid = (l+r)/2;
            if (nums[mid]==target) return mid; // target hit
            if (nums[mid]>target) r = mid-1;// lessen the right range
            if (nums[mid]<target) l = mid+1;// expands the left range
        }
        return l;
    }
}
// @lc code=end

