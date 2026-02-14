//Print Nth Fibonacci number through recursion......

public class PrintFibonacciNum {
     public static int printfibo(int n){
        if(n==1){
           return 0;
        }
        if(n==2){
            return 1;
        }
        
        return printfibo(n-1)+printfibo(n-2);
    }

    public static void main(String args[]){
       int num = 10;
       System.out.print(printfibo(num));

    }
    
}
