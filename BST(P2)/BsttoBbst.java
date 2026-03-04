import java.util.*;
public class BsttoBbst {
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
        public void inorder( node root){
            if(root ==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
            return;
        }

    public void inordersort( node root,ArrayList<Integer> inord){
            if(root ==null){
                return;
            }
            inordersort(root.left,inord);
            inord.add(root.data);
            inordersort(root.right,inord);
            return;
        }
        public node makebbst(ArrayList<Integer> arr,int s ,int e){
           if(s>e){
            return null;
           }
          int mid = (s+e)/2;
          node root = new node(arr.get(mid));
          root.left = makebbst(arr, s, mid-1);
          root.right = makebbst(arr, mid+1, e);
          return root;

         }

        public node balbstmake(node root){
            ArrayList <Integer> inord =new ArrayList<>();
            inordersort(root, inord);
            node newroot =makebbst(inord, 0, inord.size()-1);
            return newroot;
 
        }
        public static void main(String args[]){
        int nodes[] = {8,6,5,3,-1,-1,-1,-1,10,-1,11,-1,12,-1,-1};
        BsttoBbst bt = new BsttoBbst();
        node root = bt.buildtree(nodes);
        bt.inorder(root);
        node newroot = bt.balbstmake(root);
        System.out.println(newroot.data);
        
        
    }
}
