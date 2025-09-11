import java.util.Scanner;
public class Rev {
    public static int Rev1(int n){
        int rev=0,rem;
        while(n!=0){
            rem=n%10;
            rev=rem+rev*10;
            n=n/10;
        }
        return rev;
    }

    public static void Rev2(int n){
        int rev=0;
        while(n!=0){
            rev=n%10;
            System.out.print(rev);    // V
            n=n/10;              // we can also ^
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(Rev1(n)+"\n");
        Rev2(n);
        sc.close();
    }
}
