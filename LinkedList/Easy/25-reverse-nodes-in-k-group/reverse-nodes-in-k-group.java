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
        ListNode prev=null,temp=head,curr=head;
        for(int i=0;i<k;i++,temp=temp.next){
            if(temp==null) return head;
        }
        for(int i=0;i<k;i++){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head.next=reverseKGroup(curr,k);
        return prev;
    }
}