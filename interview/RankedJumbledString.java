package interview;

import java.util.HashMap;

/*given string ronal3do th1is fr4om i2s portug5al
 * turn it into this is ronaldo from portugal
 */
public class RankedJumbledString {
    
    public static void main(String[] args) {
    String str = "ronal3do th1is fr4om i2s portug5al";
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for(int i = 1; i<10; i++) {
        map.put(Character.forDigit(i, 10), i-1);
    }


    String[] arr = str.split(" ");
    int j = arr.length;
    String[] tempArr = new String[j];

    for(int i = 0; i< j; i++) {
        String tempString = arr[i];
        int n = tempString.length();
        for(int k = 0; k< n; k++) {
            char tempChar = tempString.charAt(k);
            if(map.get(tempChar) != null) {
                StringBuilder rem = new StringBuilder(tempString);
                rem.deleteCharAt(k);
                tempArr[map.get(tempChar)] = rem.toString();
            }
        }
    }

    StringBuilder finalString = new StringBuilder();
    for(int i = 0; i< j; i++) {
        finalString.append(tempArr[i]);
        if(i != j-1)
        finalString.append(" ");

    }

    System.out.println(finalString.toString());
}


}
