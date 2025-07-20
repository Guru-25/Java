package recursion.array;

public class Q1_SortedArray {
    static boolean fun(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        return arr[idx]<=arr[idx+1] && fun(arr,++idx);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4};
        boolean isSorted=fun(arr,0);
        System.out.println(isSorted);
    }
}
