import java.util.HashMap;

public class Hashmapoperations {
     public static void main(String[] args) {
        HashMap<String,Integer> hp = new HashMap<>();
        hp.put("aniket",100);
        hp.put("Hrishita",101);
        hp.put("Riju",90);
        hp.put("Srija",110);
        System.out.println(hp);
        System.out.println(hp.get("aniket"));
        System.out.println(hp.containsKey("rup")+"    "+hp.containsKey("Hrishita"));
        System.out.println("removed elements is = "+ hp.remove("Riju"));
        System.out.println(hp);
        System.out.println(hp.size());
        System.out.println(hp.isEmpty());
        hp.clear();
        System.out.println(hp.isEmpty());

    }
}
