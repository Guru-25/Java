package recursion.subset_subsequence_combination;

public class Q2_SkipAString {
    static String skipAString(String str){
        if(str.isEmpty()){
            return str;
        }
        boolean isStartsWith=str.startsWith("apple");
        if(isStartsWith){
            return skipAString(str.substring("apple".length()));
        }
        return str.charAt(0) + skipAString(str.substring(1));
    }
    public static void main(String[] args) {
        String str="bcdapplefg";
        System.out.println(skipAString(str));
    }
}
