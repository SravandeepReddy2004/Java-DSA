public class SelectionSort{
  public static void SelSort(int a[],int n){
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
             if(a[j]<a[min]){
                 min=j;
             }
        }
        int temp=a[min];
             a[min]=a[i];
             a[i]=temp;
    }
}
public static void main (String[] args)
	{
		int a[]={3,2,1,5,8,4};
		int n=a.length;
		SelSort(a,n);
		for(int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
        }

	}   
}
