import java.util.*;

public class NumOccur
{
    public static int freq(int[] a,int n){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                count++;
            }
        }
        return count;
    }
	public static void main (String[] args)
	{
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int[] a={1,2,3,2,4,4,4,8,8};

        System.out.print(freq(a,k));
	}
}
