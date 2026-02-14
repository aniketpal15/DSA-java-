//Place N queens on an NxN chessboard such that no 2 queens can attack each other ..........
/*
For N=4 matrix N queens.....

* * Q *
Q * * *
* * * Q
* Q * *

just only one solution print...........

*/
import java.util.*;
public class NQueensoneSolution {
   public static void arrprint(char arr[][]){
    System.out.println("------- chess board -------");
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

    public static boolean Nqueen(char arr[][],int row){
        if(row==arr.length){
            arrprint(arr);
            return true;
        }
        for(int j=0;j<arr.length;j++){
            if(issafe(arr, row, j)){
             arr[row][j]='Q';
             if(Nqueen(arr, row+1)){
                return true;
             }
             arr[row][j]='.';
            }
        }
        return false;
    }
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
       if(Nqueen(board,0)){
           System.out.println("Solution present");
       }else{
        System.out.println("solution not present");
       }
       
    }
}
