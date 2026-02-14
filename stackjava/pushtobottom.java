import java.util.*;

public class pushtobottom {
    public static void pushtobot(Stack<Integer> s,int data){
              if(s.isEmpty()){
                  s.push(data);
                  return;
              }
              int top = s.pop();
              pushtobot(s, data);
              s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(2);
        st.push(1);
        pushtobot(st, 10);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
