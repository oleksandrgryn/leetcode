package easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class E217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if (!set.add(num)){
                return true;
            }
        }
        return false;
    }


    @Test
    public void testContainsDuplicate(){
        int[] nums1 = new int[]{1,1,2,3,4};
        int[] nums2 = new int[]{1,7,2,3,4};
        int[] nums3 = new int[]{1,7,2,4,4};
        int[] nums4 = new int[]{1,7,2,4,1};

        Assert.assertTrue(containsDuplicate(nums1));
        Assert.assertFalse(containsDuplicate(nums2));
        Assert.assertTrue(containsDuplicate(nums3));
        Assert.assertTrue(containsDuplicate(nums4));
    }




}
