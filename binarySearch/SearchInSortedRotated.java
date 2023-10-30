package binarySearch;

public class SearchInSortedRotated {
    
    public static void main(String args[]) {
        int[] arr = {6,7,8,10,12,14,15,17,18,21,22,1,2,3,4,5};
        int k = 4;
        System.out.println(searchInSortedRotated(arr, arr.length, k));
    }

    public static int searchInSortedRotated(int[] arr, int n, int k) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(arr[mid] == k) return mid;
            if(arr[start]<=arr[mid]) {
                if(k >= arr[start] && k < arr[mid])
                    end = mid -1;
                else start = mid +1;
            } else {
                if(k>arr[mid] && k<=arr[end])
                    start = mid+1;
                else end = mid -1;
            }
        } return -1;

    }
}
