public class SecondLargestWord {
    public static void main(String[] args) {
        String str="He livesing in Madurai";
        str+=" ";
        int max1start=0;
        int max1end=0;
        int max2start=0;
        int max2end=0;
        int i=0;
        int j=0;
        int maxi=0;
        int totallen=str.length();
        while(i<=j && i<=totallen && j<=totallen){
            if(str.charAt(j)!=' '){
                j++;
            }
            else if(str.charAt(j)==' '){
                int len=j-i;
                if(len>maxi){
                    maxi=len;
                    max2start=max1start;
                    max2end=max1end;
                    max1start=i;
                    max1end=j;
                }else if(len<maxi && len>max2end-max2start){
                    max2start=i;
                    max2end=j;
                }
                if(j+1!=totallen){
                    i=j+1;
                    j++;
                }else{
                    break;
                }
            }
        }
        System.out.println(str.substring(max1start,max1end));
        System.out.println(str.substring(max2start,max2end));
    }
}
