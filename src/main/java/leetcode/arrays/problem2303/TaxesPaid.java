package leetcode.arrays.problem2303;

public class TaxesPaid {

    public double calculateTax(int[][] brackets, int income) {
        double totalTaxes = 0.00000, decimalMultiplier = 0.01000;
        int cumulativeIncome = 0, bracketsLength = brackets.length, i;
        if (income <= 0) {
            return totalTaxes;
        }
        for (i = 0; i < bracketsLength; i++) {
            if (i == 0 && brackets[i][0] <= income) {
                totalTaxes += (brackets[i][0] * brackets[i][1] * decimalMultiplier);
                cumulativeIncome += brackets[i][0];
                continue;
            }
            if ((brackets[i][0] <= income)
                && ((brackets[i][0] - brackets[i - 1][0]) + cumulativeIncome <= income)) {
                totalTaxes += ((brackets[i][0] - brackets[i - 1][0]) * (brackets[i][1]
                    * decimalMultiplier));
                cumulativeIncome += brackets[i][0] - brackets[i - 1][0];
            } else {
                break;
            }
        }
        if (cumulativeIncome != income) {
            totalTaxes += (income - cumulativeIncome) * brackets[i >= bracketsLength ? i - 1 : i][1]
                * decimalMultiplier;
        }
        return totalTaxes;
    }
}
