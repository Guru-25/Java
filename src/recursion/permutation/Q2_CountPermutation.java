package recursion.permutation;

public class Q2_CountPermutation {
    static int permutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int pLen=p.length();
        char ch=up.charAt(0);
        for(int i=0;i<=pLen;i++){
            String f=p.substring(0,i);
            String s=p.substring(i,pLen);
            count = count + permutationCount(f + ch + s, up.substring(1));
        }
        return count;
    }
    public static void main(String[] args) {
        String str="abc";
        int count = permutationCount("",str);
        System.out.println(count);
    }
}
