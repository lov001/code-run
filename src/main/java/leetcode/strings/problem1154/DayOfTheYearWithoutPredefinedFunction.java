package leetcode.strings.problem1154;

import java.util.Arrays;

public class DayOfTheYearWithoutPredefinedFunction {

    public int dayOfYear(String strDate) {
        int[] dateElements = Arrays.stream(strDate.split("-"))
            .mapToInt(Integer::parseInt).toArray();
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (dateElements[1] == 1) {
            return dateElements[2];
        }
        int days = 0;
        for (int i = 0; i < dateElements[1] - 1; i++) {
            days += daysInMonth[i];
        }
        return days + dateElements[2] + (isLeapYear(dateElements[0]) && dateElements[1] > 2 ? 1
            : 0);
    }

    private boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
