/*
Longest Common Subsequence
A subsequence of a string is a new string generated from the original string with some characters (can be none)
deleted without changing the relative order of the remaining characters.

str1 = "abcde", str2 = "ace"
ans = 3 //"ace"

str1 = "abcdge", str2 = "abedg"
ans = 4 //"abdg"

*/

public class LongestCommonSubsequenceTabulation {
    public static int lcs(String str1,String str2){
        int dp[][] = new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0||j==0){
                    dp[i][j] = 0;
                }
            }
        }

        for(int i=1;i<str1.length()+1;i++){
            for(int j=1;j<str2.length()+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }
    public static void main(String args[]){
        String str1 = "abcdge";
        String str2 = "abedg" ;//lcs = "abdg"; length = 4
        System.out.println(lcs(str1, str2));
    }
}
