public class Mindist {
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
    public static node lowanc(node root,int n,int m){
        if(root==null||root.data==n||root.data==m){
            return root;
        }
        node ll = lowanc(root.left, n, m);
        node lr = lowanc(root.right, n, m);
        if(ll==null){
            return lr;
        }
        if(lr==null){
            return ll;
        }
        return root;
    }
    public static int dis(node root,int n){
       if(root==null){
        return -1;
       }
       if(root.data == n){
        return 0;
       }

       int left = dis(root.left, n);
       int right =dis(root.right, n);

       if(left == -1 && right ==-1){
           return -1;
       }else if (left ==-1) {
           return right+1;
       }else{
           return left+1;
       }
    }

   public static int mindis(node root,int n,int m){
        node anc = lowanc(root, n, m);
        int leftdis = dis(anc,n);
        int rightdis = dis(anc,m);
        return leftdis+rightdis;
   }
    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        binarytree bt = new binarytree();
        node root = bt.buildtree(nodes);
        System.out.println(mindis(root, 4, 7));
        
    }
}
