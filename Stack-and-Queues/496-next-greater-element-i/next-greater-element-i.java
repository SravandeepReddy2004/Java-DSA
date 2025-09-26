class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[10001]; // map each value → its next greater
        Stack<Integer> stack = new Stack<>();

        // Step 1: Process nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            // pop smaller or equal elements from stack
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            // if stack is empty → no greater element, else top is next greater
            nextGreater[nums2[i]] = stack.isEmpty() ? -1 : stack.peek();

            // push current number into stack
            stack.push(nums2[i]);
        }

        // Step 2: For each number in nums1, look up its next greater element
        // (already precomputed from nums2) and store it in the result.
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreater[nums1[i]];
        }
        return nums1;
    }
}
