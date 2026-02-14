//a method of finding exponential of a number fast.....
/*
number=8; exponential = 5(101);
the result is 8to the power of 5;
result = (8^4 * 1)*1*(8^1 * 1);   ......here 101 is for 5 binary if 0 present then without putting {(8^2 * 0)} give 1;
*/


public class Fastexponential {
    public static void fastexpo(int num,int expo){
        int res =1;
        int main =num;
        int pow = expo;
        while(expo!=0){
            if((expo&1)!=0){
                res = res*num;
            }
            num =num*num;
            expo =(expo>>1);
        }
        System.out.println(main+" to the power of "+pow+" =  "+res);
    }

    public static void main(String args[]){
        int number =8;
        int power = 10;
        fastexpo(number,power);
    }
}
