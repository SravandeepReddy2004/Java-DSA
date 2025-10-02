class Solution {
    public int maximalRectangle(char[][] matrix) {
        // Edge case: empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // +1 to handle calculations easily (extra 0 at the end)
        int[] heights = new int[cols + 1];  
        int maxArea = 0;

        // Process row by row
        for (char[] row : matrix) {
            
            // Step 1: Build histogram heights
            for (int i = 0; i < cols; i++) {
                // If '1', add to height (extend column upward)
                // If '0', reset height to 0
                heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
            }

            // Step 2: Apply Largest Rectangle in Histogram (stack method)
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < heights.length; i++) {
                // While current height is smaller → compute area
                while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                    int h = heights[stack.pop()];  
                    int w = stack.isEmpty() ? i : i - stack.peek() - 1;  
                    maxArea = Math.max(maxArea, h * w);
                }
                stack.push(i);
            }
        }
        return maxArea;
    }
}
