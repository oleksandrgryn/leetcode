package easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class E2815MaxPairSumInArray {
    public int maxSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(new ArrayList<>());
        for (int num : nums) {
            int maxi = 0;
            int temp = num;
            while (temp > 0) {
                maxi = Math.max(maxi, temp % 10);
                temp /= 10;
            }
            list.get(maxi).add(num);
        }
        int ans = -1;
        for (List<Integer> digitList : list) {
            if (digitList.size() >= 2) {
                digitList.sort((a, b) -> b - a);
//                digitList.sort((a, b) -> Integer.compare(a, b));
//                digitList.sort(Integer::compare);
//                digitList.sort(Comparator.comparingInt(a -> a));
//                Arrays.sort(digitList.toArray());
                int sum = digitList.get(0) + digitList.get(1);
                ans = Math.max(ans, sum);
            }
        }
        System.out.println(ans);
        return ans;
    }

    @Test
    public void testMaxSum() {
        int[] nums = new int[]{51, 71, 17, 24, 42};
        Assert.assertEquals(88, maxSum(nums));
    }
}
