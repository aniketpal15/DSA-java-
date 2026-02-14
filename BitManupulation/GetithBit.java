//get ith bit (0 or 1) through bit manupulation..............
/*
number=100001010;
i=3;
ith term is 1; 10000(1)010;

*/


public class GetithBit {
    public static void getbit(int num,int term){
        int bit = (num & (1<<term))==0?0:1;
        System.out.println(bit);   // the ith term is-->   number & (1<<term)
    }
     public static void main(String args[]){
        int number =9;
        getbit(number,3);
    }
}
