//compress a string .......... ex:- aaaaabbbbcde  ------> a5b4cde

import java.util.*;

public class strCompression{
    public static void compress(String msg){
      String sc ="";
      for (int i=0;i<msg.length();i++){
        Integer count = 1;
        
        while(i<msg.length()-1 && msg.charAt(i)==msg.charAt(i+1)){
            count++;
            i++;
        }
        sc +=msg.charAt(i);
        if(count>1){
            sc +=count.toString();
        }
      }
      System.out.print(sc);

    }

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        compress(sc.nextLine());
        sc.close();
    }

}