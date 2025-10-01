class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack <Integer> st = new Stack();
        int maxA= 0;
        int n = arr.length;
        for (int i=0;i<=n;i++) {
            while (!st.empty() && (i == n || arr[st.peek()] >= arr[i])) {
                int height = arr[st.pop()];
                int width = st.isEmpty()? i : i-st.peek()-1;
                maxA= Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }
}