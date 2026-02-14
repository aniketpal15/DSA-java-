// patten printing of Hollow Rhombus............Ex:-5*5
/*
        * * * * *
      *       *
    *       *
  *       *
* * * * *

*/
import java.util.*;
public class Hollow_Rhom {
    public static void pattern(int n){
      for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print("  ");
        }
        for(int j=0;j<n;j++){
           if(i==0||i==n-1||j==0||j==n-1){
            System.out.print("* ");
           }else{
            System.out.print("  ");
           }
        }
        System.out.println();
      }
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        pattern(sc.nextInt());
        sc.close();
    } 
}
