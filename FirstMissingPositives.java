package FirstMissingPositives;

import java.util.HashSet;

/**
 * FirstMissingPositives
 */
public class FirstMissingPositives {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        int res = new FirstMissingPositives().firstMissingPositive(nums);
        System.out.println(res);
    }
    public int firstMissingPositive(int[] nums) {
        int res = 1;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i : nums)
        {
            if (i <= 0)
            {
                continue;
            }
            hs.add(i);
        }
        for (int i: hs)
        {
            if (res == i)
            {
                res += 1;
            }
            else
            {
                break;
            }
        }
        return res;
    }
    
}