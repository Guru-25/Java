package recursion;

public class Q5_Factorial {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int ans=fact(n);
        System.out.println(ans);
    }
}
