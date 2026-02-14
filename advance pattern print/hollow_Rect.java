//pattern printing of hollow rectangle ...   ex:- 6*5 rectangle
/*   
* * * * * *
*         *
*         *
*         *
* * * * * *

*/

public class hollow_Rect {
    public static void hollow_rect(int row,int col){
     for(int i =0;i<row;i++){
        for(int j=0;j<col;j++){
           if(i==0||i==row-1||j==0||j==col-1){
            System.out.print("* ");
           }else{
            System.out.print("  ");
           }
        }
        System.err.println();
     }
    
    }

    public static void main(String args[]){
       hollow_rect(6,5);
    }
} 