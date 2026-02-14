//Find & print all subsets of a given string using back tracking

/* Input String......... "abc"
   Output String........ a, b, c, ab, bc, ac, abc
   */
import java.util.*;
public class findpermutation {
    public static void strpermu(String str, String temp){
        if(str.length()==0){
            System.err.print(temp+" ");
            return;
        }
       for (int i=0;i<str.length();i++){
        char c = str.charAt(i);
        String newstr = str.substring(0,i)+str.substring(i+1);
        strpermu(newstr, temp+c);//for yes if the letter is granted
       }
       
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        strpermu(sc.nextLine(),"");
        sc.close();
    }
}
