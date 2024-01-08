package linkedList;

public class LL_C_Insertion_Start {
    public static void main(String args[])
    {
      Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
        head.next.next.next.next = head;
        head = addStartImproved(head, 46);
    	printlist(head);

    }

    public static void printlist(Node n) {
        Node curr = n;
        do {
            System.out.print(curr.data);
            curr = curr.next;
        } while (curr != n);

    }

    public static Node addStart(Node n, int x) {
        Node curr = n;
        Node add = new Node(x);
        do {
            curr = curr.next;
        } while(curr.next != n);

        curr.next = add;
        add.next = n;
        return add;
    }

      public static Node addStartImproved(Node n, int x) {
        Node add = new Node(n.data);
        n.data = x;
        add.next = n.next;
        n.next = add;
        return n;
    }
    

}
