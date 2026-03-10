public class Heapsort {
    public static void heapify(int arr[],int i,int size){
        int left = (i*2)+1;
        int right = (i*2)+2;
        int min =i;

        if(left<size && arr[left]>arr[min]){
            min = left;
        }
        if(right<size && arr[right]>arr[min]){
            min = right;
        }
        if(min!=i){
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            heapify(arr, min, size);
        }
    }
    public static void hs(int arr[]){
        int n= arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        for(int i=n-1;i>=0;i--){
            //swap.......
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            
            heapify(arr,0,i);

        }
    }
    public static void main(String args[]){
         int arr[] = {1, 2, 4, 5, 3};
         hs(arr);
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
    }
}
