package testing.utils;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class DateUtils {

    public boolean isCurrent(LocalDateTime startDate, LocalDateTime endDate) {
        if (startDate.isBefore(now()) && now().isBefore(endDate)) {
            return true;
        } else {
            return false;
        }
    }
}
