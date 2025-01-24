import java.util.*;

class oddoccurence {
    public static void main(String[] args){
        int[] arr={1,2,2,3,3,3,1,7};
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        int xr=0;
        for(int n:arr){
            if(n%2==0){
                even.add(n);
            }else{
                odd.add(n);
            }
            xr=xr ^ n;
        }
        int evenxr=0;
        int oddxr=0;
        for(int ei:even){
            evenxr^=ei;
        }
        for(int oi:odd){
            oddxr^=oi;
        }
        System.out.println(evenxr+" "+oddxr);
        


    }
}