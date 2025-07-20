package recursion.permutation;

import java.util.ArrayList;
import java.util.Collections;

public class Q1_Permutation {
    static ArrayList<String> permutation(String p, String up, ArrayList<String> al){
        if(up.isEmpty()){
            al.add(p);
            return al;
        }
        int pLen=p.length();
        char ch=up.charAt(0);
        for(int i=0;i<=pLen;i++){
            String f=p.substring(0,i);
            String s=p.substring(i,pLen);
            permutation(f + ch + s, up.substring(1), al);
        }
        return al;
    }
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> al=permutation("",str, new ArrayList<>());
        Collections.sort(al);
        System.out.println(al);
    }
}
