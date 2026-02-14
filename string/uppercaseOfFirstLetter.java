//For a given String convert each the first letter of each word to uppercase...........
//hi my name is aniket pal  ----->  Hi My Name Is Aniket Pal

import java.util.*;

public class uppercaseOfFirstLetter {
    public static void upper(String msg){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(msg.charAt(0)));
        for(int i = 1;i<msg.length();i++){
            if(msg.charAt(i)==' '&& i<msg.length()-1){
               sb.append(msg.charAt(i));
              i++;
              sb.append(Character.toUpperCase(msg.charAt(i)));
            }else{
                sb.append(Character.toLowerCase(msg.charAt(i)));
            }
        }
        System.out.print(sb+"\n");

    }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        upper(sc.nextLine());
        sc.close();
    }

}
