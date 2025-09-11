//functional Recursion
class Sum{
    static int func(int n){
            if(n==0){
                return 0;
            }
            return n+func(n-1);
    }
    public static void main(String[] args) {
       int n = 10;
       System.out.println(func(n));
       
    }
}
