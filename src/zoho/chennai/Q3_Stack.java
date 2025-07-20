package zoho.chennai;

import java.util.Stack;

public class Q3_Stack {
    public static void main(String[] args) {
        // String s="()()()";
        String s="(()))((()";
        // String s="(()(";
        // String s=")(((";
        // String s=")(";

        int maxi=0;
        int count=0;
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!st.isEmpty()){
                    Character val=st.peek();
                    if(val==')'){
                        count=0;
                    }
                    st.push(ch);
                }
                else 
                    st.push((ch));
            }else{
                if(!st.isEmpty()){
                    Character val=st.peek();
                    if(val=='('){
                        count++;
                        st.pop();
                    }
                    maxi=Math.max(count,maxi);
                }else{
                    count=0;
                }
            }
        }
        System.out.println(maxi*2);
    }
}
