import java.util.*;

public class topview {
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

    static class info {
        node node;
        int hd;
        public info(node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topvw(node root) {
        if (root == null) return;

        Queue<info> q = new LinkedList<>();
        HashMap<Integer, node> map = new HashMap<>();
        int min = 0, max = 0;

        q.add(new info(root, 0));

        while (!q.isEmpty()) {
            info curr = q.remove();
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }
            
            if (curr.hd < min) min = curr.hd;
            if (curr.hd > max) max = curr.hd;

            if (curr.node.left != null) {
                q.add(new info(curr.node.left, curr.hd - 1));
            }
            if (curr.node.right != null) {
                q.add(new info(curr.node.right, curr.hd + 1));
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    static class binarytree {
        static int idx = -1;
        public node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binarytree bt = new binarytree();
        node root = bt.buildtree(nodes);
        topvw(root);
    }
}