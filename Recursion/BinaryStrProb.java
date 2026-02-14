//Print all binary strings of size N without consecutive ones.......
/*
in=3;
Output:-
000
001
010
100
101

only "11" is not allowed.....
*/


public class BinaryStrProb {
    public static void printstr(int n ,int lp,String str ){
        if(n==0){
            System.out.println(str);
            return;
        }
        printstr(n-1,0,str+"0");
        if ((lp==0)) {
            printstr(n-1,1,str+"1");
        }
    }

    public static void main(String args[]){
       int num = 3;
    printstr(num,0,"");

    }
    
}
