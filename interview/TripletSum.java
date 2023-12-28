package interview;
import java.util.HashMap;
public class TripletSum
{
    public static void main(String[] args) {
        Integer[] arr = {1, 0, -1, 2, 4, 5, 3, 2};
        int sum = 4;
        
        

        for(int i = 0; i< arr.length; i++) {
            int locSum = sum;
            HashMap<Integer, Integer> locMap = getMap(arr, i);
            locSum-=arr[i];
            locMap.put(arr[i], locMap.get(arr[i])-1);
            for(int j = i+1; j< arr.length; j++) {
                int fSum = locSum - arr[j];
                if(locMap.get(fSum) != null && locMap.get(fSum) > 0 
                        && locMap.get(arr[j]) != null && locMap.get(arr[j]) > 0) {
                    locMap.put(arr[j], locMap.get(arr[j])-1);
                    locMap.put(fSum, locMap.get(fSum) -1);
                    System.out.println(arr[i]+" "+ arr[j]+ " "+ fSum +" ");
                }
            }
            
            
        }
    }

    public static HashMap<Integer, Integer> getMap(Integer[] arr, int index) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = index; i< arr.length; i++) {
            int count = 0;
            if(map.get(arr[i]) != null) 
                count = map.get(arr[i]);
            map.put(arr[i], count+1);
            
        }

        return map;
    }
}