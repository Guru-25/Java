package recursion.subset_subsequence_combination;

public class Q4_ASCIISubsequence {
    static void subsequenceASCII(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subsequenceASCII(p+ch, up.substring(1));
        subsequenceASCII(p+(ch+0), up.substring(1)); // this
        subsequenceASCII(p,up.substring(1));
    }
    public static void main(String[] args) {
        String str="ab";
        subsequenceASCII("",str);
    }
}

