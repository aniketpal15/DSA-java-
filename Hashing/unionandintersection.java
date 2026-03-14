import java.util.HashMap;
import java.util.HashSet;

public class unionandintersection {
    public static void main(String args[]){
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();

        for(Integer k:arr1){
            set.add(k);
        }
        for(Integer k:arr2){
            set.add(k);
        }
        System.out.println(set);

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer k:arr1){
            hm.put(k,hm.getOrDefault(k, 0)+1);
        }
        for(Integer k:arr2){
            hm.put(k,hm.getOrDefault(k, 0)+1);
        }
        for(Integer i:hm.keySet()){
            if(hm.get(i)>1){
                System.out.print(i+" ");
            }
        }

        
    }
}
