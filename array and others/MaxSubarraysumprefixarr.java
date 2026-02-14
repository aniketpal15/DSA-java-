//finnding max subarray sum with the help of prefix array ..............


public class MaxSubarraysumprefixarr {
     public static void maxsubarraysum(int arr[]){
            int cursum = 0;
            int maxsum = Integer.MIN_VALUE;
            int prearr[]=new int[arr.length];
            prearr[0]=arr[0];
            for(int i=1;i<arr.length;i++){
                prearr[i]=prearr[i-1]+arr[i];
            }
            for(int i =0;i<arr.length;i++){
               for(int j=0;j<arr.length;j++){
                cursum =0;
                  cursum=i==0?prearr[j]:prearr[j]-prearr[i-1];
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

