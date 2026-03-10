import java.util.*;
public class Heapwork {
    public static  class heap{
      ArrayList <Integer> arr = new ArrayList<>();
      public void heapadd(int data){
        arr.add(data);
        int x= arr.size()-1;
        int par = (x-1)/2;

        while(arr.get(x)<arr.get(par)){
            //swap....
            int temp = arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par, temp);

            x= par;
            par =(x-1)/2;
        }
      }


      public int heappeek(){
        return arr.isEmpty()?-1:arr.get(0);
      }      

      private void heapify(int i){
        int left =(2*i)+1;
        int right =(2*i)+2;
        int min = i;

        if(left <arr.size() && arr.get(min)>arr.get(left)){
          min = left;
        }
        if(right<arr.size() && arr.get(min)>arr.get(right)){
          min=right;
        }
        if(min!=i){
          //swap......
          int temp =  arr.get(i);
          arr.set(i, arr.get(min));
          arr.set(min, temp);
          heapify(min);

        }
      }

  public int heapremove() {
    if (arr.isEmpty()) {
        return -1; // Or throw an exception
    }   
    int data = arr.get(0);
    // 1. Swap the first and last
    int lastIdx = arr.size() - 1;
    int temp = arr.get(0);
    arr.set(0, arr.get(lastIdx));
    arr.set(lastIdx, temp);
    // 2. Remove the last element
    arr.remove(lastIdx);
    // 3. ONLY heapify if the list still has elements
    if (!arr.isEmpty()) {
        heapify(0);
    }
    return data;
   }

      public Boolean heapisempty(){
        return arr.size()==0;
      }
    }
    public static void main(String args[]){
        heap h = new heap();
        h.heapadd(0);
        h.heapadd(5);
        h.heapadd(7);
        h.heapadd(9);

        while(!h.heapisempty()){
          System.out.println(h.heappeek());
          h.heapremove();
        }

    }
}
