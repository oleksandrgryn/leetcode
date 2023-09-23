package blit.assessments.week2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListToHashSet {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("BMW");
        linkedList.add("Mahindra");
        linkedList.add("Jaguar");
        linkedList.add("Tata");
        linkedList.add("Ferrari");

        Set<String> hashSet = new HashSet<>(linkedList);
    }
}
