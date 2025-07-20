package zoho.chennai;

import java.util.ArrayList;
import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int[][] arr=new int[][]{
            {1,3},
            {6,9},
            {9,16},
            {3,5}
        };
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j][0]>arr[j+1][0]) {
                    int[] temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int[] interval={4,16};
        int start=interval[0];
        // int[][] res=new int[arr.length][2];
        ArrayList<int[]> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(start<arr[i][0]){
                al.add(interval);
            }
            al.add(arr[i]);
        }

        ArrayList<int[]>ans=new ArrayList<>();
        for(int[] a:al) {
            if(ans.isEmpty() || ans.get(ans.size()-1)[1]<a[0]) {
                ans.add(a);
            } 
            else {
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],a[1]);
            }
        }
        for (int[] temp:ans) {
            System.out.print(Arrays.toString(temp));
        }
    }
}
