import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		Map<Integer, Boolean> visitedElements = new HashMap<>();
        Map<Integer, Integer> elementToIndexMapping = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            elementToIndexMapping.put(num, i);
            if(!visitedElements.containsKey(num)) {
                visitedElements.put(num, false);
            } 
        }
        ArrayList<Integer> longestSequence = new ArrayList<>();
        int globalMaxSequenceLength = 1;
        int globalMinStartIndex = 0;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int currentMinStartIndex = i;
            int count = 0;
            int tempNum = num;
            //Forward
            while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)){
                visitedElements.put(tempNum, true);
                //Mark Visited elements in the array as true
                count++;
                tempNum++;
            }
            //Backward
            tempNum = num-1;
            while(visitedElements.containsKey(tempNum) && !visitedElements.get(tempNum)){
                visitedElements.put(tempNum, true);
                //Mark Visited elements in the array as true
                count++;
                currentMinStartIndex = elementToIndexMapping.get(tempNum);
                tempNum--;
            } 
            if(count > globalMaxSequenceLength){
                globalMaxSequenceLength = count;
                globalMinStartIndex = currentMinStartIndex;
            } else if(count == globalMaxSequenceLength) {
                if(currentMinStartIndex < globalMinStartIndex) {
                    globalMinStartIndex = currentMinStartIndex;
                }
            } 
        } 
        int globalStartNum = arr[globalMinStartIndex];
        longestSequence.add(globalStartNum); 
        if(globalMaxSequenceLength>1){ 
            longestSequence.add(globalStartNum + globalMaxSequenceLength-1);
        } 
        return longestSequence;
}
}
