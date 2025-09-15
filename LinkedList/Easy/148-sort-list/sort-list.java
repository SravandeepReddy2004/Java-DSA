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
    private ListNode merge(ListNode l1,ListNode l2){
        ListNode sorted=new ListNode(0);
        ListNode temp=sorted;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){ //sort
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next; //traverse
        }
        if(l1!=null){
            temp.next=l1;
            l1=l1.next;
        }
        else{
            temp.next=l2;
            l2=l2.next;
        }

        return sorted.next;
    }
    public ListNode sortList(ListNode head) {
        ListNode fast=head,slow=head,prev=null;
        if(head==null||head.next==null){
            return head;
        }
        while(fast!=null && fast.next!=null){// Find the middle of the list
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        // Split the list into two halves
        prev.next=null;                         //head->prev & slow->fast

        // Recursively sort each half
        ListNode right=sortList(slow);
        ListNode left=sortList(head);

        // Merge the sorted halves
        return merge(right,left);
    }
}