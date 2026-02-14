// Print numbers from 1 to N (Increasing Order) through recursion.........


public class PrintOneToN{
    public static void printinc(int n){
        if(n==0){
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
        
    }

    public static void main(String args[]){
       int num = 10;
       printinc(num);

    }
    
}
