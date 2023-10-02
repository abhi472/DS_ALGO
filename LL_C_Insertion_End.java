import java.util.*;
import java.io.*;
import Node.java;

public class LL_C_Insertion_End {
    
    public static void main(String args[])
    {
      Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
        head.next.next.next.next = head;
        head = addEnd(head, 46);
    	printlist(head);

    }

    public static void printlist(Node n) {
        Node curr = n;
        do {
            System.out.print(curr.data);
            curr = curr.next;
        } while (curr != n);

    }

    public static Node addEnd(Node n, int x) {
        Node curr = n;
        Node add = new Node(x);
        do {
            curr = curr.next;
        } while(curr.next != n);

        curr.next = add;
        add.next = n;
        return n;
    }

    public static Node addEndImproved(Node n, int x) {
        Node add = new Node(n.data);
        n.data = x;
        add.next = n.next;
        n.next = add;
        n = n.next;
        return n ;
    }
    

}