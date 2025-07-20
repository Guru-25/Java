package recursion.subset_subsequence_combination;

public class Q3_Subsequence {
    static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subsequence(p+ch, up.substring(1));
        subsequence(p,up.substring(1));
    }
    public static void main(String[] args) {
        String str="abc";
        subsequence("",str);
    }
}
