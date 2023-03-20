package leetcode.arrays.problem605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlowerPlacementTest {

    FlowerPlacement classObj = new FlowerPlacement();

    @Test
    void test_canPlaceFlowers_expectTrue_whenFlowerCanBePlaced() {
        int[] flowerBed = {1, 0, 0, 0, 1};
        Assertions.assertTrue(classObj.canPlaceFlowers(flowerBed, 1));
    }

    @Test
    void test_canPlaceFlowers_expectFalse_whenFlowerCannotBePlaced() {
        int[] flowerBed = {1, 0, 0, 0, 1};
        Assertions.assertFalse(classObj.canPlaceFlowers(flowerBed, 2));
    }
}
