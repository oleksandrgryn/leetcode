package medium.designLinkedList707;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void testDeleteAtIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        // created list 3-5-7-9
        myLinkedList.addAtHead(9);
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(5);
        myLinkedList.addAtHead(3);

//        // my mistake
        myLinkedList.deleteAtIndex(5);
//        myLinkedList.addAtIndex(5, 5);

        // deleting index 3 (tail) which leads to 3-5-7 and new tail
        myLinkedList.deleteAtIndex(3);
        Assert.assertNull(myLinkedList.tail.next);
        Assert.assertEquals(7, myLinkedList.tail.val);

        // deleting index 1 which leads to 3-7 and head properly connected to the tail since we have just 2 nodes
        myLinkedList.deleteAtIndex(1);
        Assert.assertEquals(myLinkedList.tail, myLinkedList.head.next);

        // nothing happens, still 3-7
        myLinkedList.deleteAtIndex(2);
        Assert.assertEquals(myLinkedList.tail, myLinkedList.head.next);


        // deleting index 0 which leads to -7- and tail being a new head
        myLinkedList.deleteAtIndex(0);
        Assert.assertEquals(myLinkedList.head, myLinkedList.tail);
        Assert.assertEquals(7, myLinkedList.head.val);

    }

    @Test
    public void testAddAtIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        // created list 3-5-7
        myLinkedList.addAtIndex(0, 7);
        myLinkedList.addAtHead(5);
        myLinkedList.addAtHead(3);

        // inserting 4 at index 1 which leads to 3-4-5-7
        myLinkedList.addAtIndex(1, 4);

        // inserting nodes at indexes -5 and 10, list remains the same
        myLinkedList.addAtIndex(-5, -55);
        myLinkedList.addAtIndex(10, 55);

        // inserting val 9 at index 4 (we have only 0-3), list becomes 3-4-5-6-9
        myLinkedList.addAtIndex(4, 9);

        Assert.assertEquals(3, myLinkedList.get(0));
        Assert.assertEquals(4, myLinkedList.get(1));
        Assert.assertEquals(5, myLinkedList.get(2));
        Assert.assertEquals(7, myLinkedList.get(3));
        Assert.assertEquals(9, myLinkedList.get(4));
        Assert.assertEquals(-1, myLinkedList.get(5));

        // inserting val 1 at index 0, list becomes 1-3-4-5-6-9
        myLinkedList.addAtIndex(0, 0);
        Assert.assertEquals(0, myLinkedList.head.val);

    }

    @Test
    public void testAddTail() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7);
        Assert.assertEquals(7, myLinkedList.tail.val);
        Assert.assertEquals(myLinkedList.head, myLinkedList.tail);
        Assert.assertNull(myLinkedList.head.next);

        myLinkedList.addAtTail(9);
        Assert.assertEquals(9, myLinkedList.tail.val);
        Assert.assertEquals(myLinkedList.head.next.val, myLinkedList.tail.val);
    }

    @Test
    public void testGet() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(5);
        myLinkedList.addAtHead(3);
        Assert.assertEquals(3, myLinkedList.get(0));
        Assert.assertEquals(5, myLinkedList.get(1));
        Assert.assertEquals(7, myLinkedList.get(2));
        Assert.assertEquals(-1, myLinkedList.get(3));
        Assert.assertEquals(-1, myLinkedList.get(99));
        Assert.assertEquals(-1, myLinkedList.get(-99));
    }

    @Test
    public void testAddAtHead() {
        int expectedHeadValue = 7;
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(7);
        Assert.assertEquals(expectedHeadValue, myLinkedList.head.val);
    }

}
