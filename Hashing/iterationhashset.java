import java.util.*;

public class iterationhashset {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        // Using Iterator........
        Iterator<Integer> it = hs.iterator(); // 'i' must be lowercase
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //Using Advance loop......
        for(Integer k:hs){
            System.out.print(k+" ");
        }
    }
}
