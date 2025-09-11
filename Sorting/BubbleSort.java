public class BubbleSort {
    static void Sort(int a[]){
        int n=a.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
	public static void main (String[] args)
	{
	    int a[]={2,4,1,5,3,6};
	    Sort(a);
	    for(int i=0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
	}
}
