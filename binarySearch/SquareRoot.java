package binarySearch;

public class SquareRoot {
    public static void main(String args[]) {
        int k = 256;
        System.out.println(squareRoot(k));

    }
        public static int squareRoot(int k) {
        int first = 0;
        int end = k;
        while(first <= end) {
            int mid = (first + end)/2;
            if(mid*mid == k) {
                 return mid;
            } else if(mid*mid > k){
                end = mid - 1;
            } else first = mid + 1;
        }
        return -1;

    }
          
}