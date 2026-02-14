// sorting an array using INSERTION SORT method........



public class Insertionsort {
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int pre = i-1;
            while(pre>=0 && arr[pre]>curr){
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=curr;
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