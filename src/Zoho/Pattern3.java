public class Pattern3 {
    public static void main(String[] args) {
        String str="GURU";
        int n=str.length();
        int diff1=n-2;
        int diff2=1;
        int mid=n/2;
        int start=0;
        System.out.println(mid);
        for(int i=0;i<n;i++){
            for(int j=0;j<start;j++){
                System.out.print("1 ");
            }
            if(i<mid){
                start++;
            }else{
                start--;
            }
            System.out.print(str.charAt(i)+" ");
            if(i<mid){
                for(int k=0;k<diff1;k++){
                    System.out.print("2 ");
                }
                diff1-=2;
            } else if(i>mid){
                for(int k=0;k<diff2;k++){
                    System.out.print("3 ");
                }
                diff2+=2;
            }
            if(mid!=i){
                System.out.print(str.charAt(i)+" ");
            }
            System.out.println();
        }
    }
}
