/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 * 
 * 
 * during each iteration put the element into the Hashtable(map),
 * and check the existence of each element, if exist, return true- duplicates, otherwise return false
 * 
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        var map1 = new HashMap<Integer, Integer>();
        for(int each: nums)
        {
            if(map1.containsKey(each)) return true;
            map1.put(each,1);
        }
        return false;
    }
}
// @lc code=end

