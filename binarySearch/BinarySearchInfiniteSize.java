package binarySearch;

public class BinarySearchInfiniteSize {

    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6,7,8,10,12,14,15,17,18,21,22};
        int k = 21;
        int i = 1;
        int val = -1;
        int start = 0; int end = i;

        if (arr[0] == k) val = 0;
        while(arr[i] < k) {
            i = i*2;
        }
        // start binary search here
    }
    
}
