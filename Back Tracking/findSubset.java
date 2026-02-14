//Find & print all subsets of a given string using back tracking

/* Input String......... "abc"
   Output String........ a, b, c, ab, bc, ac, abc
   */
import java.util.*;
public class findSubset {
    public static void subset(String str, String temp ,int i){
        if(i==str.length()){
            System.err.print(temp+" ");
            return;
        }
        subset(str, temp+str.charAt(i), i+1);//for yes if the letter is granted
        subset(str, temp, i+1);//for no if the letter is not granted
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        subset(sc.nextLine(),"",0);
        sc.close();
    }
}
