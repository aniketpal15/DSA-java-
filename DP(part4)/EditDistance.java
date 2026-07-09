    /*
    Edit Distance

    Given two strings word1 and word2, return the minimum number of operations required to convert word1 to
    word2.
    You have the following three operations permitted on a word:
    . Insert a character
    · Delete a character
    · Replace a character

    word1 = "intention", word2 = "execution"

    intention -> inention (remove 't')
    inention -> enention (replace 'i' with 'e')
    enention -> exention (replace 'n' with 'x')
    exention -> exection (replace 'n' with 'c')
    exection -> execution (insert 'u')

    ans = 5

    */
    public class EditDistance {

        public static int editdis(String str1,String str2){
            int n = str1.length();
            int m = str2.length();
            int dp[][] = new int[n+1][m+1];

            for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                    if(i==0){
                        dp[i][j] = j;
                    }
                    if(j==0){
                        dp[i][j] = i;
                    }
                }
            }

            
            for(int i=1;i<dp.length;i++){
                for(int j=1;j<dp[0].length;j++){
                    if(str1.charAt(i-1)==str2.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }else{
                        int add= dp[i][j-1]+1;
                        int delete= dp[i-1][j]+1;
                        int replace= dp[i-1][j-1]+1;
                        dp[i][j] = Math.min(add,Math.min(delete,replace));

                    }
                }
            }

            return dp[n][m];


        }
        public static void main(String args[]){
            String word1 = "intention";
            String word2 = "execution";

            System.err.println(editdis(word1, word2));
        }
    }
