package recursion.subset_subsequence_combination;

public class Q1_SkipACharacter {
    static String skipAChar(String str, String res){
        if(str.isEmpty()){
            return res;
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            return skipAChar(str.substring(1),res);
        }
        return skipAChar(str.substring(1),res+ch);
    }

    static String skipAChar2(String str){
        if(str.isEmpty()){
            return str;
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            return skipAChar2(str.substring(1));
        }
        return ch + skipAChar2(str.substring(1));
    }
    public static void main(String[] args) {
        String str="baccad";
        System.out.println(skipAChar(str," "));
        System.out.println(skipAChar2(str));
    }
}
