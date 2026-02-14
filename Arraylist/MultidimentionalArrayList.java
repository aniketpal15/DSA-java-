
import java.util.*;
public class MultidimentionalArrayList {
    public static void main(String args[]){
    ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
    ArrayList<Integer>list1 = new ArrayList<>();
    ArrayList<Integer>list2 = new ArrayList<>();
    ArrayList<Integer>list3 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);

            list2.add(4);
            list2.add(5);
            list2.add(6);

            list3.add(7);
            list3.add(8);
            list3.add(9);

            //adding data in 2d array list................
            mainlist.add(list1);
            mainlist.add(list2);
            mainlist.add(list3);

        //printing data of 2d arraylist...................
        for(int i =0;i<mainlist.size();i++){
            ArrayList<Integer>currlist = mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }



        System.out.println(mainlist);

    }
}
