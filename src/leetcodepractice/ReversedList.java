package leetcodepractice;

public class ReversedList {

    class Solution {
        public ListNode reverseList(ListNode head) {

            ListNode prev = null;
            ListNode current = head;

            while (current != null) {
                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            return prev;

        }
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
