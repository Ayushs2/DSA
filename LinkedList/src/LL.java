public class LL {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        int data;
        Node next;

       public Node(int val){
           this.data = val;
       }
       public Node(int val, Node next){
           this.data =val;
           this.next = next;
       }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void addfirst(int val){
        Node n = new Node(val);
        n.next = head;
        head =n;
        size+=1;

        if(tail==null){
            head=tail = n;
        }
    }
    public void addLast(int val) {
        if (tail == null) {
            Node n = new Node(val);
            n.next = head =tail;
           tail = head = n;
        } else {
            Node n = new Node(val);
            tail.next = n;
            tail = n;
        }
        size += 1;
    }

    public Node remove_K_elemnet(int k){
        Node temp = head;
        for(int i =1;i<k-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return temp;
    }
    public Node add_at_k(int k,int val){
        Node temp = head;
        for(int i =1;i<k-1;i++){
            temp =temp.next;
        }
        Node temp2 = temp.next;
        Node n = new Node(val);
        temp.next = n;
        n.next = temp2;
        return head;
    }
    public void add_rec(int val,int idx ){
        head = insertRec(val,idx,head);
    }

    private Node insertRec(int val, int idx, Node node) {
        if(idx ==0){
            Node n = new Node(val);
            n.next = node;
            size++;
            return n;
        }
        else{
            node.next = insertRec(val,idx-1,node.next);
            return node;
        }
    }
    public void reverse_iter(){

        if(head==null){
            return;
        }
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node fwd = curr.next;
            curr.next = prev;
            prev =curr;
            curr=fwd;
        }
        head = prev;
    }
    public void reverse_rec() {
        head = reverse(head, null);
    }

    private Node reverse(Node curr, Node prev) {
        if (curr == null) {
            return prev;
        }
        Node fwd = curr.next;
        curr.next = prev;
       Node n = reverse(fwd, curr);
       return n;
    }

}
