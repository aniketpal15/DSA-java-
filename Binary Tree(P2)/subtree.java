/*
Subtree of another Tree

Given the roots of two binary trees root and subRoot, return true if there is a subtree of root
with the same structure and node values of subRoot and false otherwise.
*/

public class subtree {
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
    public static Boolean subtreecheck(node root,node subroot){
       if(root ==null){
        return false;
       }
       
       if(root.data == subroot.data){
        if(isident(root,subroot)){
            return true;
        }
       }
       return subtreecheck(root.left, subroot) || subtreecheck(root.right, subroot);
    }

    public static Boolean isident(node root,node subroot){
       if(root == null && subroot ==null){
        return true;
       }else if(root == null || subroot ==null ||root.data != subroot.data){
        return false;
       }
       if(!isident(root.left, subroot.left)){
        return false ;
       }
       if(!isident(root.right, subroot.right)){
        return false;
       }
       return true;
    }





  
       public static void main(String args[]) {
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       int subnodes[] ={ 2, 4, -1, -1, 5, -1, -1};
       binarytree bt = new binarytree();
       binarytree.idx = -1; // Reset for first tree
       node root = bt.buildtree(nodes);
    
       binarytree.idx = -1; // Reset for second tree
       node subroot = bt.buildtree(subnodes);
    
       System.out.println(subtreecheck(root, subroot));


    }
}


