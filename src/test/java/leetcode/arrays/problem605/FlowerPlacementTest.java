package leetcode.arrays.problem605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlowerPlacementTest {

    FlowerPlacement classObj = new FlowerPlacement();
    FlowerPlacementApproach2 classObj2 = new FlowerPlacementApproach2();

    @Test
    void test_canPlaceFlowers_expectTrue_whenFlowerCanBePlaced() {
        int[] flowerBed = {1, 0, 0, 0, 1};
        Assertions.assertTrue(classObj.canPlaceFlowers(flowerBed, 1));
        Assertions.assertTrue(classObj2.canPlaceFlowers(flowerBed, 1));
    }

    @Test
    void test_canPlaceFlowers_expectFalse_whenFlowerCannotBePlaced() {
        int[] flowerBed = {1, 0, 0, 0, 1};
        Assertions.assertFalse(classObj.canPlaceFlowers(flowerBed, 2));
        Assertions.assertFalse(classObj2.canPlaceFlowers(flowerBed, 2));
    }

    @Test
    void test_canPlaceFlowers_expectFalse_whenFlowerCannotBePlaced2() {
        int[] flowerBed = {1, 0, 0, 0, 0, 1};
        Assertions.assertFalse(classObj.canPlaceFlowers(flowerBed, 2));
        Assertions.assertFalse(classObj2.canPlaceFlowers(flowerBed, 2));
    }

    @Test
    void test_canPlaceFlowers_expectTrue_whenFlowerCanBePlaced2() {
        int[] flowerBed = {1, 0, 0, 0, 1, 0, 0};
        Assertions.assertTrue(classObj.canPlaceFlowers(flowerBed, 2));
        Assertions.assertTrue(classObj2.canPlaceFlowers(flowerBed, 2));
    }

    @Test
    void test_canPlaceFlowers_expectFalse_whenFlowerCannotBePlaced3() {
        int[] flowerBed = {1, 0};
        Assertions.assertFalse(classObj.canPlaceFlowers(flowerBed, 1));
        Assertions.assertFalse(classObj2.canPlaceFlowers(flowerBed, 1));
    }
}
