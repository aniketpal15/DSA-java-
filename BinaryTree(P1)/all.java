import java.util.LinkedList;
import java.util.Queue;

public class all {
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


        public void preorder(node root){
            if(root ==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
            return;
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

        public void postorder(node root){
            if(root ==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
            return;
        }

        public void levelorder(node root){
            if(root == null){
                return;
            }
            Queue<node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
               node curr = q.remove();
               if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    return;
                }else{
                    q.add(null);
                }
               }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
               }
            }

        }

        public int treeheight(node root){
            if(root ==null){
                return 0;
            }
           int height =Math.max(treeheight(root.left),treeheight(root.right));
            return height+1;
        }

        public int treecount(node root){
            if(root==null){
                return 0;
            }
            int count = treecount(root.left)+treecount(root.right)+1;
            return count;
        }

        public int treesum(node root){
            if(root==null){
                return 0;
            }
            int count = treesum(root.left)+treesum(root.right)+root.data;
            return count;
        }

        public int treedia(node root){
            if(root==null){
                return 0;
            }
            int ld = treedia(root.left);
            int rd = treedia(root.right);
            int sd = treeheight(root.left)+treeheight(root.right)+1;
            return Math.max(sd,Math.max(ld,rd));
        }
     public nodeinfo diameter(node root){
        if(root==null){
            return new nodeinfo(0,0);
        }
        nodeinfo left = diameter(root.left);
        nodeinfo right = diameter(root.right);
        int diam = Math.max(left.hei +right.hei+1, Math.max(left.dia,right.dia));
        int hi = Math.max(left.hei,right.hei)+1;
        return new nodeinfo(diam,hi);
     }


    }
    static class nodeinfo{
        int dia;
        int hei;
        nodeinfo(int dia,int hei){
            this.dia=dia;
            this.hei = hei;
        }
    }

    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binarytree bt = new binarytree();
        node root = bt.buildtree(nodes);
        System.out.println(bt.treeheight(root));
        System.out.println(bt.treecount(root));
        System.out.println(bt.treesum(root));
        System.out.println(bt.treedia(root));
        System.out.println(bt.diameter(root).dia);
    }
}
