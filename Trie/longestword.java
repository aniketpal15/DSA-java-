/*
Longest Word with all Prefixes
Find the longest string in words such that every prefix of it is also in words.
words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]

ans = "apple"
*/
public class longestword {
        static class node{
        node child[] = new node[26];
        boolean eow = false;

        node(){
            for(int i=0;i<26;i++){
                child[i] = null;
            }
        }
    }
    public static  node root = new node();

    public static void ins(String word){
        node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx]=new node();
            }
            curr = curr.child[idx];
        }

        curr.eow = true;
    }

    public static Boolean search(String word){
         node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.child[idx]==null){
                return false;
            }
            curr = curr.child[idx];
        }

        return curr.eow == true;
    }

    public static String ans ="";

    public static void longword(node root, StringBuilder temp){
        if(root == null){
            return;
        }

        for(int i=0;i<26;i++){
            if(root.child[i] !=null && root.child[i].eow == true){
                char ch =(char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longword(root.child[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    
    public static void main(String args[]){
        String words [] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int j=0;j<words.length;j++){
            ins(words[j]);
        }

        longword(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
