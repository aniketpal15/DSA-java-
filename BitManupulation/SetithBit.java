// Set ith bit as 1 ......
/*
number=011000101;
i=1;
set ith bit =0110001(1)1
*/

public class SetithBit {
    public static void setbit(int num,int term){
        System.out.println(num|(1<<term));
    }
     public static void main(String args[]){
        int number =6;
        setbit(number,0);
    }
}
