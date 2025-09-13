/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        HashMap<ListNode,Integer> map=new HashMap<>();
        while(temp!=null){
            if(map.containsKey(temp)){ //if previously visited then cycle detected
                return true;
            }
            map.put(temp,1); //Otherwise, mark the current node as visited (put in map).
            temp=temp.next; //Move temp forward.
        }
        return false; //If traversal ends normally(temp==null),return false
    }
}