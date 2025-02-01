package recursion;

public class Q9_ReverseNumber {
    static int reverse(int n, int rev){
        if(n==0){
            return rev;
        }
        return reverse(n/10, rev*10 + n%10);
    }
    public static void main(String[] args) {
        int n=1824;
        int rev=0;
        int res=reverse(n,rev);
        System.out.println(res);
    }
}
