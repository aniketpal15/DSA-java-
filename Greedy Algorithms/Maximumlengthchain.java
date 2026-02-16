/*
Max Length Chain of Pairs

You are given n pairs of numbers. In every pair, the first number is always smaller than the
second number. A pair (c, d) can come after pair (a, b) if b < c.
Find the longest chain which can be formed from a given set of pairs.

pairs =
(5, 24)
(39, 60)
(5, 28)
(27, 40)
(50, 90)

ans = 3

*/

import java.util.*;

public class Maximumlengthchain {
    public static int maxlen(int pairs[][]){
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        int chainlen=1;
        int chainend = pairs[0][1];
        for(int j=1;j<pairs.length;j++){
           if(chainend<pairs[j][0]){
            chainlen++;
            chainend = pairs[j][1];
           }
        }
        return chainlen;
    }
    public static void main(String args[]){
    int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
      System.out.println(maxlen(pairs));
    }
}
