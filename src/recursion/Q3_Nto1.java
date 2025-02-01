package recursion;

public class Q3_Nto1 {
    static void Nto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n--);
        Nto1(n);
    }
    public static void main(String[] args) {
        int n=5;
        Nto1(n);
    }
}
