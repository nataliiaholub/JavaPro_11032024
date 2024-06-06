package hw14_leetcode_tasks;
import java.util.HashMap;
import java.util.Map;


public class IdenticalPairsCalculator {

    public int identicalPairsTwoLoops(int[] nums) {
        int counter = 0;
        for(int i = 0; i < nums.length -1; i++){
            for(int j = i + 1; j < nums.length; j++ ){ //On2
                if(nums[j] == nums[i]){
                    counter++;
                }
            }
        }
        return counter;
    }

    public int identicalPairsMap(int[] nums) {
        int counter = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){ //On
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int n = entry.getValue();
            counter += n * (n - 1) / 2;
            }
        return counter;
        }
    }
