//   Tiling Problem.........
/*
Given a "2 x n" board and tiles of size "2 x 1",
 count the number of ways to tile the given board 
 using the 2 x 1 tiles.
(A tile can either be placed horizontally or vertically. )

 */ 

public class TilingProblem {
    public static int tilingprb(int n){
          if(n==1||n==0){
              return 1;
          }   
          int fn1= tilingprb(n-1);
          int fn2 = tilingprb(n-2);
          return fn1+fn2;
         }

    public static void main(String args[]){
       int size =4;
       System.out.println(tilingprb(size));

    }
}
