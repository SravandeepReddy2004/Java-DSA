import java.util.*;
public class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean prime=true;
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        if (n <= 1) {
            prime = false;
        }

        for (int i = 2; i <n; i++) { // till <n not <=n
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        sc.close();
    }
}