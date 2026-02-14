
import java.util.*;
public class ALoperations {
    public static void main (String args[]){
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        
    //Add Elements in ArrayList........O(1);
         //Add elements in list1...integer
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list1.add(5);
        
         //Add elements in list2...String
            list2.add("aniket");
            list2.add("Riju");
            list2.add("hrishita");
            list2.add("Srija");
            list2.add("hrishu");

            System.out.println(list1+"\n"+list2);
            System.out.println();

    //Get Elements in ArrayList........O(1);   
            int list1ele =  list1.get(0);
            String list2ele = list2.get(0);
            System.out.println("List1 0 index element is "+list1ele+"\nList2 0 index element is  "+list2ele);
            System.out.println();

    //Remove Elements in ArrayList........O(n);
           System.out.println(list1+"/"+list2);
           list1.remove(2);
           list2.remove(2);
           System.out.println(list1+"/"+list2);
           System.out.println();


    //Set Elements at Index in ArrayList........O(n);   
           System.out.println(list1+"/"+list2); 
           list1.set(2,3);
           list2.set(2, "hrishita");
           System.out.println(list1+"/"+list2); 
           System.out.println();

    //Contrains Elements in ArrayList........O(n); return if present or not.
           System.out.println(list1.contains(2));
           System.out.println(list1.contains(10));
           System.out.println(list2.contains("hrishita"));
           System.out.println(list2.contains("all"));
           System.out.println();


    //Adding element at specific index........o(n);
           System.out.println(list1+"/"+list2);
           list1.add(3,4);
           list2.add(3,"srija");
           System.out.println(list1+"/"+list2);
           System.out.println();

    //Finding Array size of a Arraylist.........;
           System.out.println(list1+"/"+list2);
           int list1length = list1.size();
           int list2length = list2.size();
           System.out.println("The List1 length is = "+list1length+"\n"+"The List2 length is = "+list2length);
           System.out.println();



     ArrayList<Integer>list3 = new ArrayList<>();
            list3.add(3);
            list3.add(2);
            list3.add(7);
            list3.add(9);
            list3.add(4);
    // Sorting an ArrayList through inbuild functio......................
        //Acending Order.......
          System.out.println(list3);
          Collections.sort(list3);
          System.out.println(list3);
          System.out.println();
        //Decending Order......
          System.out.println(list3);
          Collections.sort(list3,Collections.reverseOrder());
          System.out.println(list3);
          System.out.println();


           
    }
}
