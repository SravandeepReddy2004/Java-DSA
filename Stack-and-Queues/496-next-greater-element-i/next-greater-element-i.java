class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length,m = nums2.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int max = -1;

            // find nums1[i] in nums2
            for (int j = 0; j < m; j++) {
                if (nums2[j] == nums1[i]) {
                    // look for next greater element to the right
                    for (int k = j + 1; k < m; k++) {
                        if (nums2[k] > nums1[i]) {
                            max = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            ans[i] = max;
        }
        return ans;
    }
}
