//find out diogonal sum of 2d array........primary and secondary digonal both.......
/*
 1  2  3  4
 5  6  7  8
 9 10 11 12
13 14 15 16


primary diogonal sum = 1+6+11+16
secondary diogonal sum =4+7+10+13
*/

public class diogonalsum {
    public static void digsum(int matrix[][]){
       int pri =0;
       int sec = 0;
       if(matrix.length==matrix[0].length){
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(i==j){
                pri += matrix[i][j];
            }
            if(i+j==matrix.length-1){
                sec += matrix[i][j];
            }
        }
       }
       System.out.println("The primary digonal sum is "+pri+"\nThe secondary digonal sum is "+sec);
    }else{
        System.out.print("The no of rows and coloums are not same so i can not find the digonal sum.");
    }       
    }

        public static void main(String args[]){
        int number[][]={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}};
       
        digsum(number);
            
    }
}
