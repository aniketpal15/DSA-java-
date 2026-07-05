
public class KnapsackMemoization {
    public static int knapmemo(int val[],int wt[],int w,int n,int dp[][]){
        if(w==0||n==0){
            return 0;
        }

        if(dp[n][w] != -1){
            return dp[n][w];
        }

        if(wt[n-1]<=w){
            int ans1 = val[n-1] + knapmemo(val, wt, w-wt[n-1], n-1,dp);
            int ans2 = knapmemo(val, wt, w, n-1,dp);
            dp[n][w]= Math.max(ans1, ans2);
            return dp[n][w];
        }else{
            dp[n][w]= knapmemo(val, wt, w, n-1,dp);
            return dp[n][w];
        }
    }
public static void main(String args[]){
    int val[] = {15, 14, 10, 45, 30};
    int wt[] = {2, 5, 1, 3, 4 };
    int W = 7;
    int n = val.length;

    int dp[][] = new int[val.length+1][W+1];
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
             
                dp[i][j]=-1;
             
        }
    }

    
    System.err.println(knapmemo(val, wt, W, n,dp));
}    
}
