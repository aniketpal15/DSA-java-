import java.util.HashMap;

public class finditerationoftickt {

    public static String getsrt(HashMap<String,String> tickets){
        HashMap<String,String> rev = new HashMap<>();
        for(String k:tickets.keySet()){
            rev.put(tickets.get(k), k);
        }
        for(String k:tickets.keySet()){
            if(!rev.containsKey(k)){
                return k;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai",  "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put ("Delhi", "Goa");

        String start = getsrt(tickets);
        System.out.print(start);
        for(String k:tickets.keySet()){
            String m=k;
            m=m+"";
            System.out.print("->"+ tickets.get(start));
            start = tickets.get(start);
        }
    }
}
