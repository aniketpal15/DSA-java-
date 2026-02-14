
import java.util.*;
public class revstring {

    public static String revstr(String str){
        Stack<Character> st = new Stack<>();
        StringBuilder newstr = new StringBuilder("");
        int i=0;
        while(i<str.length()){
            st.push(str.charAt(i));
            i++;
        }
        while(!st.isEmpty()){
            newstr.append(st.pop());
        }
        return newstr.toString();
    }
    public static void main(String args[]){
        String str = "aniket";
        System.out.println(str);
        System.out.println(revstr(str));
    }
}
