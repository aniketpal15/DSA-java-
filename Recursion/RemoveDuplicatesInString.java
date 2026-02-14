//Remove Duplicates in a String through recursion...........


public class RemoveDuplicatesInString {
    public static void removedubstr(String n,int idx, StringBuilder str,boolean map[]){
         if(idx == n.length()){
            System.out.println(str);
            return;
         }
         char curr = n.charAt(idx);
         if(map[curr-'a']== true){
            removedubstr(n,idx+1,str,map);
         }else{
            map[curr-'a'] = true;
            removedubstr(n,idx+1,str.append(curr),map);

         }
    }

    public static void main(String args[]){
       String name ="aanikket";
       removedubstr(name,0,new StringBuilder(""),new boolean[26]);

    }
}
