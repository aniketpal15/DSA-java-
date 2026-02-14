//Point Sum 2...............
/*
Find if any pair in a Sorted & Rotated ArrayList has a target sum.

list = [11, 15, 6, 8, 9, 10], target=16
*/

import java.util.*;
public class pointsum2 {
    public static void pairsum2(ArrayList<Integer> list,int target){
        int b =-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                b=i;
                break;
            }
        }
        int lp =b+1;
        int rp=b;

         while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                 System.out.println(list.get(lp)+"+"+list.get(rp)+" =5"); 
                 break; 
            }else if (list.get(lp)+list.get(rp)<target) {
                lp =(lp+1)%list.size();
            } else {
                rp =(list.size()+rp-1)%list.size();
            }
        }
    }
    public static void main(String args[]){
        int target = 16;
         ArrayList<Integer>list = new ArrayList<>();
         list.add(11);
         list.add(15);
         list.add(6);
         list.add(8);
         list.add(9);
         list.add(10);


        pairsum2(list,target);
    }
}
