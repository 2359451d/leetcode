import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < numRows; i++) {
            // generate the sub_list for each line
            List<Integer> sub_list = new ArrayList<>();
            int j =0;
            while(j<=i){
                // the first & last element is set to be 1
                if(j==0 ||j==i){
                    sub_list.add(j++,1);
                }else{
                    // other pos is set to be the sum of j-1 & j elements of previous line
                    sum = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    sub_list.add(j++,sum);
                }
            }
            // put the sub_list into the triangle
            result.add(sub_list);
        }
        return result;
    }
}
// @lc code=end

