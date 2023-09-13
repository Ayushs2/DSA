public class LL {
        private Node head;
        private Node tail;
        private int size;
        public LL(){
            this.size= 0;
        }

     public void addHead(int val){
            Node node = new Node(val);
            node.next=head;
            head=node;
            if(tail ==null){
                tail=head;
            }
     }
     public void addTail(int val){
            if(tail==null){
                addHead(val);
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail=node;
            size++;
     }
     public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val);
                temp = temp.next;
            }
     }

    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
}

