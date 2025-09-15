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
    public int count(ListNode head) {
        int c = 0;
        ListNode temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = count(head);
        int pos = c - n;

        // Use dummy to simplify head removal
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        for (int i = 0; i < pos&&temp!=null; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;  // skip target node
        return dummy.next;           // return updated head
    }
}
// Input: head = [1], n = 1
// c = 1, pos = 0
// dummy → 1
// Loop runs 0 times → temp = dummy
// temp.next = temp.next.next → dummy skips 1 → null
// Return dummy.next = null → list is now []