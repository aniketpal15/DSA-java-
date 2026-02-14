//performing Quick sort thorugh divide and conquer method............


public class Quicksort {
    public static void quicksorting(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
          int pidx = position(arr,si,ei);
          quicksorting(arr, si, pidx-1);
          quicksorting(arr, pidx+1, ei);
    }
    public static int position(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i=si-1;
       for(int j=si;j<ei;j++){
        if(arr[j]<=pivot){
            i++;
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;

        }
       }i++;
       int temp = pivot;
            arr[ei]=arr[i];
            arr[i]=temp;
            return i;

    }
   
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }


    public static void main(String args[]){
        int num[]={2,5,4,7,2,8,0,5,6,1};
        quicksorting(num, 0, num.length-1);
        printarr(num);
    }
}
