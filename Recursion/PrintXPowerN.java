// Print x to the power n through recursion.......

public class PrintXPowerN {

   
  //  General method ......
   public static int printpow(int x,int n ){
         if(n==1){
            return x;
         }
         return x*printpow(x, n-1);
             
    }


  //  Optimised method.........
   public static int printpowopti(int x,int n ){
         if(n==1){
            return x;
         }
         if(n%2==0){
            return printpowopti(x, n/2)*printpowopti(x, n/2);
         }else{
            return printpowopti(x, n/2)*printpowopti(x, n/2)*x;
         }
             
    }



    public static void main(String args[]){
       int num =5;
       int pow = 3;
       System.out.println(printpow(num,pow));//general method output
       System.out.println(printpowopti(num,pow));//optimised method output

    }


}
