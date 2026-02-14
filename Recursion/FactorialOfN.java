// Find Factorial of N thorugh recursion...................

public class FactorialOfN {
     public static int printfact(int n){
          if(n==1||n==0){
            return 1;
          }
          return printfact(n-1)*n;
    }

    public static void main(String args[]){
       int num =0 ;
       System.out.println(printfact(num));

    }
    


}
