package zoho.chennai;

public class Q3 {
    public static void main(String[] args) {
        // String s="()()()";
        // String s="(()))((()";
        // String s="(()(";
        // String s=")(((";
        String s=")(";
        int maxi=0;
        int o=0;
        int c=0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)=='(')
                o++;
            else
                c++;
            if(o==c) {
                maxi=Math.max(maxi,2*c);
            }
            else if(c>o) {
                o=c=0;
            }
        }
        o=c=0;
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)=='(')
                o++;
            else
                c++;
            if(o==c) {
                maxi=Math.max(maxi,2*o);
            }
            else if(o>c){
                o=c=0;
            }
        }
        System.out.println(maxi);
    }
}
