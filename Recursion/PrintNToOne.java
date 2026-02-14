// Print numbers from n to 1 (Decreasing Order) through recursion.........


public class PrintNToOne{
    public static void printdec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }

    public static void main(String args[]){
       int num = 10;
       printdec(num);

    }
    
}
