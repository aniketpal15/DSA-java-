//counts set of bit in a number......
/*
number = 1010;
no of 1 present is 2;
set of bits=2;
*/


public class CountSetBit {
    public static void countsetbit(int num){
        int count =0;
        int main = num;
        while(num!=0){
            if((num&1)!=0){
              count++;
            }
            num = (num>>1);
        }
        System.out.println("The set of bit in "+main+" is "+count+".");
    }

    public static void main(String args[]){
        int number =8;
        countsetbit(number);
    }
    
}
