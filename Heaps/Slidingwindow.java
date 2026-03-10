
import java.util.*;
public class Slidingwindow {
    static class pair implements Comparable<pair>{
        int val;
        int idx;
        public pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(pair p2){
            return p2.val-this.val;
        }

    }
    public static void main(String args[]){
     int arr[] = {1,3,-1,-3,5,3,6,7};
     int k = 3; //window size
     int res[] = new int [arr.length-k+1]; //n-k+1
     PriorityQueue<pair> pq = new PriorityQueue<>();

     for(int i=0;i<k;i++){
        pq.add(new pair(arr[i], i));
     }
     res[0]= pq.peek().val;

     for(int i=k;i<arr.length;i++){
         while(pq.size() >0 && pq.peek().idx <= (i-k)){
            pq.remove();
         }
         pq.add(new pair(arr[i], i));
         res[i-k+1]=pq.peek().val;
     }
    for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");

    }
    }
}
