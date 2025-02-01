package codefeast;

public class Pattern {
    public static void main(String[] args) {
//        The program must accept an integer N as the input. The program must print the desired pattern as shown
//        in the Example Input/Output section.
//        Boundary Condition(s): 2 <= N <= 50
//        Input Format: The first line contains N.
//                Output Format: The first N lines contain the desired pattern as shown in the Example Input/Output
//        section.
//                Example Input/Output 1:
//        Input:
//        5
//        Output:
//            1 10 11 20 21
//            2 9 12 19 22
//            3 8 13 18 23
//            4 7 14 17 24
//            5 6 15 16 25
//        Example Input/Output 2:
//        Input:
//        4
//        Output:
//        1 8 9 16
//        2 7 10 15
//        3 6 11 14
//        4 5 12 13
        int n=4;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    System.out.print(i+1+ " ");
                }else if(j%2!=0){
                    ans=(j+1)*n-i;
                    System.out.print(ans+" ");
                }else{
                    ans=ans+(i*2+1);
                    System.out.print(ans+" ");
                }
            }
            System.out.println();
        }
    }
}