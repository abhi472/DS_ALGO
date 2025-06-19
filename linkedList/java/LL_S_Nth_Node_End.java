package linkedList.java;
public class LL_S_Nth_Node_End {
 public static void main(String args[])
    {
      Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);
        System.out.print(nthElementFromEnd(head, 7));

    }

      public static int nthElementFromEnd(Node n, int k) {
        if (n == null) return -1;
        Node temp = n;
        while (k >=0 && temp != null) {
            temp = temp.next;
            k--;
        }
        if(temp == null && k>0) return -1;
        while(temp != null )
        {
            n = n.next;
            temp = temp.next;
        }
        return n.data;
    }
    

}
