class RevArray{
   //Function to reverse array using recursion
   public static void reverseArray(int arr[], int l, int r) {
      if (l < r) { // swaps till reaches middle                 1,2,"3",4,5   as swapping middle is not possible
         int temp = arr[l];
         arr[l] = arr[r];
         arr[r] = temp;
         reverseArray(arr, l + 1, r - 1);
      }
   }
   public static void main(String[] args) {
      int n = 5;
      int arr[] = { 5, 4, 3, 2, 1};
      reverseArray(arr, 0, n - 1);
      for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
      }
      
   }
}