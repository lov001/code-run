package leetcode.strings.problem1154;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayOfTheYear {

    public int dayOfYear(String strDate) {
        List<Integer> dateElements = Arrays.stream(strDate.split("-")).map(Integer::parseInt)
            .collect(Collectors.toList());
        LocalDateTime startDate = LocalDateTime.of(dateElements.get(0), 1, 1, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(dateElements.get(0), dateElements.get(1),
            dateElements.get(2), 0, 0);
        return (int) Duration.between(startDate, endDate).toDays() + 1;
    }
}
