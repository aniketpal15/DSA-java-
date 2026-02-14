//sorting an array using COUNTING SORT method..........


public class Countingsort {
    public static void sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = largest<arr[i]?arr[i]:largest;
        }
        int count[]=new int[largest+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int i=0;
        for(int j=0;j<count.length;j++){  
            while(count[j]>0){
                arr[i]=j;
                i++;
                count[j]--;
            }
        }
        for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+",");
            }
    }

    public static void main(String args[]){
        int num[] ={9,8,7,6,5,4,3,2,1,0};
        sort(num);
    }
}
