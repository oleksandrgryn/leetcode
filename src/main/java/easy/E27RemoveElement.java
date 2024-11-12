package easy;

import org.junit.Assert;
import org.junit.Test;

public class E27RemoveElement {

    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public int removeElementMinimal(int[] nums, int val) {
        int result = nums.length;
        for (int num : nums) {
            if (num == val) {
                result--;
            }
        }

        return result;
    }

    @Test
    public void testRemoveElement() {
        int[] nums = new int[]{1, 1, 2, 3, 4, 5, 5, 7, 7, 6, 8, 8, 8, 8, 22, 21, 25, 25, 25, 25, 25};
        Assert.assertEquals(19, removeElement(nums, 1));
        Assert.assertEquals(20, removeElement(nums, 2));
        Assert.assertEquals(21, removeElement(nums, 99));
        Assert.assertEquals(13, removeElement(nums, 25));

        int[] nums2 = new int[]{0,1,2,2,3,0,4,2};
        Assert.assertEquals(5, removeElement(nums2, 2));

    }
}
