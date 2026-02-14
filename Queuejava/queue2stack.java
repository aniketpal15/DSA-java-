import java.util.Stack;

public class queue2stack {
    static  class queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public Boolean isEmpty(){
            return s1.isEmpty();
        } 

        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("The queue is empty");
                return -1;
            }
            return s1.pop();
        }
    }
      public static void main (String args[]){
        queue qr = new queue();
        qr.add(1);
        qr.add(2);
        qr.add(3);
        qr.add(4);
        qr.add(5);
        while(!qr.isEmpty()){
           System.out.println(qr.remove()+" ");
        }
      }
}
