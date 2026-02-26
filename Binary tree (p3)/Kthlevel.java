
public class Kthlevel {
    static class node{
      int data;
      node left;
      node right;
       node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
       }
    }

    static class binarytree{
        static int idx = -1;
        public node buildtree(int nodes[]){
         idx++;
         if(nodes[idx]==-1){
          return null;
         }

         node newnode = new node(nodes[idx]);
         newnode.left = buildtree(nodes);
         newnode.right = buildtree(nodes);

         return newnode;
        }
    }

    public static void kthlvl(node root,int lvl,int i){
        if(root==null){
            return;
        }
        if(i==lvl){
            System.out.print(root.data+" ");
            return;
        }
        kthlvl(root.left, lvl+1, i);
        kthlvl(root.right, lvl+1, i);
    }
    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        binarytree bt = new binarytree();
        node root = bt.buildtree(nodes);
        kthlvl(root, 1,3);
    }
}
