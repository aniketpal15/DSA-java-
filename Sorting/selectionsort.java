//sorting using SELECTION SORT method.................



public class selectionsort{
    public static void sort(int arr[]){
        int minpos;
        for(int i=0;i<arr.length-1;i++){
            minpos=i;   
            for(int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[minpos]) {
                    minpos = j;
                }
               
            }
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+",");
        }
    }
    public static void main(String args[]){
        int num[] ={9,8,7,6,5,4,3,2,1};
        sort(num);
    }
}
