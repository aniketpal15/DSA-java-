import java.util.*;
public class Iterationhashmap {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put ("India",100);
        hm.put ("China",150);
        hm.put ("US",50);
        hm.put( "Indonesia", 6);
        hm.put ( "Nepal",  5);
        Set<String> s = hm.keySet();
        System.out.println(s);
        for(String key:s){
            System.out.println(key+"->"+ hm.get(key));
        }
    }
}
