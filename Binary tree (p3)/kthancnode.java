public class kthancnode {
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
    public void preorder(node root){
            if(root ==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
            return;
        }
     public static int kth(node root,int n,int k){
         if(root==null){
            return -1;
         }
         if(root.data == n){
            return 0;
         }
         int left = kth(root.left, n, k);
         int right = kth(root.right, n, k);
         if(left ==-1 && right == -1){
            return -1;
         }
        int max =Math.max(left, right);
        if(max+1 ==k){
            System.out.println(root.data);
        }
        return max+1;
     }
    
    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        binarytree bt = new binarytree();
        node root = bt.buildtree(nodes);
        kth(root, 5, 2);
        
    }
}
