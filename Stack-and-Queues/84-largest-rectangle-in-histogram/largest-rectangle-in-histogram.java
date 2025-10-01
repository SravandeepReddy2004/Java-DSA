class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack <Integer> st = new Stack();
        int maxArea=0;
        int n = arr.length;
        for (int i=0;i<=n;i++){
            while (!st.empty() && (i == n || arr[st.peek()] >= arr[i])) {
                int height = arr[st.pop()];
                int width = st.isEmpty()? i : i-st.peek()-1;
                maxArea= Math.max(maxArea, width*height);
            }
            st.push(i);
        }
        return maxArea;
    }
}