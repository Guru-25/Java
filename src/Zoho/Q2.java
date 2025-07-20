public class Q2 {
    public static void main(String[] args) {
        int[][]arr=new int[][]{{1,2,3,4},{1,9,1,2},{1,0,0,1},{0,0,0,1}};
        int r=arr.length;
        int c=arr[0].length;
        int[] ans=new int[r+c-1];
        for (int i=0;i< r;i++) {
            for(int j=0;j<c;j++) {
                ans[i+j]+=arr[i][j];
            }
        }
        // System.out.println(Arrays.toString(ans));
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }
    }
}
