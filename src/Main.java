public class Main {
    public static void main(String[] args) {
        int n=3;
        int x=2;
        int res=1;
        while(n>0){
            res*=x;
            n--;
        }
        System.out.println(res);
    }
}