import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        // notice that each row has rowIndex+1 elements in total
        List<Integer> res = new ArrayList<>(rowIndex+1);
        int sum = 0;
        for (int i = 0; i <= rowIndex; i++) {
            res.add(1);
            // reversely insert the element based on the previous row's sum
            // i=2,j=1. sum= [j-1] + [j]
            for (int j = i-1; j>0; j--) {
                sum = res.get(j-1) + res.get(j);
                res.set(j,sum);
            }
        }
        return res;
    }
}
// @lc code=end

