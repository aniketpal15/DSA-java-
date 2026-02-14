//finding even or odd number through bitwise operator......

public class evenodd {
    public static void bitevenodd(int a){
        if((a&1)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static void main(String args[]){
        int number =8;
        bitevenodd(number);
    }
}
