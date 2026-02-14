//Stock Span Problem........................

import java.util.Stack;

public class Stockspanprb {
    public static void stckspan(int stock[],int span[]){
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);
        for(int i = 1;i<stock.length;i++){
            while(!st.empty() && stock[i]>stock[st.peek()]){
                st.pop();
            }
            if(st.empty()){
               span[i]=i+1;
            }else{
                int pre = st.peek();
                span[i]=i-pre;

            }
            st.push(i);
        }
    }
    public static void main(String args[]){
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];
        stckspan(stock, span);
        for(int i =0;i<span.length;i++){
            System.out.print(span[i]+" ");
        } 
    }
}
