package codefeast;

import java.util.Scanner;

public class Fibo {
//    Get an array of numbers, print the running sum where each element is the sum of all previous elements
//    Input format:
//            [1, 2, 3, 4]
//    Output format:
//            [1, 3, 6, 10]
//    Sample Input:
//            2 4 5 10 6
//    Sample Output:
//            2 6 11 21 27
//    Sample Input:
//            3 8 1 9 6 2 9
//    Sample Output:
//            3 11 12 21 27 29 38
//    Sample Input:
//            0 1 1 1
//    Sample Output:
//            0 1 2 3

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for (int j : arr) {
            ans += j;
            System.out.print(ans + " ");
        }
    }
}
