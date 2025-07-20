package skillrack;

import java.util.Scanner;

public class poisonousOyster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        String s1=s[0];
        String s2=s[1];
        int one=0;
        int two=0;
        int three=0;
        int four=0;
        if(s1.equals("fine")){
            one++;
            two++;
        }else{
            one--;
            two--;
        }
        if(s2.equals("fine")){
            one++;
            three++;
        }else{
            one--;
            three--;
        }
    }
}
