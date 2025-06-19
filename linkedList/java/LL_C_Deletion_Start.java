package linkedList;
public class LL_C_Deletion_Start {
 public static void main(String args[])
    {
      Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
        head.next.next.next.next = head;
        head = delStartImproved(head);
    	printlist(head);

    }

    public static void printlist(Node n) {
        Node curr = n;
        do {
            System.out.print(curr.data);
            curr = curr.next;
        } while (curr != n);

    }

      public static Node delStartImproved(Node n) {
        Node temp = n;
        temp.data = temp.next.data;
        temp.next = temp.next.next;
        return temp;
    }
    

}
