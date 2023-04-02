package leetcode.arrays.problem2300;

public class SpellAndPortions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int count = 0;
            for (int portion : potions) {
                if ((long) spells[i] * portion >= success) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
