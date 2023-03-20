package leetcode.arrays.problem605;

public class FlowerPlacement {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, length = flowerbed.length;
        if (n == 0) {
            return true;
        }
        if (length == 1) {
            return flowerbed[0] == 0 && n == 1;
        }
        while (i < length) {
            if (i != 0 && (i + 1 < length) && flowerbed[i] == 0) {
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else if (i + 1 == length && flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            } else if (flowerbed[i] == 0 && (i + 1 < length) && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
            if (n == 0) {
                return true;
            }
            i++;
        }
        return false;
    }
}
