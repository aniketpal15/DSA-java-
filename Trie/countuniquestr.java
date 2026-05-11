/*Count Unique Substrings

CO

Given a string of length n of lowercase alphabet characters, we need to count total number of
distinct substrings of this string.

str = "ababa"
ans = 10
 */
public class countuniquestr {
    static class node{
        node child[] = new node[26];
        boolean eow = false;
        node(){
            for(int i=0;i<26;i++){
                child[i]=null;
            }
        }
    }

    

    public static node root =new node();

    public static void insert(String word ){
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

    public static int nodecont(node root){
        if(root == null){
            return 0;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(root.child[i] != null){
                count += nodecont(root.child[i]);
            }

        }

        return count+1;
    }

    public static void main(String args[]){
        String word = "ababa";
        for(int i=0;i<word.length();i++){
            String suff = word.substring(i);
            insert(suff);
        }

        System.out.println(nodecont(root));
    }
}
