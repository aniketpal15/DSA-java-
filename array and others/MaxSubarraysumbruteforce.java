//finding max subarray sum usinng brute force method...............



public class MaxSubarraysumbruteforce{
    public static void maxsubarraysum(int arr[]){
        int cursum =0;
        int maxsum = Integer.MIN_VALUE;
     for(int i =0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            cursum =0;
            for(int k=i;k<=j;k++){
                cursum += arr[k];
            }
            if(cursum>maxsum){
                maxsum = cursum;
            }
            
        }
     }
     System.out.print("the max subarray sum is "+ maxsum);

    }

    public static void main(String args[]){
        int number[]={1,2,3,4,5,6,7,8,9};
        maxsubarraysum(number);
    }
    
}
