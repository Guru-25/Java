package recursion;

public class Q11_Count0 {
    static int count0(int n, int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            return count0(n/10,++count);
        }
        return count0(n/10,count);
    }
    public static void main(String[] args) {
        int n=302040;
        int ans=count0(n,0);
        System.out.println(ans);
    }
}
