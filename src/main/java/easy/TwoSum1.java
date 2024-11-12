package easy;

import java.util.Arrays;
import java.util.Hashtable;

public class TwoSum1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }


    // O(n^2)
    public static int[] twoSumSimple(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashTable.containsKey(target - nums[i])) {
                return new int[]{hashTable.get(target - nums[i]), i};
            }
            hashTable.put(nums[i], i);
        }
        return new int[]{};
    }
}
