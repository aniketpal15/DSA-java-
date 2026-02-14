//Friends Pairing Problem using recursion..........
/*
Given n friends, each one can remain single or can be paired up with some other
friend. Each friend can be paired only once. Find out the total number of ways in
which friends can remain single or can be paired up.
*/

public class FriendsPairingProb {
     public static int frndpair(int n){
          if(n==1||n==2){
            return n;
          }
          int fn1 = frndpair(n-1);
          int fn2 = frndpair(n-2)*(n-1);
          return fn1+fn2;
        }

    public static void main(String args[]){
       int num =4;
       System.out.println(frndpair(num));

    }
}
