package easy;

import java.util.HashMap;
import java.util.Map;

public class E26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public int removeDuplicatesMineSlower(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
