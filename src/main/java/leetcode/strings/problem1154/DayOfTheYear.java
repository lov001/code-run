package leetcode.strings.problem1154;

import java.time.Duration;
import java.time.LocalDateTime;

public class DayOfTheYear {

    public int dayOfYear(String strDate) {
        LocalDateTime startDate = LocalDateTime.of(Integer.parseInt(strDate.substring(0, 4)), 1, 1,
            0, 0);
        LocalDateTime endDate = LocalDateTime.of(Integer.parseInt(strDate.substring(0, 4)),
            Integer.parseInt(strDate.substring(5, 7)),
            Integer.parseInt(strDate.substring(8, 10)), 0, 0);
        return (int) Duration.between(startDate, endDate).toDays() + 1;
    }
}
