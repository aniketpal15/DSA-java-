/*
Climbing Stairs
Count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time.

n = 5
*/
import java.util.*;
public class ClimbingStairsDP {
    // recurtion method.......... 
    public static int wayrec(int n){
         if(n==0){
            return 1;
         }
         if(n<0){
            return 0;
         }

         return wayrec(n-1)+wayrec(n-2);
    }

    // Dp memorization method.......
    public static int waydp(int ways[],int n){
         if(n==0){
            return 1;
         }
         if(n<0){
            return 0;
         }
         if(ways[n] != -1){
            return ways[n];
         }
         ways[n] = waydp(ways, n-1)+ waydp(ways, n-2);
        
         return ways[n];
    }


    //Dp tabulation method..........
    public static int waytab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;

        for(int i=1;i<=n;i++){
            if(i==1){
              dp[i] = dp[i-1] + 0;
            }else{
              dp[i] = dp[i-1]+dp[i-2];
            }
        }
       return dp[n];
    }

    public static void main(String args[]){
        int n= 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(wayrec(n));
        System.out.println(waydp(ways, n));
        System.out.println(waytab(n));
    }
}
