package recursion;

public class Q1_Fibo {
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        int ans = fibo(7);
        System.out.println(ans);
    }
}
