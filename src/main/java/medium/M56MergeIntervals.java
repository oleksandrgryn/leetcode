package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class M56MergeIntervals {
    public static void main(String[] args) {

    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1],interval[1]);
            }
        }


        return merged.toArray(new int[merged.size()][]);
    }
}