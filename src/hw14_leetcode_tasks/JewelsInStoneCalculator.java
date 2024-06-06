package hw14_leetcode_tasks;

public class JewelsInStoneCalculator {
    //On
    public int numJewelsInStoneOneLoop(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) { // On
            if (jewels.indexOf(stones.charAt(i)) != -1)
                count++;
        }
        return count;
    }

    //On2
    public int numJewelsInStoneTwoLoops(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) { // On2
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
