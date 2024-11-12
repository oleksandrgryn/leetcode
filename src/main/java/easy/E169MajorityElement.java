package easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class E169MajorityElement {


    public int mooreVotingAlgorithm(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : nums) {
            map.merge(key, 1, Integer::sum);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    @Test
    public void testMajorityElement() {
        int[] nums1 = new int[]{3, 2, 3};
        int[] nums2 = new int[]{2, 2, 1, 1, 1, 2, 2};

        Assert.assertEquals(3, majorityElement(nums1));
        Assert.assertEquals(2, majorityElement(nums2));
    }
}
