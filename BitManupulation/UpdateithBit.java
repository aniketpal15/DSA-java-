// update ith bit and switch with eithor 1 or 0 (given).........
/*
number=10110;
switch bit =0;
index at =2;
result=10(0)10;
*/


public class UpdateithBit {
   public static void updatebit(int num,int idx,int swibit){
         num = num &(~(1<<idx));
         System.out.println(num|(swibit<<idx));
   } 

   public static void main(String args[]){
        int number =8;
        int index = 2;
        int bit = 1;
        updatebit(number,index,bit);
    }
}
