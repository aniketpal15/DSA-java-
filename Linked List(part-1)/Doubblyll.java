public class Doubblyll {
   public static class Node {
      int data;
      Node next;
      Node pre;

       public Node(int data){
          this.data=data;
          this.next = null;
          this.pre = null;
         }
        
    }
    public static Node Head;
    public static Node Tail;
    public static int sizell;


     //Adding elements............
       //adding elements in frist place............
    public void addfirst(int data){
        Node newnode = new Node(data);
        sizell++;
        if(Head==null){
           Head=Tail=newnode;
           return;
        }
        newnode.next=Head;
        Head.pre = newnode;
        Head = newnode;


    }
       //adding elements in last place............
    public void addlast(int data){
         Node newnode = new Node(data);
    sizell++;
    if (Head == null) {
        Head = Tail = newnode;
        return;
    }
    Tail.next = newnode; // Link the old tail to the new node
    newnode.pre = Tail;
    Tail = newnode;
        

    }

     //adding elemments in mid place...............
     public void addmid(int data, int idx) {
    if (idx == 0) { addfirst(data); return; }
    if (idx == sizell) { addlast(data); return; }

    Node newnode = new Node(data);
    Node temp = Head;
    for (int i = 0; i < idx - 1; i++) {
        temp = temp.next;
    }

    newnode.next = temp.next;
    if (temp.next != null) { // Essential safety check
        temp.next.pre = newnode;
    }
    temp.next = newnode;
    newnode.pre = temp;
    sizell++;
}


    public void printLL(){
        if(Head==null){
            System.out.println("The Linked List is empty");
        }
        Node temp = Head;
        while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
        }
        System.out.println();
    }


     //Remove first element in linked list.........
    public int removefirst(){
        sizell--;
        if(Head ==null){
          System.out.println("Linked List is empty");
          return Integer.MIN_VALUE;
        }else{Node temp = Head;
        Head = Head.next;
        temp.next=null;
        Head.pre = null;
        return temp.data;
        }
        

    }

    //Remove last element in linked list.........
   public int removelast() {
    if (sizell == 0) {
        System.out.println("empty Linked List");
        return Integer.MIN_VALUE;
    } else if (sizell == 1) {
        int data = Head.data;
        Head = Tail = null; // List becomes empty
        sizell = 0;
        return data;
    }

    // Use the Tail to find the previous node directly
    int data = Tail.data;
    Tail = Tail.pre; // Move Tail back one step
    Tail.next = null; // Break the link to the old tail
    sizell--;
    return data;
}

public static void main(String args[]){
      Doubblyll dll = new Doubblyll();
        dll.addfirst(2);
        dll.addfirst(1);
        dll.addlast(4);
        dll.addlast(5);
        dll.printLL();
        dll.addmid(3, 2);
        dll.printLL();
        System.out.println(dll.removefirst());
        System.out.println(dll.removelast());
        dll.printLL();


    }
}
