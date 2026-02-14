//performing merge sort thorugh divide and conquer method............


public class Mergesort {
    public static void mergesorting(int arr[],int si,int ei){
          if(si>=ei){
               return;
          }
          int mid = si+(ei-si)/2;
          mergesorting(arr, si, mid);   
          mergesorting(arr, mid+1, ei);
          sort(arr,si,mid,ei);
    }
    public static void sort(int arr[],int si,int mid,int ei){
               int temp[] =new int[ei-si +1];
               int k =0;
               int i = si;
               int j = mid+1;
               while(i<=mid && j<=ei){
                if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    i++;
                }else{
                    temp[k]=arr[j];
                    j++;
                }
                k++;

            }
                
                while(i<=mid){
                    temp[k]=arr[i];
                    k++;
                    i++;
                }

                while(j<=ei){
                    temp[k]=arr[j];
                    k++;
                    j++;
                }

                for(k=0,i=si;k<temp.length;k++,i++){
                    arr[i]=temp[k];
                }
               
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }


    public static void main(String args[]){
        int num[]={2,5,4,7,2,8,0,5,6,1};
        mergesorting(num, 0, num.length-1);
        printarr(num);
    }
}
