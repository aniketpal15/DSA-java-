public class circulararrayqueue {
     static  class queue{
        static int arr[];
        static int front;
        static int rear;
        static int size;
        queue(int n){
          arr= new int[n];
          size = n;
          rear=-1;
          front =-1;

        }  
        
        public Boolean isEmpty(){
            return rear==-1&& front == -1;
        }

        public Boolean isFull(){
            return (rear+1)%size == front;
        }

        public void add(int data){
            if(isFull()){
                System.err.println("Queue is full");
                return;
            }
            if(front == -1){
                front =0;
            }
            rear=(rear+1)%size;
            arr[rear]= data;

        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        public int peek(){
             if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
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
