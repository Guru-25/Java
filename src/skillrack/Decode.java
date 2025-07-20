public class Decode {
    public static void main(String[] args) {
        String str="2[abc]3[cd]ef";
        int i=0;
        int j=0;
        int len=str.length();
        StringBuilder sb=new StringBuilder();
        while(i<=j && i<len && j<len){
            char ch=str.charAt(j);
            if(!Character.isDigit(ch)){
                sb.append(str.charAt(i));
                i++;
                j++;
            }else{
                int count=ch-'0';
                if(str.charAt(i+1)=='['){
                    while(str.charAt(j)!=']'){
                        j++;
                    }
                    for(int k=0;k<count;k++){
                        sb.append(str.substring(i+2, j));
                    }
                    if(j+1!=len){
                        i=j+1;
                        j=i;
                    }else{
                        break;
                    }
                }else{
                    for(int k=0;k<count;k++){
                        sb.append(str.charAt(j+1));
                    }
                    if(i+2!=len){
                        i=i+2;
                        j=j+2;
                    }else{
                        break;
                    }
                }
            }
        }
        System.out.println(sb.toString());

    }
}
