
public class Searchbst {
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
     
    public Boolean srcbst(node root,int data){
        if(root ==null){
            return false;
        }
        if(root.data == data){
            return true;
        }else if(root.data >data){
         return srcbst(root.left, data);
        }else{
            return srcbst(root.right, data);
        }
    }
   public static void main(String args[]){
    Searchbst blt =new Searchbst();
    int values [] = {5, 1, 3, 4, 2, 7};
    node root =null;
    for(int i=0;i<values.length;i++){
        root = blt.insert(root, values[i]);
    }
    blt.inorder(root);
    System.out.println();

    System.out.println(blt.srcbst(root, 7));

   }
}
