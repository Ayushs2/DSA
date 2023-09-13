import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int nt = sc.nextInt();
        int arr[] = {20,10,40,30,60};
        int nt=arr[0];
        for (int i = 1; i <arr.length ; i++) {
          nt = arr[i];
        }
        Node n = new Node(nt);
        n.inorder(n);
    }

}
 class Node
{
    int key;
    Node left;
    Node right;
    Node(int k){
        key=k;
    }
     void inorder(Node root){
        if (root!=null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
}


