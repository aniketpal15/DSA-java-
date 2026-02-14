// print the first Occurrence of and number of an array through recursion........

public class FirstOccurrence {
      public static int firstocc(int arr[],int key,int idx){
         if(idx==arr.length-1){
            System.out.println("Key not found");
            return -1;
         }
         if(arr[idx]==key){
            return idx;
         }
         
         return firstocc(arr, key, idx+1);
         
    }

    public static void main(String args[]){
       int num[] ={1,2,3,4,5,6,7,8,9,10} ;
       int find = 5;
       System.out.println(firstocc(num,find,0));
       

    }
    
    
}
