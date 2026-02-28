public class printrng {
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
    public void inorder( node root){
            if(root ==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
            return;
        }

    public node insert(node root,int data){
        if(root == null){
            root = new node(data);
            return root; 
        }
        if(root.data>data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void pntrng(node root,int i,int j){
        if(root == null){
            return;
        }
        if(root.data>=i&&root.data<=j){
            pntrng(root.left, i, j);
            System.out.print(root.data +" ");
            pntrng(root.left, i, j);
        }else if(root.data<i){
           pntrng(root.right, i, j);
        }else if(root.data >j){
            pntrng(root.left, i, j);
        }
    }
   public static void main(String args[]){
    printrng blt =new printrng();
    int values [] = {5, 1, 3, 4, 2, 7};
    node root =null;
    for(int i=0;i<values.length;i++){
        root = blt.insert(root, values[i]);
    }
    blt.inorder(root);
    System.out.println();
    blt.pntrng(root, 3, 5);

   }
}
