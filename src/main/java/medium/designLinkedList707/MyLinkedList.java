package medium.designLinkedList707;

public class MyLinkedList {

    Node head;
    Node tail;

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

    public void addAtHead(int val) {
        Node newHead = new Node(val);
        tail = tail == null ? newHead : tail;
        newHead.next = head;
        head = newHead;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node newTail = new Node(val);
        tail.next = newTail;
        tail = newTail;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node nodeToBeAdded = new Node(val);
        Node preHead = new Node(-1);
        preHead.next = head;
        Node current = preHead;

        // check if list is empty or have 1 element AND we are adding a node to index 0 which is head
//        if (index == 0 && head != null) {
//            addAtHead(val);
//            return;
//        }

        for (int i = 0; i < index; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }

        if (current == null) {
            return;
        }

        nodeToBeAdded.next = current.next;
        current.next = nodeToBeAdded;

        // if we added a node to the end then we need to update tail
        if (nodeToBeAdded.next == null) {
            tail = nodeToBeAdded;
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return;
        }

        Node preHead = new Node(-1);
        preHead.next = head;
        Node current = preHead;

        for (int i = 0; i < index; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        if (current.next == null) {
            tail = current;
        }
    }

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */