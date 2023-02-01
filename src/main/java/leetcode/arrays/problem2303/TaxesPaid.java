package leetcode.arrays.problem2303;

public class TaxesPaid {

    public double calculateTax(int[][] brackets, int income) {
        double totalTaxes = 0.00000, decimalMultiplier = 0.01000;
        int bracketsLength = brackets.length, i;
        if (income <= 0) {
            return totalTaxes;
        }
        for (i = 0; i < bracketsLength; i++) {
            if (i == 0 && brackets[i][0] <= income) {
                totalTaxes += (brackets[i][0] * brackets[i][1] * decimalMultiplier);
                income -= brackets[i][0];
                continue;
            }
            if ((i - 1) >= 0 && (brackets[i][0] - brackets[i - 1][0]) <= income) {
                totalTaxes += ((brackets[i][0] - brackets[i - 1][0]) * (brackets[i][1]
                    * decimalMultiplier));
                income -= brackets[i][0] - brackets[i - 1][0];
            } else {
                break;
            }
        }
        if (income > 0) {
            totalTaxes += income * brackets[i >= bracketsLength ? i - 1 : i][1] * decimalMultiplier;
        }
        return totalTaxes;
    }
}
