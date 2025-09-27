import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        
        // Initialize all results as -1 (default if no greater element exists)
        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>(); 
        // stack will store *indexes* of elements

        // Traverse the array twice (simulate circular array)
        for (int i = 0; i < n * 2; i++) {
            int curr = nums[i % n]; // current element (circular access)

            // While stack not empty AND current element is greater
            // than the element at index on top of stack
            while (!stack.isEmpty() && nums[stack.peek()] < curr) {
                // Update result for that index
                res[stack.pop()] = curr;
            }

            // Only push indexes from first pass (0..n-1)
            if (i < n) stack.push(i);
        }

        return res;
    }
}
