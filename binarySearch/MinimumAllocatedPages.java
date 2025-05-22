package binarySearch;

/*Minimum allocated pages from m books to n students */

public class MinimumAllocatedPages {
//    public static void main(String args[]) {
//    int arr[] = {10, 5, 30, 1, 2, 5, 10, 10};
//    int n = arr.length;
//    int maxSumVal[] = getMax(arr, n);
//    int min = maxSumVal[0];
//    int max = maxSumVal[1];
//    int minSum = Integer.MAX_VALUE;
//    int mid = 0;
//
//    while(mid <= sum) {
//        mid = (min+max)/2;
//        sum = 0;
//        int count = 0;
//        for(int i = 0; i< n; i++) {
//            if (sum + arr[i] <= mid)
//                sum+=arr[i];
//            else {
//                count++;
//                minSum = minSum > sum ? sum : minSum;
//               // mid = arr[i]/;
//            }
//
//
//        }
//
//
//    }
//
//    System.out.print(maxSum);
//
//}

public static int[] getMax(int[] arr, int n) {

    int maxSum[] = {Integer.MIN_VALUE, 0};
    for (int i = 0; i< n; i++) {
        maxSum[1] += arr[i];
        if (arr[i] > maxSum[0])
        maxSum[0] = arr[i];
    }
    return maxSum;

}

}
