package medium.lruCache146;

public class LRUCache {

    MyLinkedList linkedList;
    Node[] array;

    public static void main(String[] args) {
        var newCache = new LRUCache(1);
        newCache.put(2, 1);
        System.out.println(newCache.get(2));
        newCache.put(3, 2);


    }


    public LRUCache(int capacity) {
        linkedList = new MyLinkedList(capacity);
        array = new Node[10001];
        for (int i = 0; i < 10001; i++) {
            array[i] = new Node(-1);
        }
    }

    public int get(int key) {
        if (array[key].val != -1) {
            linkedList.moveToHead(array[key]);
        }
        return array[key].val;
    }

    public void put(int key, int value) {
        if (array[key].val >= 0) {
            array[key].val = value;
            linkedList.moveToHead(array[key]);
        } else {
            Node newNode = linkedList.addAtHead(value);
            array[key] = newNode;
        }
    }


    class MyLinkedList {

        int capacity;
        Node head;
        Node tail;

        public MyLinkedList(int size) {
            this.capacity = size;
        }

        public int get(int index) {
            Node preHead = new Node(-1);
            preHead.next = head;
            Node current = preHead;
            for (int i = 0; i <= index; i++) {
                current = current.next;
                if (current == null) {
                    return -1;
                }
            }
            return current.val;
        }

        public Node addAtHead(int val) {

            if (capacity > 0) {
                capacity--;
            } else {
                deleteTail();
            }

            Node newHead = new Node(val);
            if (head != null) {
                newHead.next = head;
                head.previous = newHead;
            }
            if (tail == null) {
                tail = newHead;
            }
            head = newHead;
            return head;
        }

        public void deleteTail() {
            tail.val = -1;
            tail = tail.previous;
        }

        public void moveToHead(Node node) {
            if (node == head) {
                return;
            }
            if (node == tail) {
                tail = tail.previous;
            } else {
                node.previous.next = node.next;
                node.next.previous = node.previous;
            }
            node.next = head;
            head.previous = node;
            head = node;
        }
    }

    class Node {
        int val;
        Node next;
        Node previous;

        public Node(int val) {
            this.val = val;
        }
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
