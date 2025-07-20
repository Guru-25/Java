package skillrack;

public class ContainsAlphabet {
    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxkz";
        int flag=0;
        for(char ch:s.toCharArray()){
            flag=flag | (1 << (ch - 'a'));
        }
        if(flag==(1<<26)-1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        System.out.println(Integer.toBinaryString((1<<26)));
    }
}
