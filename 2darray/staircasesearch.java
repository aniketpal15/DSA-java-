//searchinng a key value in a 2d array using staircase search method.............

public class staircasesearch {
    public static void search(int matrix[][],int key){
        int row =0;
        int col =matrix[0].length-1;
        while(row<matrix.length && col>=0){
             if(matrix[row][col]==key){
                System.out.println("the matrix is present at the position ("+row+","+col+").\n");
                break;
             }else if(matrix[row][col]>key){
                col--;
             }else{
                row++;
             }
        }
        if(row>=matrix.length || col>= matrix[0].length){
            System.out.print("The data is not found at the matrix");
        }
    }

    public static void main(String args[]){
        int number[][]={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20}};
        int find = 13;
       
        search(number,find);
            
    }
}
