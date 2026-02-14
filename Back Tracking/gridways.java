//   Find number of ways to reach from (0,0) to (N-1, M-1) in a NxM Grid.
//      Allowed moves - right or down.

import java.util.*;

public class gridways {
public static int gridway(int arr[][],int n,int m){
    if(n==arr.length-1||m==arr[0].length-1){
         return 1;
    }
    return gridway(arr, n, m+1)+gridway(arr, n+1, m);  //  right+down
}

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row number");
        int n = sc.nextInt();
        System.out.println("enter col number");
        int m = sc.nextInt();
        sc.close();
        int arr[][]=new int[n][m];
        int reuslt = gridway(arr, 0, 0);
        System.out.println("the no of ways is "+ reuslt);        

    }
}
