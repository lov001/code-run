package leetcode.arrays.problem2303;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxesPaidTest {

    TaxesPaid classObj = new TaxesPaid();

    @Test
    void test_calculateTax_expect_when() {
        int[][] brackets = {{3, 50}, {7, 10}, {12, 25}};
        int income = 10;
        Assertions.assertEquals(2.65, classObj.calculateTax(brackets, income));
    }
}
