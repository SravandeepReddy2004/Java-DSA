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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null; // track node before slow
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;      // update prev
            slow = slow.next; // move slow
        }
        prev.next = slow.next; // unlink middle

        return head;
    }
}

