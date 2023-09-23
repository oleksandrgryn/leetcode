package blit.assessments.week2;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Task7maps {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Maths");
        map.put(102, "Science");
        map.put(103, "Computer Applications");
        map.put(104, "Physics");
        map.put(105, "Chemistry");

        System.out.println(map.headMap(102));
        System.out.println(map.tailMap(105));
        System.out.println(map.subMap(102, 104));

        var map2 =map.descendingMap();

        System.out.println(map2);

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        LocalTime myTime = LocalTime.now(zone);
        System.out.println(myTime);


    }
}
