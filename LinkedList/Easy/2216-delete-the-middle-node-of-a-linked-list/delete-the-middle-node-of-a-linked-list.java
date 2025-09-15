/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private int len(ListNode head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        return c;
    }
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // if there is 0 or 1 node, return null
        }

        int mid = len(head) / 2; // find mid
        ListNode temp = head;

        // stop exactly at the node before mid
        for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
        }

        // remove middle node
        temp.next = temp.next.next;

        return head;
    }
}
