/* 
Deque
Double ended queue........

addFirst( )
addLast( )
removeFirst( )
removeLast( )
getFirst( )
getLast( )
*/

import java.util.Deque;
import java.util.LinkedList;

public class dequeJCF {
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(2);
        dq.addFirst(2);
        dq.addFirst(2);
        dq.addFirst(2);
        dq.addLast( 10);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
