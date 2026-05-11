public class wordbreakprb {
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
    
    public static Boolean wordbrk(String word){
        if(word.length()==0){
            return true;
        }
        for(int i=1;i<word.length();i++){
            if(search(word.substring(0,i)) && wordbrk(word.substring(i))){
                return true;
            }
        }

        return false;
    }
    
    public static void main(String args[]){
        String words [] = {"the", "a", "there", "their", "any", "thee"};
        for(int j=0;j<words.length;j++){
            ins(words[j]);
        }
        System.out.println(search("there"));

        System.out.println(wordbrk("athereany"));
    }
}
