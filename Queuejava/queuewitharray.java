//Queue is last in first out (LIFO).............

public class queuewitharray{
      static  class queue{
        static int arr[];
        static int front;
        static int rear;
        static int size;
        queue(int n){
          arr= new int[n];
          size = n;
          rear=-1;

        }  
        
        public Boolean isEmpty(){
            return rear==-1;
        }

        public void add(int data){
            if(rear ==  size-1){
                System.err.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]= data;

        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            front = arr[0];
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }

        public int peek(){
             if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
      }


      public static void main (String args[]){
        queue qr = new queue(5);
        qr.add(1);
        qr.add(2);
        qr.add(3);
        qr.add(4);
        qr.add(5);
        while(!qr.isEmpty()){
           System.out.println(qr.remove()+" ");
        }
      }
}