// clear bits from last to ith term....
/*
num =1111;
idx =1;
result=1100; it clear 
*/

public class ClearLasttoithBit {
    public static void cleartoith(int num,int idx){
        System.out.println(num&((~0)<<idx));
    }

     public static void main(String args[]){
        int number =15;
        int index = 2;
        cleartoith(number,index);
    }
}
