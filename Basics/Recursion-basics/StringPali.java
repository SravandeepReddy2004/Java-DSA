import java.util.*;

class StringPali{   
    public static boolean pali(int i, String s) {
        int n=s.length();
        if(i>=n/2)
        return true;
        s = s.toLowerCase();
        if(s.charAt(i)!=s.charAt(n-i-1))
        return false;

        return pali(i+1,s);
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(pali(0,s)){
            System.out.print("It is palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
}
