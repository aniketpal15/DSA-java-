public class sumtree {
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
    public static void preorder(node root){
            if(root ==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
            return;
        }

        public static int tran(node root){
            if(root ==null){
                return 0;
            }
            int left = tran(root.left);
            int right = tran(root.right);
            int data = root.data;
            int leftdata =root.left==null?0:root.left.data;
            int rightdata = root.right==null?0:root.right.data;
            root.data =  leftdata+ rightdata+left+right;
            return data;
        }

    
    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        binarytree bt = new binarytree();
        node root = bt.buildtree(nodes);
        tran(root);
        preorder(root);
        
    }
}
