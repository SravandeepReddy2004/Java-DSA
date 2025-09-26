class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;  // default if no greater element found
            // check next n-1 elements circularly
            for (int j = 1; j < n; j++) {
                int nextIndex = (i + j) % n; // circular move
                if (nums[nextIndex] > nums[i]) {
                    ans[i] = nums[nextIndex];
                    break; // stop at first greater
                }
            }
        }

        return ans;
    }
}
