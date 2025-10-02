class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack <Integer> st = new Stack();
        int maxArea = 0;
        int n = arr.length;
        for (int i = 0; i <= n; i++) {   // <= n because we process all + extra at the end
            // Step 1: Pop until current bar is taller
            while (!st.empty() && (i == n || arr[st.peek()] >= arr[i])) {
                int height = arr[st.pop()];   // height of the rectangle
                
                // Step 2: Find width
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                
                // Step 3: Update max area
                maxArea = Math.max(maxArea, width * height);
            }
            
            // Step 4: Push current index
            st.push(i);
        }
        return maxArea;
    }
}
