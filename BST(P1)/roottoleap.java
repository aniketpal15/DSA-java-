import java.util.*;
public class roottoleap {
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
    public void printpath(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        return;
    }

    public void prtleap(node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        arr.add(root.data);
        if(root.left ==null && root.right ==null){
            printpath(arr);
        }
        prtleap(root.left, arr);
        prtleap(root.right, arr);
        arr.remove(arr.size()-1);
    }
   public static void main(String args[]){
    roottoleap blt =new roottoleap();
    int values [] = {8, 5, 3, 1, 4, 6, 10, 11, 14};;
    node root =null;
    for(int i=0;i<values.length;i++){
        root = blt.insert(root, values[i]);
    }
    blt.inorder(root);
    System.out.println();
    blt.prtleap(root, new ArrayList<Integer>());

   }
}
