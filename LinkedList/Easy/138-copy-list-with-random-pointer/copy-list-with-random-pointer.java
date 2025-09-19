/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // Step 1: HashMap to map original nodes → copied nodes
        HashMap<Node, Node> map = new HashMap<>();

        // Step 2: First pass — create new nodes (just values)
        Node p = head;
        while (p != null) {
            // copy only val now
            map.put(p, new Node(p.val));
            p = p.next;
        }

        // Step 3: Second pass — fix pointers
        Node q = head;
        while (q != null) {
            // map.get(q) = copy of q
            // set its next to copy of q.next
            map.get(q).next = map.get(q.next);

            // set its random to copy of q.random
            map.get(q).random = map.get(q.random);

            q = q.next;
        }

        // Step 4: return copy of head
        return map.get(head);
    }
}