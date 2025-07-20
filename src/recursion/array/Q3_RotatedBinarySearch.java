package recursion.array;

public class Q3_RotatedBinarySearch {
    static int rotatedBinarySearch(int[] arr, int target,int left, int right){
        if(left>right){
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }

        // is first half sorted
        if(arr[left]<=arr[mid]){
            // is target within 1st half (sorted half)
            if(target>=arr[left] && target<= arr[mid]){
                return rotatedBinarySearch(arr, target, left, mid-1);
            }
            // else: target within 2st half (non sorted half)
            return rotatedBinarySearch(arr, target, mid+1, right);
        }
        // else: second half is sorted
        if(target>=arr[mid] && target<=arr[right]){
            // is target within 2nd half (sorted half)
            return rotatedBinarySearch(arr, target, mid+1, right);
        }
        // else: target within 1st half (non sorted half)
        return rotatedBinarySearch(arr, target, left, mid-1);
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        int target=7;
        System.out.println(rotatedBinarySearch(arr,target,0,arr.length-1));
    }
}
