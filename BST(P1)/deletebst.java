

public class deletebst {
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
    public static node findInSuc(node root){
         while(root != null){
            root = root.left;
         }
         return root;
    }

    public node delbst(node root,int data){
        if(root.data > data){
          root.left = delbst(root.left, data);
        }else if(root.data <data){
            root.right = delbst(root.right, data);
        }else{
            if(root.left ==null && root.right ==null ){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
             if(root.left!=null && root.right !=null){
                node req = findInSuc(root.right);
                root.data = req.data;
                root.right =delbst(root.right, req.data);
             }
        }

        return root;
    }
   public static void main(String args[]){
    deletebst blt =new deletebst();
    int values [] = {5, 1, 3, 4, 2, 7};
    node root =null;
    for(int i=0;i<values.length;i++){
        root = blt.insert(root, values[i]);
    }
    blt.inorder(root);
    System.out.println();
    blt.delbst(root, 4);
    blt.inorder(root);

   }
}
