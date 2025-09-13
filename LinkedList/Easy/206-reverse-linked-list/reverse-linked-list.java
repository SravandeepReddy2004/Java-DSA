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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null){
            ListNode front=head.next; // save next node
            head.next=prev;         // reverse link
            prev=head;       // move prev forward
            head=front;   // move curr forward
        }
        return prev; //After the loop, prev becomes the new head.
    }
}
//By the end, head becomes null (since you reached the end of the list).
//But you haven’t “destroyed” the list, because while moving, you were relinking nodes to point backwards, and keeping track of the reversed list with prev.