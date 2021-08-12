import java.util.*;
public class Solution {
    public static int PairSum(int[] input, int size) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int finalCount=0;
        for(int i=0; i<size; i++) {
            int key = input[i];
            if(h.containsKey(key)) {
                int value = h.get(key);
                h.put(key, value+1);
                //incrementing frequency value by 1 if key is already present in hashmap 
            } else {
                h.put(key, 1); 
                
                //initializing frequency value to 1 if key is not already present in hashmap
            }
        } 
        //traversing the array and checking if -key is present in hashmap 
        for(int i=0; i < size; i++) { 
            int key = input[i];
            if(h.containsKey(-key) && h.get(key)!=0) {
                int times;
                if (key == (-key)) {
                    //True in case of zero
                    int occurences = h.get(key);
                    times = (occurences * (occurences - 1)) / 2;
                    finalCount = finalCount+times;
                    h.put(key, 0);
                    continue;
                }
                times = h.get(key) * h.get(-key);
                finalCount = finalCount+times;
                h.put(key, 0);
                h.put(-key, 0);
            } 
        } 
        return finalCount; 
    }
}
