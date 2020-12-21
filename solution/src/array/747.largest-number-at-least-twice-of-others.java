import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length==1) return 0;

        /* stream solution , not efficient */

        // 
        // var list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        // var max_index = list.indexOf(Collections.max(list));
        // // list.remove(max_index);

        // // var list2 = list.stream().map(each -> each*2 - max_value).collect(Collectors.toList());
        // // var max_diff = list2.stream().mapToInt(Integer::intValue).max().getAsInt();

        // // if (max_diff>0) return -1;
        // // else return max_index;

        // for (int i = 0; i < nums.length; i++) {
        //     if (i!=max_index && nums[i]*2>max_value) return -1;
        // }
        // return max_index;

        int max = 0;
        for (int i=0; i<nums.length;i++){
            if (nums[i]> nums[max]) max=i;
        }

        for (int i=0;i<nums.length;i++){
            if (i!=max && nums[max]< nums[i]*2) return -1;
        }

        return max;
    }
}
// @lc code=end

