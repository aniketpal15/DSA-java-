import java.util.ArrayList;

public class mergetwo {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    public node buildtree(int nodes[]) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }

        node newnode = new node(nodes[idx]);
        newnode.left = buildtree(nodes);
        newnode.right = buildtree(nodes);

        return newnode;
    }

    public node mergemaker(node root1, node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        inordersort(root1, arr1);
        inordersort(root2, arr2);

        // FIXED: Correct merging logic using while loop
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
            } else {
                arr.add(arr2.get(j));
                j++;
            }
        }
        
        while (i < arr1.size()) {
            arr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            arr.add(arr2.get(j));
            j++;
        }
        
        return makebbst(arr, 0, arr.size() - 1);
    }

    public node makebbst(ArrayList<Integer> arr, int s, int e) {
        if (s > e) {
            return null;
        }
        int mid = s + (e - s) / 2;
        node root = new node(arr.get(mid));
        root.left = makebbst(arr, s, mid - 1);
        root.right = makebbst(arr, mid + 1, e);
        return root;
    }

    // FIXED: Corrected recursive calls to inordersort
    public void inordersort(node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inordersort(root.left, arr);
        arr.add(root.data);
        inordersort(root.right, arr);
    }

    public void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {
        int nodes1[] = {2, 1, -1, -1, 4, -1, -1};
        int nodes2[] = {9, 3, -1, -1, 12, -1, -1};
        
        mergetwo bt = new mergetwo();
        
        idx = -1;
        node root1 = bt.buildtree(nodes1);
        idx = -1; // Reset idx for the second tree
        node root2 = bt.buildtree(nodes2);
        
        System.out.print("Tree 1 Inorder: ");
        bt.inorder(root1);
        System.out.println();
        
        System.out.print("Tree 2 Inorder: ");
        bt.inorder(root2);
        System.out.println();
        
        node rootmain = bt.mergemaker(root1, root2);
        
        System.out.print("Merged Tree Inorder: ");
        bt.inorder(rootmain);
    }
}