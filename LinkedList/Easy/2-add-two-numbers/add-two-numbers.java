class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to simplify result building
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        int carry = 0;

        // Loop until both lists are done AND no carry remains
        while(l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            // Take digit from l1 if available
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Take digit from l2 if available
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Add carry from previous addition
            sum += carry;

            // Update carry for next iteration
            carry = sum / 10;

            // Get the last digit (unit place)
            int last_digit = sum % 10;

            // Create new node with that digit
            ListNode newNode = new ListNode(last_digit);

            // Attach to result list
            temp.next = newNode;

            // Move forward
            temp = temp.next;
        }

        // First dummy node was placeholder → skip it
        return dummy.next;
    }
}
