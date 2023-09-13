import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        for (int i = 0; i < 5; i++) {
            int data = sc.nextInt();
            head = addAtFirst(head,data);
        }
        print(head);
//    Node n1 = new Node(30);
//    n1.next = new Node(10);
    }
    static Node addAtFirst(Node head,int data){
        Node newNode = new Node(data);
        newNode.next =head;//setting newNode ka next to head ka memory ie newNode ka next will point to
        //head ka memory
        return newNode;//sam as head = newNode  now head will become new node or head will point towards
        //newNode
    }
    static  void print(Node head){
        Node currNode = head;
        while (currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
    }
    //n1=30 n1.next = address od node 10
    static class Node {
        int data;
        Node next; //storing address of next index node.
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
}
