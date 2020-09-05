/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length-1;// each iteration, find the maximum for ith pos
        
        // dual-pointers, scanning back to front
        m--;
        n--;

        while(n>=0){
            // nums1[m] > nums2[n], maximum, swapping to the i pos
            while(m>=0 && nums1[m]>nums2[n]){
                nums1[i--] = nums1[m--];
            }
            // nums2[n] > nums2[m], maximum, swapping to the i pos
            nums1[i--] = nums2[n--];
        }
    }
}
// @lc code=end

