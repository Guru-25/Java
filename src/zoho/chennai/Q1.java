package zoho.chennai;

public class Q1 {
    public static void main(String[] args) {
        String[] S={"cat","dog","apple"};
        String Q="hellpp";
        java.util.Set<String> qGrams=get(Q);
        int maxi=0;
        String res="No similarity found";
        for(String s:S) {
            java.util.Set<String> sGrams=get(s);
            int similar=0;
            for(String g:sGrams) {
                if(qGrams.contains(g)){
                    similar++;
                }
            }
            if(similar>maxi) {
                maxi=similar;
                res=s;
            }
        }
        if(maxi==0)
            System.out.println("no similar");
        else{
            System.out.println(res);
        }
    }
    public static java.util.Set<String> get(String s) {
        java.util.Set<String> grams=new java.util.HashSet<>();
        for(int i=0;i<s.length()-1;i++) {
            grams.add(s.substring(i,i+2));
        }
        return grams;
    }

}
