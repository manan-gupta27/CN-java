import java.util.*;
public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	HashMap<Integer,Integer> map = new HashMap<>(arr.length);
         for(int num : arr)
    {
        Integer occurrence = map.get(num);
     
        // if occurrence is null, set it to 1, 
        // else increment the occurrence
        map.put(num, occurrence==null ? 1 : occurrence+1);
    }
     
    // traversing entryset to find the key with occurrence == 1
    for(Map.Entry<Integer, Integer> e : map.entrySet())
    {
        if(e.getValue() > 1)
        {
            return e.getKey();
        }
    }
 
    return -1;
    }
}
