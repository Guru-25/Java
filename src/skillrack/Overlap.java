public class Overlap {
    public static void main(String[] args) {
        int[][] arr=new int[4][2];
        arr[0]=new int[]{1,3};
        arr[1]=new int[]{2,6};
        arr[2]=new int[]{5,10};
        arr[3]=new int[]{15,18};

        int[][] ans=new int[arr.length][2];
        ans[0]=arr[0];
        int flag=0;
        for(int i=1;i<arr.length;i++){
            int prevLast=ans[flag][1];
            int curFirst=arr[i][0];
            if(curFirst<=prevLast){
                ans[flag][1]=Math.max(ans[flag][1],arr[i][1]);
            }else{
                flag++;
                ans[flag]=arr[i];
            }
        }
        for(int i=0;i<=flag;i++){
            System.out.print("["+ans[i][0]+", "+ans[i][1]+"]"+", ");
        }

    }
}
