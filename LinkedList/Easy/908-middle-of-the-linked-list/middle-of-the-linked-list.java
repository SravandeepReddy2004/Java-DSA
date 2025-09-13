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
    public ListNode middleNode(ListNode head) {
        // Initialize two pointers
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;// Move fast by 2 steps and slow by 1 step
            slow = slow.next;
        }
        // When fast reaches end, slow will be at the middle
        return slow;
    }
}
//fast != null → ensures we haven’t passed the end.

//fast.next != null → ensures fast.next.next won’t cause a NullPointerException.

//slow != null → not strictly needed (because if head is not null, slow will always stay valid). You could remove this and it’d still work.