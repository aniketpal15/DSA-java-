//Print sum of N natural numbers through recursion......

public class PrintSumOfNNum{
     public static int printfact(int n){
          if(n==1){
            return 1;
          }
          if(n==0){
            return 0;
          }
          return printfact(n-1)+n;
    }

    public static void main(String args[]){
       int num =10;
       System.out.println(printfact(num));

    }
    


}
