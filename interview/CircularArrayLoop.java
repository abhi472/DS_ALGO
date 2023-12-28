package interview;

import java.util.HashMap;

public class CircularArrayLoop {

    public static void main(String[] args) {
        int arr[] = {1, 17, 1, 2, 1};
    
  

        
        System.out.print(isCircularLoop(arr, arr.length));
    }

    private static boolean isCircularLoop(int[] arr, int len) {
        if(len ==0 || (len != 1 && arr[0] == 0))
            return false;
               
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean isLastTraversed = false;
        int j = 0;
        do {
            map.put(j, -1);
            if((j+arr[j]) >= len || (j+arr[j])<0 || j == len -1)
                isLastTraversed = true;
            j = (j + arr[j]) % len;
            j = j>=0 ? j : (len - j)%len;   

                

        } while(j != 0 && map.get(j) == null);

        return j == 0 && isLastTraversed;
    }
    
}
