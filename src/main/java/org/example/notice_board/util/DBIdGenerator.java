package org.example.notice_board.util;

import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

public class DBIdGenerator {
    public static long makeId() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTimeInMillis() * 10L + ThreadLocalRandom.current().nextInt(0, 9 + 1);
    }
}
