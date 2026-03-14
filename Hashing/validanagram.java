/*
Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

TRUE

TRUE

FALSE

S = "race" t="care"

s = "heart" t="earth"

s = "tulip" t = "lipid"
 */

import java.util.HashMap;

public class validanagram {
    public static Boolean isana(String s,String t){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(map.get(t.charAt(i))!= null){
                if(map.get(t.charAt(i)) == 1){
                    map.remove(t.charAt(i));
                }else{
                    map.put(t.charAt(i), map.get(t.charAt(i))-1); 
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
     public static void main(String args[]){
        String s ="race";
        String t = "care";
        System.out.println(isana(s, t));
     }    
}
