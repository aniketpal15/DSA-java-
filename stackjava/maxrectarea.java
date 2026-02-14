/*
Max Area in Histogram

paytm
f

Given an array of integers heights representing the histogram's bar height where the
width of each bar is 1, return the area of the largest rectangle in the histogram.

heights = [2,1,5,6,2,3] ans = 10;
*/

import java.util.Stack;

public class maxrectarea {
    public static int maxarea(int arr[]){
        int sr[] = new int[arr.length];
        int sl[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length -1;i>=0;i--){
             while(!st.isEmpty() && arr[st.peek()]>=  arr[i]){
                st.pop();
             }
             if(st.isEmpty()){
                sr[i]=-1;
             }else {
                sr[i] = st.peek();
             }

             st.push(i);
        }

        st = new Stack<>();
        for(int i=0;i<arr.length;i++){
             while(!st.isEmpty() && arr[st.peek()]>=  arr[i]){
                st.pop();
             }
             if(st.isEmpty()){
                sl[i]=arr.length;
             }else {
                sl[i] = st.peek();
             }

             st.push(i);
    }
     int maxar=0;
    for(int j=0;j<arr.length;j++){
        int width = sr[j]-sl[j]-1;
        
        maxar=Math.max((arr[j]*width), maxar);
    }
    return maxar;
}
    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        System.out.println(maxarea(arr));
    }
}
