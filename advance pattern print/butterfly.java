//pattern printing of butterfly patter .......... Ex:-8*8 pattern
/*
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
*/
public class butterfly {
    public static void pattern(int row){
        int r=row/2;
        for (int i=1;i<=r;i++){
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*(r-i);k++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=r;i>0;i--){
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for(int k=1;k<=2*(r-i);k++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        pattern(8);
    }
}
