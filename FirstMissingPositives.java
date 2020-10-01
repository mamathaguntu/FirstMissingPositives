package FirstMissingPositives;

import java.util.HashSet;

/**
 * FirstMissingPositives
 */
public class FirstMissingPositives {
    public static void main(String[] args) {
        int[] nums = {100000,1000002,-1,1};
        int res = new FirstMissingPositives().firstMissingPositive(nums);
        System.out.println(res);
    }
    public int firstMissingPositive(int[] nums) {
        int res = 1;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i : nums)
        {
            if (i > 0)
                hs.add(i);
        }
       
        while (true)
        {
            if (!hs.contains(res))
            {
                break;
            }
            res +=1;
        }
        return res;
    }
    
}