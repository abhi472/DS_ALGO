package interview;
import java.util.HashMap;
public class TripletSum
{
    public static void main(String[] args) {
        Integer[] arr = {1, 0, -1, 2, 4, 5, 3, 2};
        int sum = 4;

        for(int i = 0; i< arr.length; i++) {
            HashMap<Integer, Integer> locMap = new HashMap<>();
            int locSum = sum - arr[i];

            for (int j = i + 1; j< arr.length; j++) {
                int fSum = locSum - arr[j];

                if (locMap.get(fSum) != null) {
                     System.out.println(arr[i]+" "+ arr[j]+ " "+ fSum +" ");
                } else {
                    locMap.put(arr[j], 1);
                }
            }

        }
        
     }
}