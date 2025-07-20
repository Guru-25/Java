public class Pattern {
    public static void main(String[] args) {
      // System.out.println("Hello, World!");
      //            1
      //          6 2
      //       10 7 3
      //    13 11 8 4
      // 15 14 12 9 5
      
      int n=3;
      int start=1;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
          System.out.print("  ");
        }
        int diff=n-i+1;
        int val=start;
        for(int k=1;k<=i;k++){
          System.out.print(val+" ");
          val=val-diff;
          diff++;
        }
        System.out.println();
        start=start+(n-i+1);
      }
      
      
      // 1 6 10 13 15
      // 2 7 11 14
      // 3 8 12
      // 4 9
      // 5
      
      // 1
      // 6 2
      // 10 7 3
      // 13 11 8 4 
      // 15 14 12 9 5
      
      // int n=5;
      // int start=1;
      // for(int i=0;i<5;i++){
      //   for(int j=0;j<n-i;j++){
      //     System.out.print(start + " ");
      //     start=start+(n-j);
      //   }
      //   System.out.println();
      //   start=i+2;
      // }
      
      // int n=5;
      // int start=1;
      // for(int i=1;i<=n;i++){
      //   int diff=n-(i-1);
      //   int val=start;
      //   for(int j=1;j<=i;j++){
      //     System.out.print(val +" ");
      //     val=val-diff;
      //     diff++;
      //   }
      //   System.out.println();
      //   start=start+(n-i+1);
      // }
      
  }
}