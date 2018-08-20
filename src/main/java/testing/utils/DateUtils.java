package testing.utils;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class DateUtils {

    public boolean isCurrent(LocalDateTime startDate) {
        if (now().isBefore(startDate)) {
            return false;
        } else {
            return true;
        }
    }
}
