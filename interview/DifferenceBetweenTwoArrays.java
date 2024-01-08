package interview;

import java.util.TreeSet;

public class DifferenceBetweenTwoArrays {
    
    public static void main(String[] args) {
    
        int[] arr1 = {2, 9};
        int[] arr2 = {16, 14, 8};
        int d = 3;

        System.out.println(""+findTheDistanceValue(arr1, arr2, d));


        
    }

     static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        TreeSet<Integer> ts = new TreeSet<>();
        for(int n : arr2)
            ts.add(n);
        
        for(int n : arr1){
            Integer higher = ts.ceiling(n);
            Integer lower = ts.floor(n);
            int diff = 0;
            if(higher == null){
                diff = Math.abs(lower - n);
            }else if(lower == null){
                diff = Math.abs(higher - n);
            }else{
                diff = Math.min(higher - n, n - lower);
            }
            if(diff > d)
                res++;
        }
        return res;
    }

}
