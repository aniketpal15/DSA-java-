//Queue using Java Collection framework.................

import java.util.*;
public class queueJCF {
     public static void main (String args[]){
        Queue<Integer>qr = new LinkedList<>();
        qr.add(1);
        qr.add(2);
        qr.add(3);
        qr.add(4);
        qr.add(5);
        System.out.println(qr.peek()+" ");
        System.out.println(qr);
        while(!qr.isEmpty()){
            System.out.print(qr.remove()+" ");
        }
      }
}
