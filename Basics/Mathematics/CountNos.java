import java.util.Scanner;

public class CountNos{
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.print(count);
        sc.close();
    }
}
