import jdk.javadoc.internal.doclets.toolkit.builders.SerializedFormBuilder;

/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        // single pointer solution
        // better performance while use in less repeatable situation
        int size = nums.length;
        int i = 0;
        while (i<size){
            // check current element ?= val
            // swap current element with the last one, if equals
            if (nums[i]==val){
                nums[i] = nums[size-1];
                size--;// decrement the size, to shrink the checking range
            }else{
                i++;
            }
        }
        return size;
    }
}
// @lc code=end

