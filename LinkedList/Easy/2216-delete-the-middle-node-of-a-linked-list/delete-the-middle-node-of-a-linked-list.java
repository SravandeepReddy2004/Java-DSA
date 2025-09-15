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
    private int len(ListNode head){
        if(head==null){
            return 0;
        }
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode temp=head;
        int n=len(head);
        for(int i=0;i<((n/2)-1)&&temp!=null;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}