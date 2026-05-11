public class prefixprb {
    static class node {
        node child[] = new node[26];
        boolean eow = false;
        int freq;

        node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
            freq = 1;
        }
    }

    public static node root = new node();

    public static void ins(String word) {
        node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new node();
            } else {
                curr.child[idx].freq++;
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    // --- REMAINING CODE STARTS HERE ---

    public static String findPrefix(String word) {
        node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            prefix.append(word.charAt(i));
            
            // Move to the child node
            curr = curr.child[idx];

            // If freq is 1, this path is unique to this word
            if (curr.freq == 1) {
                break;
            }
        }
        return prefix.toString();
    }

    public static void main(String args[]) {
        // Example from the image
        String words[] = {"zebra", "dog", "duck", "dove"};
        
        // Step 1: Insert all words into the Trie
        root = new node(); // Reset root
        for (int j = 0; j < words.length; j++) {
            ins(words[j]);
        }

        // Step 2: Find and print shortest unique prefix for each word
        System.out.print("ans = {");
        for (int i = 0; i < words.length; i++) {
            System.out.print("\"" + findPrefix(words[i]) + "\"");
            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}