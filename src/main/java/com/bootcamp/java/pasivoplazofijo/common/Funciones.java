package com.bootcamp.java.pasivoplazofijo.common;

import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;
import java.util.Date;

@Slf4j
public class Funciones {
    public static Date GetFirstDayOfCurrentMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        // set day to minimum
        calendar.set(Calendar.DAY_OF_MONTH,
                calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        log.info("Calendar date: " + calendar.getTime());
        return calendar.getTime();
    }

    public static Date GetCurrentDate(){
        Date currentDate = new Date();
        return currentDate;
    }
}
