package leetcode.arrays.problem2300;

import java.util.Arrays;

public class SpellAndPortions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, m = potions.length;
        Arrays.sort(potions);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int low = 0, high = m - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (((long) potions[mid] * spell) >= success) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            ans[i] = m - low;
        }
        return ans;
    }
}
