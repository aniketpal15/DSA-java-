
public class AllLL {
    
    public static class Node {
              int data;
              Node next;

              public Node(int data){
                this.data=data;
                this.next = null;
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
    Tail = newnode;
        

    }
      
      //adding elemments in mid place...............
      public void addmid(int data,int idx){
        Node newnode = new Node(data);
        sizell++;
        Node temp = Head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;


    }
      //printing elements of linked list............
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

      //Finding size of Linked List.........
    public int sizeLL(){
        Node temp = Head;
        int i=0;
        while(temp!=null){
            temp=temp.next;
            i++;
        }
        return i;
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
        return temp.data;
        }
        

    }

    //Remove last element in linked list.........
    public int removelast(){
        if(sizell ==0){
            System.out.println("empty Linked List");
            return Integer.MIN_VALUE;
        }else if(sizell ==1){
            sizell = 0;
            return Head.data;
        }

        Node pre = Head;
        for(int i=0;i<sizell-2;i++){
            pre=pre.next;
        }

        pre.next = null;
        int data = Tail.data;
        Tail = pre;
        sizell--;
        return data;
    }


    //Iterative Search in a Linked List............
    public int searchll(int key){
        Node temp = Head;
        int idx =0;
      for(int i=0;i<sizell;i++){
          if(temp.data == key){
              idx= i;;
              break;
          }
            temp = temp.next;
      }
      if(idx==0){
        return -1;
      }else{
        return idx;
      }
    }

    //recursive Search in a Linked List............
    public int searchrecll(Node temp,int key,int i){
        
        if(i>=sizell){
            return-1;
        }
        if(temp.data == key){
            return i;
        }
        return searchrecll(temp.next,key,i+1);
        
    }

    // reverse a linked list..........
    public void revLL(){
        Node pre = null;
        Node curr = Tail = Head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = pre;
            pre =curr;
            curr = next;;
        }
        Head = pre;
    }

    //check if the linked list is pallindrome or not
   public Boolean pallin() {
    if (Head == null || Head.next == null) return true;

    // 1. Find mid
    Node sl = Head;
    Node fa = Head;
    while (fa != null && fa.next != null) {
        sl = sl.next;
        fa = fa.next.next;
    }
    Node mid = sl;

    // 2. Reverse second half
    Node pre = null;
    Node curr = mid;
    Node next;
    while (curr != null) {
        next = curr.next;
        curr.next = pre;
        pre = curr;
        curr = next;
    }

    // 3. Check palindrome
    Node right = pre; // Head of reversed half
    Node left = Head;
    boolean isPallin = true;
    while (right != null) {
        if (left.data != right.data) {
            isPallin = false;
            break; 
        }
        left = left.next;
        right = right.next;
    }

    // 4. RESTORE the list (Reverse the second half back)
    curr = pre;
    pre = null;
    while (curr != null) {
        next = curr.next;
        curr.next = pre;
        pre = curr;
        curr = next;
    }

    return isPallin;
  }

  //Cycle maker......
  public void cycmaker(int idx){
    Node temp = Head;
    int i=0;
    while(i<idx){
        temp=temp.next;
        i++;
    }
    Tail.next=temp;
  }

  //Detecting Cycle in a LinkedList..........
  public Boolean checkcycle(){
    Node sl = Head;
    Node fs = Head;
    while(fs!=null&&fs.next!=null){
        sl=sl.next;
        fs=fs.next.next;
        if(fs==sl){
            return true;
        }
    }
    return false;
  }

  //Remove cycle in a Linked List...........
  public void remcyc(){
    Node sl = Head;
    Node fs = Head;
    Boolean cyc = false;
    while(fs!=null&&fs.next!=null){
        sl=sl.next;
        fs=fs.next.next;
        if(fs==sl){
            cyc = true;
            break;
        }
    }
    if(cyc == false){
        System.out.println("the linked list is not cycle");
        return;
    }

    Node pre = null;
    sl=Head;
    while(sl!=fs){
        pre = fs;
        sl=sl.next;
        fs=fs.next;
    }
    pre.next = null;
    
  }
  //Finding middle.......
  public Node midfind(Node head){
    Node sl = head;
    Node fa = head.next;
    while (fa != null && fa.next != null) {
        sl = sl.next;
        fa = fa.next.next;
    }
    return sl;
  }
  public Node merge(Node leftll,Node rightll){
    Node mergedll = new Node(-1);
    Node temp = mergedll;
    while(leftll!=null&&rightll!=null){
        if(leftll.data <= rightll.data){
           temp.next = leftll;
           leftll =leftll.next;
           temp = temp.next; 
        }else{
            temp.next = rightll;
           rightll =rightll.next;
           temp = temp.next;
        }
    }
    while(leftll!=null){
        temp.next = leftll;
        leftll =leftll.next;
        temp = temp.next; 
    }
    while(rightll!=null){
        temp.next = rightll;
        rightll =rightll.next;
        temp = temp.next; 
    }
    return mergedll.next;
  }

  //Merge sort performing in a Linked List..........
  public Node mergesort(Node head){
    if(head == null || head.next == null) {
    return head;
    }
    Node mid = midfind(head);
    Node righthead = mid.next;
    Node lefthead = head;
    mid.next = null;
    Node leftll = mergesort(lefthead);
    Node rightll = mergesort(righthead);
    
    return merge(leftll, rightll);
  }
  //zigzag Linked list making..........
 public void zigzag() {
    if (Head == null || Head.next == null) return;

    // 1. Find Mid
    Node mid = midfind(Head);

    // 2. Reverse Second Half
    Node curr = mid.next;
    mid.next = null; // Split the list
    Node pre = null;
    Node next;
    while (curr != null) {
        next = curr.next;
        curr.next = pre;
        pre = curr;
        curr = next;
    }

    Node leftH = Head;
    Node rightH = pre; // Head of reversed second half
    Node nextL, nextR;

    // 3. Alternate Merge (Zigzag)
    while (leftH != null && rightH != null) {
        // Store next nodes
        nextL = leftH.next;
        nextR = rightH.next;

        // Zigzag connections
        leftH.next = rightH;
        rightH.next = nextL;

        // Move pointers forward
        leftH = nextL;
        rightH = nextR;
    }
}
  

    public static void main(String args[]){
        AllLL ll = new AllLL();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        ll.addmid(3, 2);
        System.out.println(ll.removefirst());
        System.out.println(ll.removelast());
        ll.printLL();
        System.out.println("\nThe size of linked list is "+ll.sizeLL());
        System.out.println(ll.searchll(3));
        System.out.println(ll.searchrecll(Head,3,0));
        ll.printLL();
        ll.revLL();
        ll.printLL();
        if(ll.pallin()){System.out.println("Pallindrome");}else{System.out.println("Not Pallindromme");};
        ll.printLL(); 
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(1); 
        ll.printLL();    
        if(ll.pallin()){System.out.println("Pallindrome");}else{System.out.println("Not Pallindromme");};
        if(ll.checkcycle()){System.out.println("Cycle linked list");}else{System.out.println("Non cycle linked list");};
        ll.cycmaker(2);
        if(ll.checkcycle()){System.out.println("Cycle linked list");}else{System.out.println("Non cycle linked list");};
        ll.remcyc();
        if(ll.checkcycle()){System.out.println("Cycle linked list");}else{System.out.println("Non cycle linked list");};
        ll.printLL();  
        ll.mergesort(Head);
        ll.printLL(); 
        ll.zigzag();
        ll.printLL();
          



    }
}
