package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class M253MeetingRooms2 {


    public int minMeetingRoomsSeparation(int[][] intervals) {
        int[] startTimes = new int[intervals.length];
        int[] endTimes = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            startTimes[i] = intervals[i][0];
            endTimes[i] = intervals[i][1];
        }

        Arrays.sort(startTimes);
        Arrays.sort(endTimes);

        int rooms = 0;

        for (int i = 0, j = 0; i < startTimes.length; i++){
            if (startTimes[i]<endTimes[j]){
                rooms++;
            } else {
                j++;
            }
        }

        return rooms;
    }

    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

//        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o1 - o2);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));

        queue.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= queue.peek()) {
                queue.poll();
            }

            queue.add(intervals[i][1]);
        }

        return queue.size();
    }


    // brute force
    public int minMeetingRoomsBrute(int[][] intervals) {
//        Arrays.sort(intervals, (a, b) -> b[0] - a[0]);
//        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<Integer> rooms = new ArrayList<>();
        rooms.add(0);

        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < rooms.size(); j++) {
                if (intervals[i][0] >= rooms.get(j)) {
                    rooms.set(j, intervals[i][1]);
                    break;
                }
                if (j == rooms.size() - 1) {
                    rooms.add(intervals[i][1]);
                    break;
                }
            }
        }
        return rooms.size();
    }

    @Test
    public void testMinMeetingRooms() {
        Assert.assertEquals(4, minMeetingRoomsSeparation(new int[][]{{2, 7}, {8, 12}, {11, 30}, {1, 10}, {10, 20}, {3, 19}}));
    }
}
