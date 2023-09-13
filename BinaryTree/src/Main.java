import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootright = new BinaryTreeNode<>(3);
//
//        root.left = rootLeft;
//        root.right = rootright;
//        BinaryTreeNode<Integer> rootleft_right = new BinaryTreeNode<>(5);
//        BinaryTreeNode<Integer> rootright_left = new BinaryTreeNode<>(6);
//        rootLeft.right = rootleft_right;
//        rootright.left = rootright_left;
        BinaryTreeNode<Integer> root = takeInput_opt(true,0,true);
        int ans = noOfNodes(root);
        System.out.println("NO of Nodes are ->"+ans);
        int sum = sumOfNodes(root);
        System.out.println("sum of nodes is-> "+ sum);
        int max = largestData(root);
        System.out.println("max is-> "+ max);
        int leaf = countLeaf(root);
        System.out.println("No of leaf nodes are-->> "+ leaf);
        printNodeK(root,2);
        printBinaryTree_opt(root);
    }
    public static void printBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }
    public static void printBinaryTree_opt(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null){
            System.out.print(" L"+root.left.data);
        }
        if(root.right!=null){
            System.out.print(" R"+root.right.data);
        }
        System.out.println();
        printBinaryTree_opt(root.left);
        printBinaryTree_opt(root.right);
    }
    //Input of Binary Tree
    public static BinaryTreeNode<Integer> takeInput(){
        System.out.println("Enter root data");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if(rootData==-1){
            return null;
        }
        //create Binary tree node
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftchild = takeInput();
        BinaryTreeNode<Integer> rightchild = takeInput();
        root.left = leftchild;
        root.right = rightchild;
        return root;
    }
    public static BinaryTreeNode<Integer> takeInput_opt(boolean isRoot,int parentData,boolean isLeft){
       if(isRoot){
           System.out.println("Enter Root Data");
       }
       else if(isLeft){
           System.out.println("Enter left child of data: "+parentData);
       }
      else{
           System.out.println("Enter right child of: "+parentData);
       }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if(rootData==-1){
            return null;
        }
        //create Binary tree node
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftchild = takeInput_opt(false,root.data,true);
        BinaryTreeNode<Integer> rightchild = takeInput_opt(false,root.data,false);
        root.left = leftchild;
        root.right = rightchild;
        return root;
    }
    public static int noOfNodes(BinaryTreeNode<Integer> root){
       if(root==null){
           return 0;
       }
       int left = noOfNodes(root.left);
       int right = noOfNodes(root.right);
       return 1+left+right;
    }
    public static int sumOfNodes(BinaryTreeNode<Integer> root){
        if (root==null){
            return 0;
        }
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);
        int ans = left+right+root.data;
        return ans;
    }
    public static int largestData(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int left = largestData(root.left);
        int right = largestData(root.right);
       int ans = Math.max(root.data,Math.max(left,right));
       return ans;
    }
    public static int countLeaf(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return countLeaf(root.left)+countLeaf(root.right);
    }
    public static void printNodeK(BinaryTreeNode<Integer> root,int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.print(root.data+" ");
        }
        printNodeK(root.left,k-1);
        printNodeK(root.right,k-1);
    }
}