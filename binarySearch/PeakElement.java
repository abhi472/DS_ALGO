package binarySearch;

public class PeakElement {
    
    public static void main(String args[]) {
        int arr[] = {1,8,1,5,3}; 
        System.out.println(getPeak(arr, arr.length));
    }

    public static int getPeak(int[] arr, int n) {
        int start = 0;
        int end = n -1;
        while(end>=start) {
            int mid = (start + end)/2;
            if ((mid == 0 || arr[mid]>= arr[mid - 1]) && (mid == n-1 || arr[mid]>= arr[mid + 1])) 
                return mid;
            if (mid > 0 && arr[mid - 1] >= arr[mid]) 
                end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
