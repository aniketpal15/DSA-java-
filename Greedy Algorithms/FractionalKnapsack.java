/*
Fractional Knapsack.....
Given the weights and values of N items, put these items in a knapsack of
capacity W to get the maximum total value in the knapsack.

value = [60, 100, 120]
weight = [10, 20, 30]

W =50

ans = 240
*/

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static int knap(int value[],int weight[],int w){
     double ratio[][] = new double[value.length][2];
        for(int j=0;j<value.length;j++){
            ratio[j][0] =j;
            ratio[j][1] = value[j]/(double)weight[j];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o ->o[1]));
        int  ans=0;
        for(int j=value.length-1;j>=0;j--){
            if(w>=weight[(int)ratio[j][0]]){
                  w=w-weight[(int)ratio[j][0]];
                  ans= ans+value[(int)ratio[j][0]];
            }else{
             ans = ans+((int)ratio[j][1]*w);
             w=0;
             break;
            }
        }
        return ans;

    }
    public static void main(String args[]){
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w=50;
        System.out.println("The Final Value = "+knap(value,weight,w));
        
    }
}
