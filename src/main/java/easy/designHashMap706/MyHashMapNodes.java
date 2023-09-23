package easy.designHashMap706;

public class MyHashMapNodes {

    Node[] array;

    public MyHashMapNodes() {
        this.array = new Node[10000010];
    }

    public void put(int key, int value) {
        if (array[key] == null) {
            array[key] = new Node(key, value);
        } else {
            array[key].next = new Node(key, value);
        }
    }

    public int get(int key) {
        if (array[key] == null) {
            return -1;
        }
        Node node = array[key];
        while (node.next != null) {
            node = node.next;
        }
        return node.value;
    }

    public void remove(int key) {
        array[key] = null;
//        Node head = array[key];
//        if (head == null) {
//            return;
//        }
//        Node current = new Node(0, 0);
//        current.next = head;
//
//        while (current.next.next != null) {
//            current = current.next;
//        }
//
//        current.next = null;
    }


    class Node {
        int key;
        int value;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
