package javaProgram;

import java.util.Stack;

public class BalancedParanthesis {

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{' || ch == '('){
                st.push(ch);
            }
            else if(ch == ']' || ch == '}' || ch == ')'){

                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(ch == ']' && top != '['){
                    return  false;
                }
                if(ch == '}' && top != '{'){
                    return  false;
                }
                if(ch == ')' && top != '('){
                    return  false;
                }
            }
        }
        return st.isEmpty();
    }
    
    public static void main(String[] args) {
        String str = "[{()}]]";
        System.out.println(isBalanced(str));

    }
}
