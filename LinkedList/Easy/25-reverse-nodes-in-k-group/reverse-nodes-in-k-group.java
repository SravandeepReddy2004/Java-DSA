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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = null;    // used for reversing
        ListNode temp = head;    // used for checking group size
        ListNode curr = head;    // current node during reversal

        // Step 1: Check if there are at least k nodes left in the list
        // We move 'temp' k steps forward, if we run out (null), no reversal
        for (int i = 0; i < k; i++, temp = temp.next) {
            if (temp == null) return head; // not enough nodes → return as-is
        }
        // Step 2: Reverse exactly k nodes
        for (int i = 0; i < k; i++) {
            temp = curr.next;     // save next node (so we don't lose the rest of list)
            curr.next = prev;     // reverse current node’s pointer
            prev = curr;          // move 'prev' forward
            curr = temp;          // move 'curr' forward
        }

        // Step 3: 'head' is now the tail of this reversed group
        // Connect it to the result of recursively reversing the remaining nodes
        head.next = reverseKGroup(curr, k);

        // Step 4: Return 'prev' which is the new head of this reversed group
        return prev;
    }
}
