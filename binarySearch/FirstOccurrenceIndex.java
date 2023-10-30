package binarySearch;

public class FirstOccurrenceIndex {
    public static void main (String args[]) {
        int[] arr = {10, 20, 20, 20, 30, 40, 50, 60, 70, 80, 80, 80, 90};
        int fOc = firstOccurrenceIndex(arr, arr.length, 70);
        int lOc = lastOccurrenceIndex(arr, arr.length, 70);
        int tOc = lOc - fOc + 1;
        System.out.print(fOc +" "+lOc+" "+tOc);

    }

    public static int firstOccurrenceIndex(int[] arr, int n, int k) {
        int start = 0;
        int end = n;
        int index = Integer.MAX_VALUE;
        while(start<=end) {
            int mid = (start+end)/2;
            if(arr[mid] == k) {
                 end = mid - 1;
                 index = mid < index ? mid : index;
            } else if(arr[mid] > k) {
                end = mid -1;

            } else start = mid + 1;
        }

        return index == Integer.MAX_VALUE? -1: index;
    
    }
public static int lastOccurrenceIndex(int[] arr, int n, int k) {
        int start = 0;
        int end = n;
        int index = Integer.MIN_VALUE;
        while(start<=end) {
            int mid = (start+end)/2;
            if(arr[mid] == k) {
                 start = mid + 1;
                 index = mid > index ? mid : index;
            } else if(arr[mid] > k) {
                end = mid -1;

            } else start = mid + 1;
        }

        return index == Integer.MIN_VALUE? -1: index;
    
    }

}
