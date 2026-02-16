/*
Indian Coins

We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000].
Find min no. of coins/notes to make change for a value V.

V = 121
ans = 3 (100+20+1)

V =590
ans = 4 (500+50+20+20)

*/

import java.util.ArrayList;
import java.util.Arrays;

public class IndianCoins {
    public static ArrayList<Integer> count(int coins[],int v){
       Arrays.sort(coins);
       int c = 0;
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i=coins.length-1;i>=0;i--){
        while(v>=coins[i]){
            c++;
            v -= coins[i];
            ans.add(coins[i]);
        }
       }
       ans.add(c);
       return ans;
    }
    public static void main(String args[]){
        int coins[] ={1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int v =  121;
        for(int i=0;i<count(coins, v).size()-1;i++){
           System.err.print(count(coins, v).get(i)+" ");
        }
        System.out.println();
        System.out.println("Total required coins = "+count(coins, v).get(count(coins, v).size()-1));
    }
}
