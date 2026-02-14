//Making Queue using Linked list..........
public class Queueusingll {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next = null;
        }
    }
    static  class queue{
        static node head=null;
        static node tail=null;
        public Boolean isEmpty(){
            return head==null&&tail==null;
        }

        public void add(int data){
           node newnode = new node(data);
           if(head==null){
            head=tail=newnode;
            return;
           }
           tail.next = newnode;
           tail = newnode;


        }

        public int remove(){
         if(isEmpty()){
            System.out.println("The Queue is null");
            return-1;
         }
         node temp = head;
        if(head==tail){
            head=tail=null;
        }else{
            head=head.next;
        }
         return temp.data;
        }

        public int peek(){
             if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
      }


      public static void main (String args[]){
        queue qr = new queue();
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
