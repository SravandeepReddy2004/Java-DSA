class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int area = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && ((i==n) || arr[st.peek()]>=arr[i])){
                int h = arr[st.pop()];
                int w = (!st.isEmpty())?i-st.peek()-1:i;
                area = Math.max(area, h*w);
            }
            st.push(i);
        }
        return area;
    }
}