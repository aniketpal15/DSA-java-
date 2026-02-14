/*

Next Greater Element

The next greater element of some element x in an array is the first greater
element that is to the right of x in the same array.

arr = [6, 8, 0, 1, 3]

next Greater = [8, -1, 1, 3, -1]*/
import java.util.*;
public class nextgrt {
    public static void nxtgrt(int arr[],int temp[]){
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length -1;i>=0;i--){
             while(!st.isEmpty() && arr[st.peek()]<= arr[i]){
                st.pop();
             }
             if(st.isEmpty()){
                temp[i]=-1;
             }else {
                temp[i] = arr[st.peek()];
             }

             st.push(i);
        }

        for(int j=0;j<arr.length;j++){
            System.out.print(temp[j]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int temp[] = new int[arr.length];
        nxtgrt(arr,temp);
    }
}
