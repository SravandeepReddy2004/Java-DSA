import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++){                      //if int i=1 then i<=n i++ for simplicity using int i=0;i<n
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        sc.close();
    }
}
