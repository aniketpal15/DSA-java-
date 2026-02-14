//clear a range from jth index to ith index and make the internal num 0......
/*
number=100101101110;
startidx =2;
endidx =7;
result =1001(000000)10
*/



public class ClearRangeofBits {
    public static void clearrange(int num,int i,int j){
        /*
        we have to and with a main number to get the result
        number=100101101110;
        startidx =2;
        endidx =7;
        result =1001(000000)10;

        here we have to clear from idx 2 to 7
        so we have to perform "and" with the main number a removed number as like
        result=100101101110(number) & 111100000011;
        to get(111100000011) we have to perform "or" of two number as like
        111100000011 = 111100000000 | 000000000011;
        (~0)<<j)   helps to get first part----> 111100000000;
        (~(~0)<<i)) helps to get second part---->000000000011;
        */
        System.out.println(num&((~0)<<j)|(~(~0)<<i));  
    }
    
    public static void main(String args[]){
        int number =12345678;
        int startindex = 2;
        int endindex =7;
        clearrange(number,startindex,endindex);
    }
}
