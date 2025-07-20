public class Pattern3_1 {
    public static void main(String[] args) {
        String str="GURURAJ";
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    System.out.print(str.charAt(i)+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
