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
    public ListNode rotateRight(ListNode head, int k) {
        // Edge cases: empty list, single node, or no rotation
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Find the length of the list
        ListNode temp = head;
        int len = 1;  //Start count at 1 because temp already points to the first node.
        while (temp.next != null) {//Leaves temp at the tail node (useful for circular).
            len++;
            temp = temp.next;
        }
        // Step 2: Connect the tail to the head (make it circular)
        temp.next = head;

        // Step 3: Find the new "break point"
        // Effective rotation: k % len (because rotating by len = same list)
        // So the new head is (len - k % len) steps from the beginning
        k = len - (k % len);

        // Step 4: Move temp forward (len - k%len) steps
        while (k-- > 0) { 
            temp = temp.next;// now move pointer, to the kth node
        }

        // Step 5: The new head is temp.next
        head = temp.next;

        // Step 6: Break the circle
        temp.next = null;

        return head;
    }
}
