package recursion;

public class Q2_BinarySearch {
    static int binary(int[] arr, int target, int left, int right){
        if(left>right){
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return binary(arr, target, left,mid-1);
        }
        return binary(arr, target, mid+1, right);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,55,66};
        int ans=binary(arr, 55, 0, arr.length-1);
        System.out.println(ans);
    }
}
