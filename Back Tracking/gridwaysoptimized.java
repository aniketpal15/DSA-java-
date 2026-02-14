//   Find number of ways to reach from (0,0) to (N-1, M-1) in a NxM Grid.
//      Allowed moves - right or down.
/* here we use the mathamatical permutation formula 
permutation of (N-1) no Down and (M-1) Right is the solution of the problem .......= (n-1+m-1)!/(n-1)!*(m-1)!
*/
import java.util.Scanner;

public class gridwaysoptimized {

    public static int fact(int num){
        if(num==0||num==1){
           return 1;
        }
        return num*fact(num-1);
    }
     public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row number");
        int n = sc.nextInt();
        System.out.println("enter col number");
        int m = sc.nextInt();
        sc.close();
        int reuslt = fact(m+n-2)/(fact(n-1)*fact(m-1));
        System.out.println("the no of ways is "+ reuslt);      
                

    }
}
