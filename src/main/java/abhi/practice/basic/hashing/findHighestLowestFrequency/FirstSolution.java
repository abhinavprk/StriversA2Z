package abhi.practice.basic.hashing.findHighestLowestFrequency;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstSolution {
    public static void main(String[] args) {
        int [] array = {10, 5, 10, 15, 10, 5};
        findHighestAndLowestFrequencyNumber(array);
        System.out.println();
        int [] array1 = {2, 2, 3, 4, 4, 2};
        findHighestAndLowestFrequencyNumber(array1);
    }

    private static void findHighestAndLowestFrequencyNumber(int[] array) {
        Map<Integer,Integer> hash = new HashMap<>();
        for (Integer val: array){
            int currentVal = hash.get(val) != null ? hash.get(val) : 0;
            hash.put(val, currentVal +1);
        }
        int lowestFrequency = Integer.MAX_VALUE;
        int highestFrequency = Integer.MIN_VALUE;
        int numberWithHighestFrequency = 0;
        int numberWithLowestFrequency = 0;
        Set<Integer> visited = new HashSet<>();
        for (int val: array){
            if(!visited.contains(val)) {
                visited.add(val);
                int frequency = hash.get(val);
                if (frequency > highestFrequency) {
                    highestFrequency = frequency;
                    numberWithHighestFrequency = val;
                } else if (frequency < lowestFrequency) {
                    lowestFrequency = frequency;
                    numberWithLowestFrequency = val;
                }
            }
        }
        System.out.println(numberWithHighestFrequency +  "    " + numberWithLowestFrequency );
    }
}
