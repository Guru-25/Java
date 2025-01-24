package codefeast;

import java.util.*;

public class stringcontains {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a: ");
      String a=sc.nextLine();
      System.out.print("Enter b: ");
      String b=sc.nextLine();
      System.out.print("Enter c: ");
      String c=sc.nextLine();

      String ab=a.concat(b);
      boolean flag=true;
      Map<Character,Integer> hm=new HashMap<>();
      for(char ch:ab.toCharArray()){
        if(hm.get(ch)==null){
          hm.put(ch,1);
        }else{
          hm.put(ch,hm.get(ch)+1);
        }
      }
      for(char ch:c.toCharArray()){
        if(hm.get(ch)==null){
          flag=false;
          break;
        }else{
          hm.put(ch,hm.get(ch)-1);
        }
      }
      if(flag){
        for(int val:hm.values()){
          if(val!=0){
            flag=false;
            break;
          }
        }
      }
      if(flag){
        System.out.println("yes");
      } else{
        System.out.println("no");
      }
  }
}