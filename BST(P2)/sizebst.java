public class sizebst {
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
    static class info{
        boolean isbst;
        int size;
        int min;
        int max;
        info(boolean isbst,int size,int min ,int max){
            this.isbst =isbst;
            this.size =size;
            this.min =min;
            this.max = max;
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
    public static int maxsize =0;
    public info largebst(node root){
        if(root ==null){
            return new info(true, 0, Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
      info left = largebst(root.left);
      info right = largebst(root.right);
      int size = left.size + right.size +1;
      int min = Math.min(root.data,Math.min(left.min, right.min));
      int max = Math.max(root.data, Math.max(left.max,right.max));

      if(root.data<= left.max || root.data>= right.min){
        return new info(false, size, min, max);
      }

      if(left.isbst && right.isbst){
        maxsize = Math.max(maxsize,size);
        return new info(true, size, min, max);
      }
      return new info(false, size, min, max);

    }
    public static void main(String args[]){
        int nodes[] = {50,30,5,-1,-1,20,-1,-1,60,45,-1,-1,70,65,-1,-1,80,-1,-1};
        sizebst bt = new sizebst();
        node root = bt.buildtree(nodes);
        info main = bt.largebst(root);
        System.out.println(maxsize+","+main.size);
        
        
    }
}
