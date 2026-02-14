//print last occurrence of a number in a array thorugh recursion........ 

public class LastOccurrence {
    public static int firstocc(int arr[],int key,int idx){
         if(idx==arr.length-1){
            return -1;
         }
         int res =firstocc(arr, key, idx+1);
         if(res==-1 && arr[idx]==key){
            return idx;
         }
         return res;
         
         
    }

    public static void main(String args[]){
       int num[] ={1,2,3,4,5,6,7,8,5,10} ;
       int find = 5;
       System.out.println(firstocc(num,find,0));
       

    }
    
    
}
