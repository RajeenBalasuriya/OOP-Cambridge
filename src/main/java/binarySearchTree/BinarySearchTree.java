package binarySearchTree;

public class BinarySearchTree {

    private Node root;


    //insert method
    public void insert(Node node){
        root = insertHelper(root,node);
    }

    //insert helper method
    private Node insertHelper(Node root,Node node){
        int data =node.data;

        if(root == null){
            root = node;
            return root;
        }
        else if (data < root.data){
            root.left=insertHelper(root.left,node);
        }
        else{
            root.right=insertHelper(root.right,node);
        }
        return root;
    }

    //display method
    public void display(){
        displayHelper(root);
    }

    //display helper
    private void displayHelper(Node root){
        if(root != null){
            displayHelper(root.left);
            System.out.print(root.data+" ");
            displayHelper(root.right);
        }
    }

    //search method
    public boolean search(int data){return false;}

    //search helper methid
    private boolean searchHelper(Node root,int data){return false;}

    //remove method
    public void remove(int data){}

    //remove helper method
    private int removeHelper(Node root,int data){return 0;}

    private int successor(Node root){return 1;}

    private int predecssor(Node root){return 1;}



}
