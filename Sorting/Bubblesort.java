//sorting using BUBBLE SORT method......................

public class Bubblesort{
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+",");
            }
        
    }
    public static void main(String args[]){
        int number[]={9,8,7,6,5,4,3,2,1};
        sort(number);
    }
}