/*
Duplicate Parentheses......................
Given a balanced expression, find if it contains duplicate parentheses or not. A set of
parentheses are duplicate if the same subexpression is surrounded by multiple
parentheses.

Return a true if it contains duplicates else return false.

example : ( ( (a + (b ) ) ) + ( c + d ) )........true

example : ( ( ( (a ) + (b ) ) + c + d ) )........true

example : ( ( a + b ) + ( c + d ) )..............false

example : ( ( ( a + b ) ) + c ).................true

*/

import java.util.Stack;

public class dubparath {
    public static Boolean isdub(String str){
        Stack<Character> st = new Stack<>();
       for(int i=0;i<str.length()-1;i++){
        char ch = str.charAt(i);
        if(ch==')'){
           int count =0;
           while(st.peek()!='('){
            st.pop();
            count++;
           }
           if(count<1){
            return true;
           }else{
            st.pop();
           }
        }else{
            st.push(ch);
        }
       
       }
        return false;
    }
     public static void main(String args[]){
        String str = "(a())";
       System.out.println(isdub(str));
    }
}
