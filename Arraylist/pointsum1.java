//Pair Sum - 1...........
/*
Find if any pair in a Sorted ArrayList has a target sum.

list = [1, 2, 3, 4, 5, 6], target=5  2+3/1+4

*/


import java.util.*;

public class pointsum1 {
     //Bruteforce method ...................o(n^2)
    public static void pairsum(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                  if(list.get(i)+list.get(j)==5){
                    System.out.println(list.get(i)+"+"+list.get(j)+" =5");
                  }
            }
        }
    }


    //2Poiner method..................o(n)
    public static void optipairsum(ArrayList<Integer> list){
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp){
            if(list.get(lp)+list.get(rp)==5){
                 System.out.println(list.get(lp)+"+"+list.get(rp)+" =5"); 
                 break; 
            }else if (list.get(lp)+list.get(rp)<5) {
                lp++;
            } else {
                rp--;
            }
        }
    }
    public static void main(String args[]){
         ArrayList<Integer>list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.add(6);


        pairsum(list);
        optipairsum(list);
    }
}
