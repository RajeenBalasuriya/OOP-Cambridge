package linkedList;

public class LinkedList {
    Node head;

    public static LinkedList insert(LinkedList list, int data){
        //node to be inserted
        Node newNode = new Node(data);

        if(list.head==null){
            list.head=newNode;
        }
        else{
            Node current = list.head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=newNode;
        }

        return list;
    }

    public static void printList(LinkedList list){
        Node current = list.head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
