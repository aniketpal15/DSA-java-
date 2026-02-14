//finnding max subarray sum with the help of prefix array Kadane's algorithm..............


public class MaxSubarraysumkadanesAlgo{
     public static void maxsubarraysum(int arr[]){
            int cursum = 0;
            int maxsum = Integer.MIN_VALUE;
           for(int i=0;i<arr.length;i++){
            cursum +=arr[i];
            cursum=cursum<0?0:cursum;
            maxsum=Math.max(maxsum,cursum);   
        }
     System.out.print("the max subarray sum is "+ maxsum);

    }
    public static void main(String args[]){
        int number[]={1,-2,3,-4,5,-6,7,-8,9};
        maxsubarraysum(number);
    }
}
