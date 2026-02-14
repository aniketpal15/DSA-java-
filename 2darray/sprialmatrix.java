//printing matrix data as spiral ...........
/*
1 ,2 ,3 ,4
5 ,6 ,7 ,8
9 ,10,11,12
13,14,15,16


output:-  1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
*/

public class sprialmatrix {
    public static void sprialmat(int matrix[][]){
     int startrow=0;
     int startcol=0;
     int endrow=matrix.length-1;
     int endcol=matrix[0].length-1;
     while(startrow<=endrow && startcol<=endcol){
            for(int i=startcol;i<=endcol;i++){
                System.out.print(matrix[startrow][i]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            for(int i=endcol-1;i>=startcol;i--){
                System.out.print(matrix[endrow][i]+" ");
            }
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.print(matrix[i][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
     }
     System.out.println();
    }

    public static void main(String args[]){
        int number[][]={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20}};
       
        sprialmat(number);
            
    }
}
