package leetcode.arrays.problem605;

public class FlowerPlacementApproach2 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        if (n == 0) {
            return true;
        }
        if (length == 1) {
            return flowerbed[0] == 0 && n == 1;
        }
        for (int i = 0; i < length && n > 0; i++) {
            if (flowerbed[i] == 0) {
                int next = (i == length - 1) ? 0 : flowerbed[i + 1];
                int prev = (i == 0) ? 0 : flowerbed[i - 1];
                if (next == 0 && prev == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n == 0;
    }
}
