package medium;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class M2AddTwoNumbers {
    public ListNode addTwoNumbersMyVersionRepeat(ListNode l1, ListNode l2) {

        ListNode preHead = new ListNode();
        ListNode tail = preHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;
            carry += digit1 + digit2;

            tail.next = new ListNode(carry % 10);
            tail = tail.next;
            carry = carry / 10;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }

        return preHead.next;
    }


    public ListNode addTwoNumbersMyVersion(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode temp = result;
        int carry = 0;


        while (l1.val > -1 || l2.val > -1) {
            carry += l1.val + l2.val;
            temp.val = carry % 10;
            carry = carry / 10;
            if (carry == 1) {
                temp.next = new ListNode(1);
                temp = temp.next;
            }
            if (l1.next == null && l2.next == null) {
                break;
            }
            if (carry == 0) {
                temp.next = new ListNode();
                temp = temp.next;
            }
            if (l1.next == null) {
                l1.val = 0;
            } else {
                l1 = l1.next;
            }
            if (l2.next == null) {
                l2.val = 0;
            } else {
                l2 = l2.next;
            }
        }

        return result;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultPreHead = new ListNode();
        ListNode tail = resultPreHead;
        int carry = 0;


        while (l1 != null || l2 != null || carry != 0) {

            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;

        }
        return resultPreHead.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
