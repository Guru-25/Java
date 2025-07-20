package skillrack;
import java.util.*;

// https://atcoder.jp/contests/abc393/tasks/abc393_c

public class makeItSimple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Map<Integer, ArrayList<Integer>> hm=new HashMap<>();
        for(int node=1;node<=n;node++){
            hm.put(node,new ArrayList<>());
            hm.get(node).add(node);
        }
        int count=0;
        for(int edges=1;edges<=m;edges++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            if(hm.get(v1).contains(v2)){
                count++;
            }else{
                hm.get(v1).add(v2);
                if(hm.get(v2).contains(v1)){
                    count++;
                }else{
                    hm.get(v2).add(v1);
                }
            }
        }
        System.out.println(count);
    }
}
