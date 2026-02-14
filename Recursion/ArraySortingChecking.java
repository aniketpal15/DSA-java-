//Check if array is sorted or not through recursion........

public class ArraySortingChecking {
      public static void arraysortcheck(int arr[],int idx){
        if(idx==arr.length-1){
            System.out.print("Array is sorted.");
            return;
        }
        if(arr[idx]>arr[idx+1]){
            System.out.print("Array is not sorted.");
            return;
        }
        arraysortcheck(arr, idx+1);
    }

    public static void main(String args[]){
       int num[]={1,2,3,4,5,6,7,8,9,10};
       arraysortcheck(num,0);
       

    }
    
}
