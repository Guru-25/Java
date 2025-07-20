public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,6,8};
        int target=4;
        int left = 0, right = arr.length - 1;
        int prevIndex = -1;
        int nextIndex=-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                break;
            } else if (arr[mid] < target) {
                prevIndex = mid;
                left = mid + 1;
            } else {        // else
        //     System.out.println("present");
                nextIndex=mid;
                right = mid - 1;
            }
        }
        // if(prevIndex!=-1)
        System.out.print(arr[prevIndex]);
        // else if(nextIndex!=-1)
        System.out.print(arr[nextIndex]);
        // else
        //     System.out.println("present");
        System.out.println();


    }
    
}
