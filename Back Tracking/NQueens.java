//Place N queens on an NxN chessboard such that no 2 queens can attack each other ..........
/*
For N=4 matrix N queens.....

* * Q *
Q * * *
* * * Q
* Q * *

and so on...all the possible prints

*/
import java.util.*;
public class NQueens {
   public static void arrprint(char arr[][]){
    System.out.println("------- chess board "+ (count+1)+" -------");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.err.print(arr[i][j]+" ");
        }
        System.out.print("\n");
    }
   }

   public static Boolean issafe(char arr[][],int i,int j){
    //upwards
         for(int k=i-1;k>=0;k--){
            if(arr[k][j]=='Q'){
                return false;
            }
         }
    //left-upwards
         for(int k=i-1,m=j-1;k>=0&&m>=0;k--,m--){
            if(arr[k][m]=='Q'){
                return false;
            }
         }
    //right-upwards
          for(int k=i-1,m=j+1;k>=0&&m<arr.length;k--,m++){
            if(arr[k][m]=='Q'){
                return false;
            }
         }
    return true;
   }

    public static void Nqueen(char arr[][],int row){
        if(row==arr.length){
            arrprint(arr);
            count++;
            return;
        }
        for(int j=0;j<arr.length;j++){
            if(issafe(arr, row, j)){
             arr[row][j]='Q';
             Nqueen(arr, row+1);
             arr[row][j]='.';
            }
        }
    }
static int count=0;
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.close();
       char board[][] = new char[n][n];
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            board[i][j]='.';
        }
    }
       Nqueen(board,0);
       System.out.println("There are "+count+" possible solutions present.");
    }
}
