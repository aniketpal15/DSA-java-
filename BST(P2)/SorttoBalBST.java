public class SorttoBalBST {
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
    public node makebbst(int arr[],int s ,int e){
        if(s>e){
            return null;
        }
        int mid = (s+e)/2;
        node root = new node(arr[mid]);
        root.left = makebbst(arr, s, mid-1);
        root.right = makebbst(arr, mid+1, e);
        return root;

    }
    public static void main(String args[]){
        SorttoBalBST bt = new SorttoBalBST();
        int arr[] ={3,5,6,8,10,11,12};
        node root = bt.makebbst(arr, 0, arr.length-1);
        System.out.println(root.data);
    }
}
