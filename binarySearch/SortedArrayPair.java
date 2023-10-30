package binarySearch;

// import java.util.HashMap;
// import java.util.Map;

public class SortedArrayPair {
    public static void main (String args[]) {
        int arr[] = {3, 8, 13, 18};
        int n = arr.length;
        int x = 14;
        System.out.print(twoPointerValue(arr, n, x));
        
        // HashMap<Integer, Integer> map = new HashMap();
        // for (int i = 0; i< n; i++) {
        //     if (map.get(arr[i]) == null) {
        //         map.put(arr[i], x - arr[i]);
        //     }
        // }

        // for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
        //     if(entry.getKey() == map.get(entry.getValue()))
        //         System.out.print(entry.getKey() +"   "+entry.getValue());
        // }
    }

    public static boolean twoPointerValue(int arr[], int n, int x) {
        int start = 0; int end = 1;
        while(start>=0 && end <= n-1) {
            if(arr[end]+arr[start] == x) {
                return true;
            } else if (arr[end]+arr[start]> x) {
                start = start -1;
            } else { end = end + 1; start = start + 1;}
        }
        return false;
    }
}
