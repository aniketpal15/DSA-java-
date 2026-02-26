import java.util.ArrayList;

public class lowestCommonAnc {
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
    public static Boolean fill(node root,int n,ArrayList<node>path){
        if(root==null){
            return false;
        }
        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean fl = fill(root.left, n, path);
        boolean fr = fill(root.right, n, path);

        if(fl||fr){
            return true;
        }else{
        path.remove(path.size()-1);
        return false;
        }
        
    }
    public static int cmnanc(node root,int n,int m){
        ArrayList<node> p1 = new ArrayList<>();
        ArrayList<node> p2 = new ArrayList<>();
        
        fill(root,n, p1);
        fill(root,m, p2);
        int j=0;
        for(;j<p1.size() && j<p2.size();j++){
            if(p1.get(j)!=p2.get(j)){
                break;
            }
        }
        
        return p1.get(j-1).data;
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
    
    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        binarytree bt = new binarytree();
        node root = bt.buildtree(nodes);
        System.out.println(lowanc(root, 4, 5).data);
        
    }
}
