package leetcode.arrays.problem2303;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxesPaidTest {

    TaxesPaid classObj = new TaxesPaid();

    @Test
    void test_calculateTax_expectTwoPointSixFive_whenIncomeIs10() {
        int[][] brackets = {{3, 50}, {7, 10}, {12, 25}};
        int income = 10;
        Assertions.assertEquals(2.65, classObj.calculateTax(brackets, income));
    }

    @Test
    void test_calculateTax_expectZeroPointTwoFive_whenIncomeIs2() {
        int[][] brackets = {{1, 0}, {4, 25}, {5, 50}};
        int income = 2;
        Assertions.assertEquals(0.25, classObj.calculateTax(brackets, income));
    }

    @Test
    void test_calculateTax_expectZeroPointZero_whenIncomeIs0() {
        int[][] brackets = {{2, 50}};
        int income = 0;
        Assertions.assertEquals(0.00, classObj.calculateTax(brackets, income));
    }

    @Test
    void test_calculateTax_expectZeroPointZeroFive_whenIncomeIs5() {
        int[][] brackets = {{10, 10}};
        int income = 5;
        Assertions.assertEquals(0.5, classObj.calculateTax(brackets, income));
    }
}
