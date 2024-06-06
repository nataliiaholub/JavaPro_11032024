package hw14_leetcode_tasks;

public class IdenticalPairsCalculator {

    public int identicalPairs(int[] nums) {
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
}
