package linkedList;
public class LL_S_SortedInsert {
    public static void main(String args[])
    {
      Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
        head = sortedInsert(head, 25);
    	printlist(head);

    }

    public static void printlist(Node n) {
        Node curr = n;
        do {
            System.out.print(curr.data);
            curr = curr.next;
        } while (curr != null);

    }

      public static Node sortedInsert(Node n, int x) {
        Node temp = n;
        Node n2 = new Node(x);

        if (temp == null)
            return n2;
        if(temp.data > x) {
            n2.next = temp;
            return n2;
        }
        while (temp.next != null && temp.next.data < x)
            temp = temp.next;
        
        Node k = temp.next;
        temp.next = n2;
        n2.next = k;
        return n;
    }
}
