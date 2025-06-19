package linkedList;
public class LL_S_Middle_Element {
 public static void main(String args[])
    {
      Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);
        System.out.print(middleElementImproved(head));

    }

      public static int middleElementImproved(Node n) {
        if (n == null) return -1;
        Node slow = n;
        Node fast = n;
        while (fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;
        }
        return slow.data;
    }
    

}
