class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0,right=n-1;
        int lmax=0,rmax=0,total=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=lmax){
                    lmax=height[left];
                }
                else{
                    total+=lmax-height[left];
                }
            left++;
            }
            else{
                if(height[right]>=rmax){
                    rmax=height[right];
                }
                else{
                    total+=rmax-height[right];
                }
            right--;
            }
        }
        return total;
    }
}