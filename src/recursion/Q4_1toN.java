package recursion;

public class Q4_1toN {
    static void _1toN(int n, int m){
        if(n>m){
            return;
        }
        System.out.println(n++);
        _1toN(n,m);
    }
    public static void main(String[] args) {
        int n=5;
        _1toN(1,n);
    }
}
