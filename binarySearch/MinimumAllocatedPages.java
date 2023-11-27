package binarySearch;

public class MinimumAllocatedPages {
    public static void main(String args[]) {
    int arr[] = {10, 5, 30, 1, 2, 5, 10, 10};
    int n = arr.length;
    int maxSum[] = getMax(arr, n);
    int max = maxSum[0];
    int sum = maxSum[1];

//     while(max <= sum) {
//         int mid = (max + sum) / 2;
//         sum = 0;
//         maxSum = 0;
//         int count = 0;
//         for(int i = 0; i< n; i++) {
//             if (sum + arr[i] <= mid)
//                 sum+=arr[i];
//             else {
//                 count++;
//                 maxSum = maxSum > sum ? maxSum : sum;
//                 sum = arr[i];
//             }
            

//         }
         

//     }

// }

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
