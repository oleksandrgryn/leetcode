package easy.designHashMap706;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

    List<Integer> list;

    public MyHashMap() {
        this.list = new ArrayList<Integer>(10000010);
        for (int i = 0; i < 10000009; i++) {
            list.add(-1);
        }
    }

    public void put(int key, int value) {
        list.set(key, value);
    }

    public int get(int key) {
        return list.get(key);
    }

    public void remove(int key) {
        list.set(key, -1);
    }
}
