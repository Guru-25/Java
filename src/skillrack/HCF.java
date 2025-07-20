package skillrack;

public class HCF {
    public static int hcf(int a, int b){
        if(b==0){
            return a;
        }
        return hcf(b,a%b);
    }
    public static void main(String[] args) {
        int[] arr={366,60,70,45};
        int gcdOfArr=hcf(arr[0],arr[1]);
        for(int idx=2;idx<arr.length;idx+=2){
            gcdOfArr=hcf(gcdOfArr,arr[idx]);
        }
        System.out.println(gcdOfArr);
    }
}
