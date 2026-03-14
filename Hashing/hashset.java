import java.util.HashSet;

public class hashset {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        System.out.println(hs);
        hs.remove(4);
        for(Integer k:hs){
            System.out.print(k+" ");
        }

    }
}
