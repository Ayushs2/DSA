public class LinkedList {
    private class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void addlast(int value){
        Node nn = new Node();
        nn.data = value;
        if(size!=0){
            this.tail.next = nn;
            this.tail = nn;
            size++;
        }
        else{
            this.tail = this.head = nn;
            size++;
        }
    }

    public void addfirst(int value){
        Node nn = new Node();
        nn.data = value;
        nn.next =null;
        if(size>=1){
            nn.next = head;
             this.head = nn;
            size++;
        }
        else{
            this.tail = this.head = nn;
            size++;
        }
    }

    public void getfirst(){
        System.out.println(this.head.data);
    }
    public void getlast(){
        System.out.println(this.tail.data);
    }

    public void getat(int idx){
        if(idx<0||idx>size){
            throw new RuntimeException("Not a valid index");
        }
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public Node getNodeAt(int idx){
        if(idx<0||idx>size){
            throw new RuntimeException("Not a valid index");
        }
        Node temp = head;
        for(int i=0;i<idx;i++){
            temp = temp.next;
        }
        return temp;
    }
    public void addAt(int idx,int data){
        if(idx<0||idx>size){
            throw new RuntimeException("Not a valid index");
        }
      Node nm =  getNodeAt(idx-1);
      Node np = nm.next;
      Node nn = new Node();
      nn.data = data;
      nm.next = nn;
      nn.next = np;
    }
    //O(1)
    public int removefirst(){
        if(size==0){
            throw new RuntimeException("LL is empty");
        }
        if(size==1){
            this.head =null;
            this.tail = null;
            this.size=0;
        }
        int rv = head.data;
        this.head = head.next;
        size--;
        return rv;
    }
    //O(n) // as we are traversing to get node at then we are removing the tail
    public int removeLast(){
        if(size==0){
            throw new RuntimeException("LL is empty");
        }
        int rv = this.tail.data;

        if(size==1){
            this.head=this.tail = null;
            size=0;
        }
        Node nm = getNodeAt(size-2);
        nm.next = null;
        tail = nm;
        size--;
        return rv;
    }
    public int removeAt(int idx){
        if(idx<0 || idx>=size){
            throw new RuntimeException("Invalid index");
        }
        if(idx==0){
            return removefirst();
        }
        else if(idx == this.size-1){
            return removeLast();
        }

        else {
            Node sl = getNodeAt(idx-2);
            Node np = getNodeAt(idx);

            sl.next = np;
            size--;
        }
        Node nm = getNodeAt(idx-1);
        return nm.data;
    }
    public void display(){

      Node temp = this.head;
      while (temp!=null){
          System.out.println(temp.data);
          temp = temp.next;
      }

    }
}


