//binary search in java


import java.util.*;
public class binary_search {
 
    public static int search(int arr[],int key){
     int start = 0;
     int end = arr.length -1;
     while (start <= end) {
        int mid =(start+end)/2;
        if(key==arr[mid]){
            return mid;
        }else if (arr[mid]<key) {
            start=mid+1;
        } else {
            end = mid-1;
        }
        
     }
     return -1;
    }
    public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     int  number[]={2,3,4,5,6,7,8,9};
     System.out.println("enter the data u want to search");
     int num=sc.nextInt();
     sc.close();
     System.out.println("the data "+num+" is at the index of "+search(number,num));

    }
    
}
