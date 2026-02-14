import java.util.Stack;

public class revstack {

    public static void printst(Stack<Integer> st){
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
     public static void pushtobot(Stack<Integer> s,int data){
              if(s.isEmpty()){
                  s.push(data);
                  return;
              }
              int top = s.pop();
              pushtobot(s, data);
              s.push(top);
    }
    public static void revstac(Stack<Integer> st){
        if(st.isEmpty()){
          return;
        }
        int top = st.pop();
        revstac(st);
        pushtobot(st,top);


    }
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        revstac(st);
        printst(st);
    }
}
