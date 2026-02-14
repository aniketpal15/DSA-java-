//clear ith bit and convert it to 0........ 

public class ClearithBit {
    public static void setbit(int num,int term){
        System.out.println(num&(~(1<<term)));
    }
     public static void main(String args[]){
        int number =7;
        setbit(number,0);
    }
}
