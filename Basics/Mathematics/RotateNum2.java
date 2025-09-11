import java.util.Scanner;

public class RotateNum2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int nod = (int) Math.log10(n) + 1;     //count number of digits
        k = k % nod;       //if k is greater than count then it just take the remainder (normalizing)
        if (k < 0) k =k + nod;        //normalizing for negative numbers

        int div = (int) Math.pow(10, k);     //100 divisor eg. 123
        int mult = (int) Math.pow(10, nod - k); //1000 multiplier eg. 45000

        int r = n % div;
        int q = n / div;

        int rotated = r * mult + q;

        System.out.println(rotated);
    }
}
