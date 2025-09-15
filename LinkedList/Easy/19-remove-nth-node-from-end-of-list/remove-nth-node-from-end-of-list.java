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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=new ListNode(0);
        start.next=head; //link to head anyway we gonna print start.next to avoid (0)
        ListNode fast=start,slow=start; //0->1->2 ... start is 0
        for(int i=1;i<=n+1;i++){ //from 1 till just after n as we need to traverse slow too
            fast=fast.next; //as we know start is 0 so i=1 is taken
        }
        while(fast!=null){ //now from n+1 to null
            fast=fast.next;
            slow=slow.next; //slow moves too
        }
        slow.next=slow.next.next; //skip the slow.next which is nth
        return start.next; //to avoid (0)
    }
}