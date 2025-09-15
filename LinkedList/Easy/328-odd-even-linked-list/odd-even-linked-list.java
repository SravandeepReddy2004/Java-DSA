class Solution {
    public ListNode oddEvenList(ListNode head) {
		if(head==null || head.next==null) return head;
		
        ListNode odd = head; //head (1st) node is odd ind
        ListNode even = head.next; //even is always the next of odd
        ListNode evenHead = even; //store link for later joining the 2 lists together
        
        while(even!=null && even.next!=null){ //as last node will always be even restrict it
            odd.next = even.next; //odd next is even
            odd = odd.next; //traverse odd node
            even.next = odd.next; //just do the same in terms of even
            even = even.next;
        }
        odd.next = evenHead; //link the odd.next to even
        return head;
    } //list head is odd so we can print
}