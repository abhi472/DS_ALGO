package linkedList.java;
public class LL_S_Remove_Duplicates {
 public static void main(String args[])
    {
      Node head=new Node(10);
    	head.next=new Node(30);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(40);
        head.next.next.next.next.next=new Node(45);
        head.next.next.next.next.next.next=new Node(50);
        head.next.next.next.next.next.next.next=new Node(50);
        head.next.next.next.next.next.next.next.next=new Node(60);
        head = removeDuplicates(head);
        printlist(head);

    }

    public static void printlist(Node n) {
        Node curr = n;
        do {
            System.out.print(curr.data);
            curr = curr.next;
        } while (curr != null);

    }

      public static Node removeDuplicates(Node n) {
        Node curr = n;
        int currVal = curr.data;   
        while(curr != null && curr.next!= null) {
            if (curr.next.data == currVal) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                currVal = curr.data;
            }
        }
        return n;

    }
    

}