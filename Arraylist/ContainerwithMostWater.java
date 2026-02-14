//Container with Most Water........
/*
For given n lines on x-axis, use 2 lines to form a container such
that it holds maximum water.

height = [1,8,6,2,5,4,8,3,7]
*/

import java.util.*;
public class ContainerwithMostWater {
    //Bruteforce method ...................o(n^2)
    public static int mostwater(ArrayList<Integer> height){
        int maxwater =0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int currwater = (j-i)*Math.min(height.get(i),height.get(j));
                maxwater = Math.max(maxwater,currwater);
            }
        }
        return maxwater;
    }


    //2Poiner method..................o(n)
    public static int optimostwater(ArrayList<Integer> height){
        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            int currwater = (rp-lp)*Math.min(height.get(lp),height.get(rp));
            maxwater = Math.max(maxwater,currwater); 
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
         ArrayList<Integer>height = new ArrayList<>();
         height.add(1);
         height.add(8);
         height.add(6);
         height.add(2);
         height.add(5);
         height.add(4);
         height.add(8);
         height.add(3);
         height.add(7);


         System.out.println("The total max water can preserved is = "+mostwater(height));

         System.out.println("The total max water can preserved is = "+optimostwater(height));

    }
}
