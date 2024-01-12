package interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;


/**
 * Given an integer K and a queue of integers,
 * we need to reverse the order of the first K elements of the queue, 
 * leaving the other elements in the same relative order.
 * 
 * Input: 5 3
 *        1 2 3 4 5
 * Output: 
 *        3 2 1 4 5
 * 
 */
public class ReverseQueueTillK {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i : arr) {
            q.add(i);
        }
        System.out.println(modifyQueue(q, 3));

        
    }


        public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        int n = q.size();
        int bal = n-k;
        
        Stack<Integer> s = new Stack<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        // add code here.
        for(int i = 0; i< k ; i++) {
            int j = q.remove();
             s.push(j);

        }
        for(int i = 0; i< bal ; i++) {
            int j = q.remove();
             q2.add(j);
        }
        

        
        
        while (s.size()> 0) {
            int j = s.pop();
            q.add(j);
        }
        
        while(q2.size()>0) {
            int j = q2.remove();
            q.add(j);
        }
        
        return q;
        
    }

}
