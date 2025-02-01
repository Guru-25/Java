package recursion;

public class Q8_ProductOfDigits {
    static int productOfDigits(int n){
        if(n==0){
            return 1;
        }
        return n%10 * productOfDigits(n/10);
    }
    public static void main(String[] args) {
        int n=1342;
        int ans=productOfDigits(n);
        System.out.println(ans);
    }
}
