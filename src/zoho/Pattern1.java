public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
        int startdiff=n;
        int start=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("   ");
            }
            int rowdiff=n-i;
            int temp=start;
            for(int k=0;k<i+1;k++){
                System.out.print(temp +" ");
                temp=temp-rowdiff;
                rowdiff++;
                
            }
            start+=startdiff;
            startdiff--;
            System.out.println();
        }
    }
}
