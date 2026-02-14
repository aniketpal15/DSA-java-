import java.util.*;

public class javacollecctionfw {

    
    public static void main(String args[]) {
        // Now that we are inside a method, this logic is valid
        LinkedList<Integer> jcf = new LinkedList<>();
        
        // Adding first.......
        jcf.addFirst(5);
        jcf.addFirst(4);
        jcf.addFirst(3);
        jcf.addFirst(9);
        System.out.println(jcf); 

        //Adding Last...........
        jcf.addLast(2);
        jcf.addLast(1);
        jcf.addLast(10);
        System.out.println(jcf); 

        //Removing First.........
        jcf.removeFirst();
        System.out.println(jcf); 

        //Removing Last...........
        jcf.removeLast();
        System.out.println(jcf); 


        // Optional: Print it to see the result
        System.out.println(jcf); 
    }
}