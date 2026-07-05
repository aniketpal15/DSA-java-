public class UnboundedKnapsackTabulation {
    public static int knaptab(int val[],int wt[],int w,int n,int dp[][]){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int v = val[i-1];
                int wei = wt[i-1];
                 

         if(wei <= j){
            int ans1 = v + dp[i][j-wei];
            int ans2 =dp[i-1][j];
            dp[i][j]= Math.max(ans1, ans2);
            
        }else{
            dp[i][j]= dp[i-1][j];
           
        }

            }
        }
       return dp[n][w]; 
    }
public static void main(String args[]){
    int val[] = {15, 14, 10, 45, 30};
    int wt[] = {2, 5, 1, 3, 4 };
    int W = 7;
    int n = val.length;

    int dp[][] = new int[val.length+1][W+1];
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
             if(i==0||j==0){
                dp[i][j] = 0;
             }else{
                dp[i][j]=-1;
             }
        }
    }

    
    System.err.println(knaptab(val, wt, W, n,dp));
} 
}
